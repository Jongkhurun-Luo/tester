package com.Tester;

import java.util.Scanner;

public class Add {
	public Add() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = s.nextInt();
		System.out.println("请输入第二个整数：");
		int b = s.nextInt();
		System.out.println("和为：" + (a + b));
		s.close();
	}

}
