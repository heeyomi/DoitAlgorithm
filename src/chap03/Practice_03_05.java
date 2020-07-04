package chap03;

import java.util.Scanner;

public class Practice_03_05 {

	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0;
		int pr = n - 1 ;
		
		while (true) {
			int pc = (pl + pr) / 2;
			if (pl > pr) {
				break;
			}
			if (a[pc] == key) {
				for (int i = pc; i > 0; i--) {
					if (a[pc] == a[i]) {
						return i;
					}
				}
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pr - 1;
			}
		}
		
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int ky = sc.nextInt();
		int idx = binSearchX(x, num, ky);
		
		if (idx == 0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
				System.out.println("�� ���� " + "x[" + idx + "]�� �ֽ��ϴ�.");
			
		}
		sc.close();
	}
}
