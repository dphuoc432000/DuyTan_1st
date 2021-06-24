package peoples;

public abstract class Person {
	protected String name;
	protected String birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public abstract String toString();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
