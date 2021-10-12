package Company;

enum gender {
	male, female
}

public abstract class Employee {
	String name;
	int ssn;
	String address;
	gender sex;

	public Employee(String name, int ssn, String address, gender sex) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.sex = sex;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public gender getSex() {
		return sex;
	}

	public void setSex(gender sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public abstract double Earning();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", address=" + address + ", sex=" + sex + "]";
	}

}
