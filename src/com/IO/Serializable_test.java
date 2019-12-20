package com.IO;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class Serializable_test {

	public static void main(String[] args) throws Exception {
		Person p1=new Person("Mike",20);
		FileOutputStream fout=new FileOutputStream("person,txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(p1);
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("person,txt"));
		Person p=(Person) oin.readObject();
		System.out.println(p);
		

	}
}



