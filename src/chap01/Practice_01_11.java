package chap01;
import java.util.Scanner;

public class Practice_01_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �ڸ����� ���մϴ�.");

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

		System.out.println("�� ���� " + i + "�ڸ��Դϴ�.");
	}
}