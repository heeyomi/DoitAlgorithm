package chap01;
import java.util.Scanner;

public class Practice_01_01 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.print("a의 값은 : ");
		a = sc.nextInt();
		System.out.print("b의 값은 : ");
		b = sc.nextInt();
		System.out.print("c의 값은 : ");
		c = sc.nextInt();
		System.out.print("d의 값은 : ");
		d = sc.nextInt();

		int max = max4(a, b, c, d);

		System.out.println("최댓값은 " + max + "입니다.");
	}
}
