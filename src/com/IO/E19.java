package com.IO;

import java.nio.channels.FileChannel;
import java.io.*;
public class E19 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile infile=
								new RandomAccessFile("source/src.jpg","rw");
		FileChannel inChannel=infile.getChannel();
		RandomAccessFile outfile=
				new RandomAccessFile("target/dest.jpg","rw");
		FileChannel outChannel=outfile.getChannel();
		long transferTo=inChannel.transferTo(0,inChannel.size(),outChannel);
		if(transferTo>0) {
			System.out.println("复制成功!");
		}
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
		

	}

}
