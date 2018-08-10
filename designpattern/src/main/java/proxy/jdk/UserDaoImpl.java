package proxy.jdk;

public class UserDaoImpl implements IUserDAO{

	public String add() {
		System.out.println("add ok!");
		return "add";
	}

	public String edit() {
		System.out.println("edit ok!");
		return "edit";
	}

}
