package chap03;

import java.util.Scanner;

//선형 탐색
public class SeqSearch {

	//배열 길이가 n인 배열 a에서 key와 같은 요소를 선형 검색
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
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
