package com.jdbc;

import java.io.File;

public class Input_shili {

	public static void main(String[] args) {
		File mulu=new File("d:\\tice");
		File[] files=mulu.listFiles();
	    System.out.println("一共有"+files.length+"个文件");
	    for(File file:files) {
	    	dqbxrmgwj(file);
	    }

	}

	private static void dqbxrmgwj(File file) {
		// TODO 自动生成的方法存根
		
	}

}
