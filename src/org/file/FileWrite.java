package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Jebin Arockia A\\File Operations\\8am\\newfile\\\\file11.txt");
		FileUtils.write(f, "welcome to the class jebin");
		FileUtils.write(f, "welcome to selenium class", false);
		FileUtils.write(f, " welcome to python", true);
		List<String> lines = FileUtils.readLines(f);
		for (String a : lines) {
			System.out.println(a);
			
		}
	}

}
