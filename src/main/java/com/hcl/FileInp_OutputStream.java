package com.hcl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInp_OutputStream {

	public static void main(String[] args) throws IOException {
	
		//Writing the Data to the file
		String str = "This is an example for writing Data onto the file";
		byte[] b = str.getBytes(); //Converting the String into byte Arrays
		FileOutputStream fos = new FileOutputStream("hcl.txt");
		for(int i=0;i<b.length;i++) {
			fos.write((char) b[i]);
		}
		
        System.out.println("File Data Written successfully");
	
        //Reading the Data from the file
        
	    FileInputStream fis = new FileInputStream("hcl.txt");
	    int n = fis.available();
	    for(int i=0;i<n; i++) {
	    	System.out.print((char)fis.read());
	    }
	    System.out.println("File is Read properly");
	}
}
