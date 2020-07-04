package chap03;

import java.util.Scanner;

//���� �˻�
public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; //�˻� ������ ù index
		int pr = n - 1; //�˻� ������ �� index
		
		do {
			int pc = (pl + pr) / 2; //�߾�
			if (a[pc] == key) { // �˻� ����
				return pc;
			} else if (a[pc] < key) { //�˻� ������ �������� ����
				pl = pc + 1;
			} else {
				pr = pc - 1; //�˻� ������ ���� �������� ����
			}
		} while (pl <= pr);
		
		return -1; //�˻� ���н�
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		System.out.println("x[0] : ");
		x[0] = sc.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "]:");
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.println("�˻��� �� : ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		}
		sc.close();
	}
}
