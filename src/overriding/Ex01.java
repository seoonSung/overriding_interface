package overriding;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 �������̵�
		 -��ӹ��� �޼����� ������ �����ϴ°�
		 -������Ʈ(��ġ)�ϰ��� �ϴ� ������ �ۼ�
		 �������̵� ����
		 - �θ� �޼ҵ�� �̸��� ���ƾ� �Ѵ�.
		 - �Ű����� ���� Ÿ���� ���ƾ� �Ѵ�.
		 - ���� �����ڰ� �θ�� ���ų� Ŀ�� �Ѵ�.
		  - private < package < protected < public
		 */
		//Ferrari fe = new Ferrari(2021);
		//fe.speed();
		
		NewFerrari nfe = new NewFerrari(2022);
		nfe.autoSystem(); nfe.speed();
	}

}
