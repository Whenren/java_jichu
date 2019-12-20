package com.IO;

import java.io.*;

public class E17 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("times.txt","rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if(times>0) {
			raf.seek(0);
			raf.write((times+"").getBytes());
		}else {
			System.out.println("试用次数已经用完");
		}
		raf.close();

	}

}
