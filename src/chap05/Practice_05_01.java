package chap05;

import java.util.Scanner;

public class Practice_05_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		
		System.out.println(n + "의 팩토리얼은 " + factorial(n) + "입니다.");
		sc.close();
	}

	static int factorial(int n) {
		int num = n;
		int fact = 1;
		
		while (true) {
			if (num == 0) {
				return fact;
			}
			fact = fact * num;
			num--;
		}
	}
}
