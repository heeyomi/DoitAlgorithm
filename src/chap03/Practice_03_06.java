package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_03_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i +"] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.println("�˻��� �� : ");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		if (idx < 0) {
			int insPoint = -idx - 1;
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
			System.out.printf("���� ����Ʈ�� %d�Դϴ�.\n", insPoint);
			System.out.printf("x[%d]�� �ٷ� �տ� %d�� �����ϸ� �迭�� ���� ���°� �����˴ϴ�.", insPoint, ky);
		} else {
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		}
		sc.close();
	}
}
