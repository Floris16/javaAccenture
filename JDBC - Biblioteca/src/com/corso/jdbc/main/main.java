package com.corso.jdbc.main;

import com.corso.jdbc.query.TestQuery;

public class main {

	public static void main(String[] args) {
		TestQuery test = new TestQuery();
		test.insert();
		test.select();
	}

}
