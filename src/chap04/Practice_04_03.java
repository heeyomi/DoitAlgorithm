package chap04;


public class Practice_04_03 {
	private int max; //스택의 용량 (A와 B의 합계)
	private int ptrA; //스택 포인트 A
	private int ptrB; //스택 포인트 B
	private int[] stk; //스택 본체

	public enum AorB{
		StackA, StackB
	}

	//실행할 때 예외 : 스택이 비어 있음
	public class EmptyIntStackX2Exception extends RuntimeException{
		public EmptyIntStackX2Exception() {

		}
	}


	//실행 할 때 예외 : 스택이 가득 참
	public class OverflowIntStackX2Exception extends RuntimeException{
		public OverflowIntStackX2Exception() {

		}
	}

	//생성자
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

	//스택에 x를 푸시
	public int push(AorB sw, int n) throws OverflowIntStackX2Exception{
		if (ptrA >= ptrB + 1) { //스택이 가득참
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

	//스택에서 데이터 pop
	public int pop(AorB sw) throws EmptyIntStackX2Exception{
		int x = 0;
		switch (sw) {
		case StackA:
			if (ptrA <= 0) { //스택 A가 비어있으면
				throw new EmptyIntStackX2Exception();
			}
			x = stk[--ptrA];
			break;

		case StackB:
			if (ptrB >= max - 1) { //스택 B가 비어있으면
				throw new EmptyIntStackX2Exception();
			}
			x = stk[++ptrB];
			break;
		}
		return x;
	}

	//스택에서 데이터 peek
	public int peek(AorB sw) throws EmptyIntStackX2Exception{
		int x = 0;
		switch (sw) {
		case StackA:
			if (ptrA <= 0) { //스택 A가 비어있으면
				throw new EmptyIntStackX2Exception();
			}
			x = stk[ptrA - 1];
			break;

		case StackB:
			if (ptrB >= max - 1) {				// 스택 B가 비어 있음
				throw new EmptyIntStackX2Exception();
			}
			x = stk[ptrB + 1];
			break;
		}
		return x;
	}

	//스택에 x를 검색하여 index 반환
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


	//스택 비움
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

	//스택 용량 반환
	public int capacity() {
		return max;
	}

	//스택에 쌓여있는 수 반환
	public int size(AorB sw) {
		switch (sw) {
		case StackA:
			return ptrA;

		case StackB:
			return max - ptrB - 1;
		}
		return 0;
	}

	//스택이 비어있는가?
	public boolean isEmpty(AorB sw) {
		switch (sw) {
		case StackA:
			return ptrA <= 0;

		case StackB:
			return ptrB >= max -1;
		}
		return true;
	}

	//스택이 가득 차있는가?
	public boolean isFull() {
		return ptrA >= ptrB + 1;
	}

	// 스택 안의 터이터를 바닥 → 꼭대기의 차례로 나타냄
	public void dump(AorB sw) {
		switch (sw) {
		case StackA:
			if (ptrA <= 0)
				System.out.println("스택이 비었습니다.");
			else {
				for (int i = 0; i < ptrA; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		case StackB:
			if (ptrB >= max - 1)
				System.out.println("스택이 비었습니다.");
			else {
				for (int i = max - 1; i > ptrB; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}
}
