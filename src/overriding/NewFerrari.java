package overriding;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye) { 
		super(ye);
		}
	public void autoSystem() {
		System.out.println("�ڵ� ���� ��带 �����մϴ�!");
	}
	/*public void speed() {
		System.out.println(getYe()+"��� ��� �ӵ� : 500km");
		System.out.println("�ͺ� speed �޸���~");
	}
*/
}
