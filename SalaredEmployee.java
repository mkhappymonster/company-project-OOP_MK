package Company;

public class SalaredEmployee extends Employee implements Displayable {
	double salary, bouns, deduction;

	public SalaredEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaredEmployee(String name, int ssn, String address, gender sex, double salary, double bouns,
			double deduction) {
		super(name, ssn, address, sex);
		this.salary = salary;
		this.bouns = bouns;
		this.deduction = deduction;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBouns() {
		return bouns;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}

	@Override
	public double Earning() {
		return bouns + salary - deduction;

	}

	public void Displayalldetails() {
		System.out.println(super.toString());
		System.out.println(toString());

	}

	public void DisplayEarning() {
		System.out.println(Earning());
	}

	@Override
	public String toString() {
		return "SalaredEmployee [salary=" + salary + ", bouns=" + bouns + ", deduction=" + deduction + "]";
	}
}
