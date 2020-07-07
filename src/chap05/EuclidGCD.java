package chap05;

import java.util.Scanner;

public class EuclidGCD {
	//���� x,y�� �ִ������� ���Ͽ� ��ȯ
	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	
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
}