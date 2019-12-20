package com.IO;

import java.io.*;

public class E07 {

	public static void main(String[] args) throws Exception{
		FileReader fileReader=new FileReader("d:\\reader.txt");
		int len=0;
		while((len=fileReader.read())!=-1) {
			System.out.print((char)len);
		}
		fileReader.close();
		
		FileWriter fileWriter=new FileWriter("d:\\writer.txt");
		fileWriter.write("轻轻地我走了,\r\n");
		fileWriter.write("正如我轻轻的来了,\r\n");
		fileWriter.write("我轻轻的招手,\r\n");
		fileWriter.write("作别西天的云彩,\r\n");
		
		fileWriter.close();
	}

}
