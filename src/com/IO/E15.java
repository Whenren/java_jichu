package com.IO;

import java.io.*;

public class E15 {

	public static void main(String[] args) {
		File file=new File("E:\\软件java\\java_jichu\\src\\com\\IO");
		fileDir(file);
	}
	public static void fileDir(File file) {
		File[]listFiles=file.listFiles();
		for(File files:listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}

}
