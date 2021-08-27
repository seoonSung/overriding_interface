package overriding;

import java.util.ArrayList;

public class Ferrari extends ArrayList<String>{
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "��� ��� �ӵ� : 300km");
		super.add("ttt");
		System.out.println(get(0));
	}
	@Override
	public boolean add(String e) {
		System.out.println("�������� add �޼ҵ� �Դϴ�.");
		System.out.println("������� ���� �ʽ��ϴ�.");
		return true;
	}
	
	

}
