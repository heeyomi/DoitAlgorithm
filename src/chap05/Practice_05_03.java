package chap05;

import java.util.Scanner;

public class Practice_05_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ҽ� : ");
		int x = sc.nextInt();
		int[] num = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.println("������ �Է��ϼ��� : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("��Ҽ� a�� �ִ������� ���մϴ�.");


		System.out.println("�ִ� ������� " + gcdArr(num, 0 , x) + "�Դϴ�.");
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
