package com.IO;

import java.io.BufferedReader;
import java.io.*;

public class E10 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(
				new FileReader("d:\\reader.txt"));
		BufferedWriter bw=new BufferedWriter(
				new FileWriter("d:\\writer.txt"));
		String str=null;
		while((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
		}
		br.close();
		bw.close();
		}

	}

