package org.file;

import java.io.File;

public class Files {
	public static void main(String[] args) {
		
		File f = new File("C:\\");
		File[] s = f.listFiles();
		for (File z : s) {
			System.out.println(z);
		}
		String[] s1 = f.list();
		for (String z1 : s1) {
			System.out.println(z1);
			
		}
		
	}

}
