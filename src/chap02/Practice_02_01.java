package chap02;

import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.ranges.Range;

public class Practice_02_01 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = rand.nextInt(20) + 1;
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = rand.nextInt(90) + 100;
			System.out.println("height[" + i + "] : "+height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
