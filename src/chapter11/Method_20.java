package chapter11;

public class Method_20 {

	/*
	 * �޼��� �������� �޼��� ȣ�� �޼��忡�� �ٸ� �޼��带 ȣ���ϸ� �޼���� ������ ���߰�, �ٸ� �޼��尡 ���� �� �Ԥ��¤� ���� ��ٸ�. ȣ����
	 * �޼��尡 ���ᰡ �Ǹ� ������ �ڵ尡 ���� ��. main() -> firstMethod() -> secondMethod()
	 */
	/**
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���");	// 1
		firstMethod(); 	
		System.out.println("main(String[] args)�� ������"); // 6 
	}

	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���"); // 2
		secondMethod();
		System.out.println("firstMethod() �� ������"); // 5
	}

	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���"); // 3
		System.out.println("secondMethod()�� ������"); // 4
	}

}
