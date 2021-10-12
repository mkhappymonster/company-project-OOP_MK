package Company;

public class baselpluscommission extends commisionEmployee {
	public baselpluscommission(String name, int ssn, String address, gender sex, double grossSalery,
			double commisiionRate) {
		super(name, ssn, address, sex, grossSalery, commisiionRate);
	}

	double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double Earning() {
		return base + super.Earning();
	}

	@Override
	public void Displayalldetails() {
		super.Displayalldetails();
		DisplayEarning();

	}

	@Override
	public void DisplayEarning() {
		System.out.println(Earning());
	}
}
