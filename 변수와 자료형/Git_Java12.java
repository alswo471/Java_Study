package study01;

public class Git_Java12 {
	public static void main(String[] args) {
		double d1 = 1.2;
		float f2 = 0.9F;
		
		int i3 = (int)d1 + (int)f2; // 두 실수가 각각 형변환되어 더해짐
		int i4 = (int)(d1 + f2); // 두 실수의 합이 먼저 계산되고 형 변환됨
		System.out.println(i3);
		System.out.println(i4);
	}
}
