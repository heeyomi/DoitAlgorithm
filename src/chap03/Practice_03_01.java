package chap03;

import java.util.Scanner;

public class Practice_03_01 {

	static int seqSearchSen(int[] a, int n, int key) {
		a[n] = key;
		
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = seqSearchSen(x, num, ky);
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) " + "x[" + idx + "]에 있습니다.");
		}
		sc.close();
	}
}
