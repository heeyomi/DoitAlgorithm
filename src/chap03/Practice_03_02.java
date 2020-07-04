package chap03;

import java.util.Scanner;

public class Practice_03_02 {

	static int seqSearch(int[] a, int n, int key) {
		System.out.print("   |");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%2d", i);
		}
		
		System.out.println();
		System.out.println("---+--------------");
		int i = 0;
		
		while (true) {
			System.out.print("   |");
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.printf("%2s", "*");
					break;
				} else {
					System.out.printf("%2s", " ");
				}
			}
			System.out.println();
			System.out.printf("%2d |", i);
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d", a[j]);
			}
			System.out.println();
			System.out.printf("%4c", '|');
			System.out.println();
			//값이 없을 경우
			if (i == n) {
				return -1;
			}
			
			//값을 찾았을 경우
			if (a[i] == key) {
				return i;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky);
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) " + "x[" + idx + "]에 있습니다.");
		}
		sc.close();
	}
}
