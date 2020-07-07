package chap05;

import java.util.Scanner;

public class Practice_05_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 : ");
		int x = sc.nextInt();
		int[] num = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.println("정수를 입력하세요 : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("요소수 a의 최대공약수를 구합니다.");


		System.out.println("최대 공약수는 " + gcdArr(num, 0 , x) + "입니다.");
		sc.close();
	}

	static int gcd(int x, int y) {
		while (true) {
			if (y == 0) {
				return x;
			}
			int temp = y;
			y = x% y;
			x = temp;
		}
	}
	
	static int gcdArr(int[] a, int start, int no) {
		if (no == 1) {
			return a[start];
		} else if (no == 2) {
			return gcd(a[start], a[start + 1]);
		} else {
			return gcd(a[start], gcdArr(a, start + 1, no - 1));
		}
	}
}
