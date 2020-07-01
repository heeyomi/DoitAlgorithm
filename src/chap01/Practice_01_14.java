package chap01;
import java.util.Scanner;

public class Practice_01_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("사각형을 출력합니다.");

		do {
			System.out.print("단 수 : ");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}