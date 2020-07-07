package chap04;


public class Practice_04_03 {
	private int max; //������ �뷮 (A�� B�� �հ�)
	private int ptrA; //���� ����Ʈ A
	private int ptrB; //���� ����Ʈ B
	private int[] stk; //���� ��ü

	public enum AorB{
		StackA, StackB
	}

	//������ �� ���� : ������ ��� ����
	public class EmptyIntStackX2Exception extends RuntimeException{
		public EmptyIntStackX2Exception() {

		}
	}


	//���� �� �� ���� : ������ ���� ��
	public class OverflowIntStackX2Exception extends RuntimeException{
		public OverflowIntStackX2Exception() {

		}
	}

	//������
	public Practice_04_03(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	//���ÿ� x�� Ǫ��
	public int push(AorB sw, int n) throws OverflowIntStackX2Exception{
		if (ptrA >= ptrB + 1) { //������ ������
			throw new OverflowIntStackX2Exception();
		}
		switch (sw) {
		case StackA:
			stk[ptrA++] = n;
			break;

		case StackB:
			stk[ptrB++] = n;
			break;
		}
		return n;
	}

	//���ÿ��� ������ pop
	public int pop(AorB sw) throws EmptyIntStackX2Exception{
		int x = 0;
		switch (sw) {
		case StackA:
			if (ptrA <= 0) { //���� A�� ���������
				throw new EmptyIntStackX2Exception();
			}
			x = stk[--ptrA];
			break;

		case StackB:
			if (ptrB >= max - 1) { //���� B�� ���������
				throw new EmptyIntStackX2Exception();
			}
			x = stk[++ptrB];
			break;
		}
		return x;
	}

	//���ÿ��� ������ peek
	public int peek(AorB sw) throws EmptyIntStackX2Exception{
		int x = 0;
		switch (sw) {
		case StackA:
			if (ptrA <= 0) { //���� A�� ���������
				throw new EmptyIntStackX2Exception();
			}
			x = stk[ptrA - 1];
			break;

		case StackB:
			if (ptrB >= max - 1) {				// ���� B�� ��� ����
				throw new EmptyIntStackX2Exception();
			}
			x = stk[ptrB + 1];
			break;
		}
		return x;
	}

	//���ÿ� x�� �˻��Ͽ� index ��ȯ
	public int indexOf(AorB sw) throws EmptyIntStackX2Exception{
		int x = 0;
		switch (sw) {
		case StackA:
			for (int i = ptrA - 1; i >= 0; i--) {
				if (stk[i] == x) {
					return i;
				}
			}
			break;

		case StackB:
			for (int i = ptrB + 1; i < max; i++) {
				if (stk[i] == x) {
					return i;
				}
			}
			break;
		}
		return x;
	}


	//���� ���
	public void clear(AorB sw) {
		switch (sw) {
		case StackA:
			ptrA = 0;
			break;

		case StackB:
			ptrB = max - 1;
			break;
		}
	}

	//���� �뷮 ��ȯ
	public int capacity() {
		return max;
	}

	//���ÿ� �׿��ִ� �� ��ȯ
	public int size(AorB sw) {
		switch (sw) {
		case StackA:
			return ptrA;

		case StackB:
			return max - ptrB - 1;
		}
		return 0;
	}

	//������ ����ִ°�?
	public boolean isEmpty(AorB sw) {
		switch (sw) {
		case StackA:
			return ptrA <= 0;

		case StackB:
			return ptrB >= max -1;
		}
		return true;
	}

	//������ ���� ���ִ°�?
	public boolean isFull() {
		return ptrA >= ptrB + 1;
	}

	// ���� ���� �����͸� �ٴ� �� ������� ���ʷ� ��Ÿ��
	public void dump(AorB sw) {
		switch (sw) {
		case StackA:
			if (ptrA <= 0)
				System.out.println("������ ������ϴ�.");
			else {
				for (int i = 0; i < ptrA; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		case StackB:
			if (ptrB >= max - 1)
				System.out.println("������ ������ϴ�.");
			else {
				for (int i = max - 1; i > ptrB; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}
}
