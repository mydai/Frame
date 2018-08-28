package factory.abstractf;

public abstract class Pizza {

	String name;
	Dough dough;
	Cheese cheese;
	
	abstract void prepare();
	
	void bake(){
		System.out.println("����25����");
	}
	
	void cut(){
		System.out.println("�������г�б�ǲ���");
	}
	
	void box(){
		System.out.println("��������װ��");
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
}
