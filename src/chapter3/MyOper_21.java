package chapter3;

public class MyOper_21 {
	public static void main(String[] args) {

		// 논리곱
		System.out.println(true && true); // true 1 * 1 = 1
		System.out.println(true && false); // false 1 * 0 = 0
		System.out.println(false && true); // false 0 * 1 = 0
		System.out.println(false && false); // false 0 * 0 = 0

		// 논리합
		System.out.println(true || true); // true 1 + 1 = 2
		System.out.println(true || false); // true 1 + 0 = 1
		System.out.println(false || true); // true 0 + 1 = 1
		System.out.println(false || false); // false 0 + 0 = 0
	}
}
