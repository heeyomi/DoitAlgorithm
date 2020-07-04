package chap03;

import java.util.Scanner;

//이진 검색
public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; //검색 범위의 첫 index
		int pr = n - 1; //검색 범위의 끝 index
		
		do {
			int pc = (pl + pr) / 2; //중앙
			if (a[pc] == key) { // 검색 성공
				return pc;
			} else if (a[pc] < key) { //검색 범위를 뒤쪽으로 좁힘
				pl = pc + 1;
			} else {
				pr = pc - 1; //검색 범위를 앞쪽 절반으로 좁힙
			}
		} while (pl <= pr);
		
		return -1; //검색 실패시
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.println("x[0] : ");
		x[0] = sc.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "]:");
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
		sc.close();
	}
}
