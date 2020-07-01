package chap01;
import java.util.Scanner;

public class Practice_01_03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;    
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}

		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("네 정수의 최솟값을 구합니다.");
		System.out.print("a의 값은 : ");  
		int a = sc.nextInt();
		System.out.print("b의 값은 : ");  
		int b = sc.nextInt();
		System.out.print("c의 값은 : ");  
		int c = sc.nextInt();
		System.out.print("d의 값은 : ");  
		int d = sc.nextInt();

		int min = min4(a, b, c, d);

		System.out.println("최솟값은 " + min + "입니다.");
	}
}