package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class E04 {

	public static void main(String[] args) throws Exception{
		FileInputStream in=new FileInputStream("d:\\1.jpg");
		FileOutputStream out=new FileOutputStream("d:\\2.jpg");
		int len=0;
		byte[] buff=new byte[1024];
		long beginTime=System.currentTimeMillis();
		while((len=in.read(buff))!=-1) {
			out.write(buff,0,len);
		}
		long endTime =System.currentTimeMillis();
		System.out.println("花费时间为:"+(endTime-beginTime)+"毫秒");
		in.close();
		out.close();
	}

}
