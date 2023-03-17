package menu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

import com.corso.bibliotecadao.dao.*;
import com.corso.bibliotecadao.entities.*;
import com.corso.bibliotecadao.utils.DbConnection;

import utility.Utility;

public class Menu {

	public static void show() {
		int scelta = 0;
		PrestitoDao prestitodao = new PrestitoDao();
		UtenteDao utentedao = new UtenteDao();
		LibroDao librodao = new LibroDao();
		String msg = "Ciao, cosa vuoi fare?\n" + "1) Inserisci nuovo utente nel database\n"
				+ "2) Inserisci nuovo libro nel database\n" + "3) Chiedi in prestito un libro \n"
				+ "4) Stampa lista utenti \n" + "5) Stampa lista libri \n" + "6) Stampa lista prestiti\n"
				+ "7) Aggiorna libro \n" + "8) Aggiorna utente \n" + "9) Restituisci libro \n" + " Premi 0 per uscire";

		do {
			System.out.println(msg);
			scelta = Utility.scanInt();
			switch (scelta) {
			case 1:
				String nome = Utility.scanString("Inserisci il nome dell' utente\n");
				String cognome = Utility.scanString("Inserisci il cognome dell' utente\n");

				Utente u = new Utente(nome, cognome);
				try {
					utentedao.insert(u);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				String titolo = Utility.scanString("Inserisci il titolo del libro\n");
				String autore = Utility.scanString("Inserisci l' autore del libro\n");
				String isbn = Utility.scanString("Inserisci l' isbn del libro\n");

				Libro l = new Libro(titolo, autore, isbn);
				try {
					librodao.insert(l);
				} catch (SQLException e) {
					System.err.println("isbn non valido\n");
				}
				break;
			case 3:
				// cerco l utente nel database
				Utente u1 = Menu.cercaUtente(utentedao);
				// cerco il libro nel database
				Libro l1 = Menu.cercaLibro(librodao);
				Prestito p1 = new Prestito(l1, u1, LocalDate.now());

				try {
					if (prestitodao.findNonRestituiti(l1) == false) {
						prestitodao.insert(p1);
						p1.toString();
						break;
					}
				System.err.println("Libro non ancora restituito, IMPOSSIBILE prestarlo");
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case 4:
				utentedao.stampaUtenti();
				break;
			case 5:
				librodao.stampaLibri();
				break;
			case 6:
				prestitodao.stampaPrestiti();
				break;
			case 7:
				long idLibroDaAggiornare = Utility.scanInt("Inserisci l'id del libro da aggiornare\n");
				Libro lDaAggiornare = null;
				long idNewLibro = 0;
				try {
					lDaAggiornare = librodao.find(idLibroDaAggiornare);
					if (lDaAggiornare == null) {
						System.err.println("Libro non presente nel database");
						break;
					}
					idNewLibro = lDaAggiornare.getIdLibro();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				String titolo1 = Utility.scanString("Inserisci il titolo del libro\n");
				String autore1 = Utility.scanString("Inserisci l' autore del libro\n");
				String isbn1 = Utility.scanString("Inserisci l' isbn del libro\n");

				Libro newL = new Libro(idNewLibro, titolo1, autore1, isbn1);
				try {
					librodao.update(newL);
				} catch (SQLException e) {
					e.printStackTrace();
					System.err.println("isbn non valido\n");
				}
				break;
			case 8:
				long idUtenteDaAggiornare = Utility.scanInt("Inserisci l'id dell' utente da aggiornare\n");
				Utente uDaAggiornare = null;
				long idNewUtente = 0;
				try {
					uDaAggiornare = utentedao.find(idUtenteDaAggiornare);
					if (uDaAggiornare == null) {
						System.err.println("Libro non presente nel database");
						break;
					}
					idNewUtente = uDaAggiornare.getIdUtente();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				String newNome = Utility.scanString("Inserisci il titolo del libro\n");
				String newCognome = Utility.scanString("Inserisci l' autore del libro\n");

				Utente newU = new Utente(idNewUtente, newNome, newCognome);
				try {
					utentedao.update(newU);
				} catch (SQLException e) {
				}
				break;
			case 9:
				long idLibroDaRestituire = Utility.scanInt("Inserisci l'id del libro da restituire\n");
				String dataRestituzioneNull2 = "SELECT * " + "FROM  PRESTITO P " + "WHERE p.data_restituzione IS null ";
				Prestito agg = null;
				try {
					List<Prestito> libriNonRestituiti = prestitodao.select(dataRestituzioneNull2);
					for (Prestito p : libriNonRestituiti)
						if (p.getLibro().getIdLibro() == idLibroDaRestituire) {
							agg = new Prestito(p.getIdPrestito(), p.getLibro(), p.getUtente(), p.getDataInizio(),
									LocalDate.now());
							prestitodao.update(agg);

						}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				if (scelta != 0)
					System.out.println("Hai inserito il numero sbagliato");
				else
					System.out.println("Arrivederci");
				break;

			}

		} while (scelta != 0);
		
		DbConnection.close();
		
	}

	public static Libro cercaLibro(LibroDao librodao) {
		System.out.println("Inserisci l' id del libro\n");
		long idLibro = Utility.scanInt();
		Libro l1 = null;
		try {
			l1 = librodao.find(idLibro);
			if (l1 == null) {
				System.err.println("Libro non trovato");
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l1;
	}

	public static Utente cercaUtente(UtenteDao utentedao) {
		System.out.println("Inserisci l' id dell' utente\n");
		long idUtente = Utility.scanInt();
		Utente u1 = null;
		try {
			u1 = utentedao.find(idUtente);
			if (u1 == null) {
				System.err.println("Utente non trovato");
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u1;
	}
}