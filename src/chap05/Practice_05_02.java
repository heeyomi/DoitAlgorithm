package chap05;

import java.util.Scanner;

public class Practice_05_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �ִ������� ���մϴ�.");

		System.out.println("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		System.out.println("������ �Է��ϼ���. : ");
		int y = sc.nextInt();

		System.out.println("�ִ� ������� " + gcd(x, y) + "�Դϴ�.");

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
