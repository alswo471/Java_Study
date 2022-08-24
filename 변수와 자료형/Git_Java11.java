package study01;

public class Git_Java11 {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // byte형 값이 int형 변수로 대입됨

		System.out.println(b);
		System.out.println(i);

		int i2 = 20;
		float f = i2; // int형 값이 float형 변수로 대입됨

		System.out.println(i);
		System.out.println(f);

		double d;
		d = f + i;
		System.out.println(d);
	}
}
