package com.jihe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
public class E22 {

	public static void main(String[] args) throws Exception{
		Properties pps=new Properties();
		pps.load(new FileInputStream("E:\\软件java\\java_jichu\\src\\com\\jihe\\test.properties"));
		pps.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out=new FileOutputStream("E:\\软件java\\java_jichu\\src\\com\\jihe\\test.properties");
		pps.setProperty("charset","UTF-8");
		pps.store(out,"新增charset编码");
		
	}

}
