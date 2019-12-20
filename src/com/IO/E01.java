package com.IO;
import java.io.*;
public class E01 {

	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("d:\\test.txt");
		int b=0;
		while((b=in.read()) !=-1) {
			System.out.println(b);
		}
		in.close();
		
		FileOutputStream out=new FileOutputStream("out.txt");
		String str="hello";
		out.write(str.getBytes());
		out.close();
	}

}
