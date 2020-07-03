package chap02;

import java.util.Scanner;

public class Practice_02_04 {
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		
		for (int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a�� ��ڼ��� ��");
		int na = sc.nextInt();
		int[] a = new int[na];
		
		for (int i = 0; i < na; i++) {
			System.out.println("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("b�� ��ڼ��� ��");
		int nb = sc.nextInt();
		int[] b = new int[nb];
		
		for (int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �����߽��ϴ�.");
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
