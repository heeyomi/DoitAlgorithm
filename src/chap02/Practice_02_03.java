package chap02;

import java.util.Scanner;

public class Practice_02_03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ��£�");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("�� ����� �հ�� " + sumOf(arr) + "�Դϴ�.");
	}
}
