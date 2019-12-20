package com.string;

import java.util.*;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class E19 {

	public static void main(String[] args) throws ParseException {
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日：今天是yyyy年的第D天，E");
		System.out.println(sdf.format(new Date()));
		
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		System.out.println("当前时间："+year+"年"+month+"月"+date+"日"+hour+"时"+
		minute+"分"+second+"秒");
		
		calendar.set(Calendar.DATE,100);
		int year1=calendar.get(Calendar.YEAR);
		int month1=calendar.get(Calendar.MONTH);
		int date11=calendar.get(Calendar.DATE);
		System.out.println("一百天后是:"+year1+"年"+month1+"月"+date11+"日");
	
		LocalDate dprq=LocalDate.now();
		LocalDate j_100=dprq.plusDays(100);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		String ybtyh_zfc=j_100.toString();
		Date date_100=sdf1.parse(ybtyh_zfc);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月dd日");
		System.out.println("100天以后是:"+sdf2.format(date_100));
		
	}

}
