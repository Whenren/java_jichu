package com.IO;

import java.io.File;
import java.util.Arrays;
public class E13 {

	public static void main(String[] args) {
		File file=new File("E:\\软件java\\java_jichu\\src\\com\\IO");
		if (file.isDirectory()) {
			String[]fileNames=file.list(
					(dir,name)->name.endsWith(".java"));
			Arrays.stream(fileNames)
				.forEach(f->System.out.println(f));
		}

	}

}
