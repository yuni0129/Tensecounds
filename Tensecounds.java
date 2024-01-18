package com.desigin_shinbi.exercise;

import java.util.Scanner;

public class Tensecounds {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enterを押したらスタートします。");
		scanner.nextLine();
		
		long start =System.currentTimeMillis();
		
		System.out.println("10秒たったと感じたら Enter を押してください。");
		
		scanner.nextLine();
		
		
		long end = System.currentTimeMillis();
		double time = (double)(end - start) / 1000.0;
		
		System.out.println(time + " 秒でした。 ");
		
		double times = (time - 10.0);
		System.out.print("差: " + times + "秒");
		
		scanner.close();
	}

}
