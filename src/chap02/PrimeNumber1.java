package chap02;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0;

		for (int i = 2; i <= 1000; i++) {
			int n;
			for (n = 2; n < i; n++) {
				counter++;
				if (i % n == 0) {
					break;
				}
			}
			if (i == n) {
				System.out.println(i);
			}
		}
		System.out.println("³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö : " + counter);

	}

}
