package com.hcl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		//Writing the data in form of character to the file. 
		FileWriter fw = new FileWriter("Employee.txt");
		String str = "Learning java is easy";
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++) {
			fw.write(c[i]);
		}
		fw.close();
        System.out.println("Character stream is stored in the file");
        
        //Reading the data as character from the file 
        FileReader fr = new FileReader("Employee.txt");
        char c1[] = new char[50];
        fr.read(c1);
        for(char x: c1) {
        	System.out.print(x);
        }
	}
	

}
