package study01;

public class Git_Java12 {
	public static void main(String[] args) {
		double d1 = 1.2;
		float f2 = 0.9F;
		
		int i3 = (int)d1 + (int)f2; // �� �Ǽ��� ���� ����ȯ�Ǿ� ������
		int i4 = (int)(d1 + f2); // �� �Ǽ��� ���� ���� ���ǰ� �� ��ȯ��
		System.out.println(i3);
		System.out.println(i4);
	}
}
