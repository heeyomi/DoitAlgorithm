package chap01;
import java.util.Scanner;

public class Practice_01_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수를 구합니다.");

		int n = sc.nextInt();
		int i = 0;
		
		while (true) {
			if (n < 10) {
				i++;
				break;
			} else {
				n = n/10;
				i++;
			}
		}

		System.out.println("그 수는 " + i + "자리입니다.");
	}
}