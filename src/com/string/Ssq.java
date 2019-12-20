package com.string;

import java.util.Random;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖结果:");
		System.out.print("六个红球号码是:");
		Random r=new Random();
		int hq;
		for(int i=0;i<6;i++) {
			hq=r.nextInt(33)+1;
			System.out.print(hq+",");
			Thread.sleep(1000);
		}
		System.out.print("一个蓝球号码是:");
		int lq;
		lq=r.nextInt(33)+1;
		System.out.print(lq+",");
	}

}
