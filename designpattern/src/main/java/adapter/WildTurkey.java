package adapter;

//����Ļ�����
public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("���ǻ𼦣������ڽ�");
	}

	@Override
	public void fly() {
		System.out.println("���ǻ𼦣��ҷ����Զ̵�һЩ����");
	}

}
