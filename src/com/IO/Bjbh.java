package com.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh {

	public static void main(String[] args) throws IOException {
		Path filePath=Paths.get("C:\\Users\\Administrator\\Desktop\\tice\\班级信息.txt");
		Path filePath2=Paths.get("C:\\Users\\Administrator\\Desktop\\tice\\求班级编号.txt");	
		Path filePath3=Paths.get("C:\\Users\\Administrator\\Desktop\\tice\\班级编号.txt");
		Files.createFile(filePath3);
		
		List<String> list=new ArrayList<>();
		List<String>lines=Files.readAllLines(filePath);
		List<String>lines2=Files.readAllLines(filePath2);
		
		//System.out.println("文件的大小为："+Files.size(filePath));
		//System.out.println("文件的内容为:"+lines);
		//lines.forEach(x->System.out.println(x));
		Map<String,String> map=new HashMap<>();
		for(String line: lines) {
			String[]  zfcsz=line.split("	");
			map.put(zfcsz[1],zfcsz[0]);
		}
		System.out.println(lines2);
		for(String line2: lines2) {
			list.add(map.get(line2));
		}
		Files.write(filePath3,list, StandardOpenOption.APPEND);
	}

}
