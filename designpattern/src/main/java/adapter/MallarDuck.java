package adapter;

//����Ѽ������
public class MallarDuck implements Duck{
	
	@Override
	public void quack() {
		System.out.println("����һֻѼ�ӣ������ڽ�");
	}

	@Override
	public void fly() {
		System.out.println("����һֻѼ�ӣ������ڷ�");
	}

}
