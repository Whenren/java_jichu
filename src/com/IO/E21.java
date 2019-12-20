package com.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class E21 {

	public static void main(String[] args)throws IOException {
		Path directoryPath=Paths.get("D:/test/sample");
		Files.createDirectories(directoryPath);
		System.out.println("目录创建成功!");
		Path filePath=Paths.get("D:/test/sample/test.txt");
		Files.createFile(filePath);
		List<String>list=new ArrayList<String>();
		list.add("这是一个测试文件");
		Files.write(filePath,list,StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(filePath);
		System.out.println("文件的大小为："+Files.size(filePath));
		System.out.println("文件的内容为:"+lines);

	}

}
