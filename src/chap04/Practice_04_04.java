package chap04;


public class Practice_04_04 {
	private int max; //ť�� �뷮
	private int num; //���� ������ ��
	private int[] que; //ť ��ü

	//������ �� ���� : ť�� ��� ����
	public class EmptyIntAryQueueException extends RuntimeException{
		public EmptyIntAryQueueException() {

		}
	}


	//���� �� �� ���� : ������ ���� ��
	public class OverflowIntAryQueueException extends RuntimeException{
		public OverflowIntAryQueueException() {

		}
	}

	//������

	public Practice_04_04(int capactiy) {
		num = 0;
		max = capactiy;

		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	//ť�� �����Ϳ� push
	public int enqueue(int x) throws OverflowIntAryQueueException{
		if (num >= max) {
			throw new OverflowIntAryQueueException();
		}

		que[num++] = x;
		return x;

	}

	//ť�� �����Ϳ��� pop
	public int dequeue() throws EmptyIntAryQueueException{
		if (num <= 0) {
			throw new EmptyIntAryQueueException();
		}
		int x = que[0];
		for (int i = 0; i < num-1; i++) {
			que[i] = que [i + 1];
		}
		num--;
		return x;
	}

	// ť���� �����͸� ��ũ(�Ӹ� �����͸� ���캽)
	public int peek() throws EmptyIntAryQueueException {
		if (num <= 0) {
			throw new EmptyIntAryQueueException(); // ť�� ��� ����
		}
		return que[num - 1];
	}

	// ť���� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			if (que[i] == x) { // �˻�����
				return i;
			}
		}
		return -1; // �˻�����
	}


	// ť�� ���
	public void clear() {
		num = 0;
	}

	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ť�� ���� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ť�� ��� �ִ°�?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ť�� ���� á�°�?
	public boolean isFull() {
		return num >= max;
	}

	// ť ���� �����͸� �Ӹ��沿���� ���ʷ� �����
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ������ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}