package chap04;


public class Practice_04_04 {
	private int max; //큐의 용량
	private int num; //현재 데이터 수
	private int[] que; //큐 본체

	//실행할 때 예외 : 큐가 비어 있음
	public class EmptyIntAryQueueException extends RuntimeException{
		public EmptyIntAryQueueException() {

		}
	}


	//실행 할 때 예외 : 스택이 가득 참
	public class OverflowIntAryQueueException extends RuntimeException{
		public OverflowIntAryQueueException() {

		}
	}

	//생성자

	public Practice_04_04(int capactiy) {
		num = 0;
		max = capactiy;

		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	//큐를 데이터에 push
	public int enqueue(int x) throws OverflowIntAryQueueException{
		if (num >= max) {
			throw new OverflowIntAryQueueException();
		}

		que[num++] = x;
		return x;

	}

	//큐를 데이터에서 pop
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

	// 큐에서 데이터를 피크(머리 데이터를 살펴봄)
	public int peek() throws EmptyIntAryQueueException {
		if (num <= 0) {
			throw new EmptyIntAryQueueException(); // 큐가 비어 있음
		}
		return que[num - 1];
	}

	// 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			if (que[i] == x) { // 검색성공
				return i;
			}
		}
		return -1; // 검색실패
	}


	// 큐를 비움
	public void clear() {
		num = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓인 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 데이터를 머리→꼬리의 차례로 출력함
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}
