package org.file;

import java.io.File;
import java.io.IOException;

public class Fille {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Jebin Arockia A\\File Operations\\8am\\newfile\\file11.txt");
		
		//to create a folder
		//boolean a = f.mkdir();
		//System.out.println(a);
		
		//create a folder inside the folder
		//boolean b = f.mkdirs();
		//System.out.println(b);
		
		//create a new file
		boolean c = f.createNewFile();
		System.out.println(c);
		
		//to check whether we can write in a file or not
		boolean write = f.canWrite();
		System.out.println(write);
		
		//to check whether we can read from file or not
		boolean read = f.canRead();
		System.out.println(read);
		
		//whether we can execute this file or not
		boolean execute = f.canExecute();
		System.out.println(execute);
		
		//to check whther it is a file or not
		boolean file = f.isFile();
		System.out.println(file);
		
		//to check whether it is a file or not
		boolean folder = f.isDirectory();
		System.out.println(folder);
		
		//to check whether a file is still existing or  not
		boolean exists = f.exists();
		System.out.println(exists);
		
		// to check whether file is visible or it is hidden
		boolean hidden = f.isHidden();
		System.out.println(hidden);
	}

}
