package chap01;
import java.util.Scanner;

public class Practice_01_09 {
	static int sumof(int a, int b) {
		int min; 
		int max; 

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0;
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		return (sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("정수 a, b 를 포함한 그 사이의 합은 " + sumof(a, b) + "입니다.");
	}
}
