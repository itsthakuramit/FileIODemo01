package com.hcl;

import java.io.File;
import java.io.IOException;

public class File_Demo {

	public static void main(String[] args) throws IOException {
	   
		File f1 = new File("shan.txt");
		boolean b = f1.createNewFile(); // creates a new file
		System.out.println(f1.getName()); //prints the name of the File.class
		System.out.println(f1.getAbsolutePath()); //display the path of file from the root
		System.out.println(f1.exists());// To check existence of the file
		System.out.println(f1.getParent());
		System.out.println(f1.isFile()); // To check if it is a file or not
		System.out.println(f1.isDirectory()); //To check if it is a file or directory
		
	}

}
