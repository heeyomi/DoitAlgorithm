package chap05;

import java.util.Scanner;

public class Practice_05_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수의 최대공약수를 구합니다.");

		System.out.println("정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.println("정수를 입력하세요. : ");
		int y = sc.nextInt();

		System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");

		sc.close();
	}

	private static int gcd(int x, int y) {
		while (true) {
			if (y == 0) {
				return x;
			}
			int temp = y;
			y = x% y;
			x = temp;
		}
	}
}
