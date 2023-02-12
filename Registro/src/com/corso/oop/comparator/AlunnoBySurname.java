package com.corso.oop.comparator;

import java.util.Comparator;
import com.corso.oop.entities.*;

public class AlunnoBySurname implements Comparator<Alunno>{

	@Override
	public int compare(Alunno o1, Alunno o2) {
		int i = o1.getCognome().compareToIgnoreCase(o2.getCognome());
		
		if (i!=0)
			return i;
		
		i=o1.getNome().compareToIgnoreCase(o2.getNome());
		
		if (i!=0)
			return i;
		
		return o1.getMATRICOLA()-o2.getMATRICOLA();
	}
}
