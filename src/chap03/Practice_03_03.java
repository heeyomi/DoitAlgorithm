package chap03;

import java.util.Scanner;

public class Practice_03_03 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[cnt] = i;
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = searchIdx(x, num, ky, y);
		
		if (idx == 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			for (int i = 0; i < idx; i++) {
				System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
			}
			
		}
		sc.close();
	}
}
