package com.hcl;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    //Writing the Data to the file is serialization
		FileOutputStream fs = new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		Student s = new Student(1001,"Shankar");
		oos.writeObject(s);
		
		//Reading the Data from the file is De-serialization
		FileInputStream fi = new FileInputStream("studentdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Student st = (Student) ois.readObject();
		System.out.println(st.getRollno());
		System.out.println(st.getName());
		
	}

}
