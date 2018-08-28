package factory.abstractf;

public abstract class Pizza {

	String name;
	Dough dough;
	Cheese cheese;
	
	abstract void prepare();
	
	void bake(){
		System.out.println("烘培25分钟");
	}
	
	void cut(){
		System.out.println("把披萨切成斜角部分");
	}
	
	void box(){
		System.out.println("将披萨包装好");
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
}
