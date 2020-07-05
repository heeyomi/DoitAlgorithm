package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice_03_07 {
	static class PhysData {
		private String name;
		private int height;
		private double vision;

		public PhysData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name+" " + height + " " + vision;
		}

		public static final Comparator<PhysData> VISION_DORDER = new VisionDorderComparator();
		private static class VisionDorderComparator implements Comparator<PhysData>{
			public int compare(PhysData d1, PhysData d2) {
				return (d1.vision > d2.vision) ? 1 : (d1.vision < d2.vision) ? -1:0;
			}
		}
		
		public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhysData>{
			public int compare(PhysData d1, PhysData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhysData[] x = {
				new PhysData("�̳���", 162, 0.3),
				new PhysData("������", 168, 0.4),
				new PhysData("���Ѱ�", 169, 0.8),
				new PhysData("ȫ�ر�", 171, 1.5),
				new PhysData("������", 173, 0.7),
				new PhysData("��ȣ��", 174, 1.2),
				new PhysData("�̼���", 175, 2.0),
		};

		System.out.print("�÷��� ���� ����� ã�� �ֳ���?��");
		//int height = sc.nextInt();
		double vision = sc.nextDouble();
		//int idx = Arrays.binarySearch(x, new PhysData("", height, 0.0), PhysData.HEIGHT_ORDER);
		int idx = Arrays.binarySearch(x, new PhysData("", 0, vision), PhysData.VISION_DORDER);

		if (idx < 0) {
			System.out.println("��Ұ� �����ϴ�.");
		} else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� �����ͣ�" + x[idx]);
		}

	}
}
