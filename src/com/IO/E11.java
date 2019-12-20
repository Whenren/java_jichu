package com.IO;
import java.io.*;
public class E11 {

	public static void main(String[] args) throws Exception{
		FileInputStream in=new FileInputStream("d:\\reader.txt");
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream out=new FileOutputStream("d:\\writer.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(osw);
		String line=null;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();

	}

}
