package com.blob;

import java.util.ArrayList;
import java.util.List;

public class JavaTest {

	
	public static void main(String[] args) {
		
		List<String> ids = new ArrayList<String>();
		ids.add("1");
		ids.add("2");
		ids.add("3");
		ids.add("4");

		// CSV format
		/*String csv = ids.toString().replace("[", "").replace("]", "").replace(", ", ",");

		
		System.out.println("  csv   "+csv);*/
		
		// CSV format surrounded by single quote 
		// Useful for SQL IN QUERY

		String csvWithQuote = ids.toString().replace("[", "'").replace("]", "'").replace(", ", "','");
		
		System.out.println("  csvWithQ   "+csvWithQuote);
	}
}
