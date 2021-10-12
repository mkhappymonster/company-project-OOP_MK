package Company;

public class commisionEmployee extends Employee implements Displayable {
	double GrossSalery;
	double commisiionRate;

	public commisionEmployee(String name, int ssn, String address, gender sex, double grossSalery,
			double commisiionRate) {
		super(name, ssn, address, sex);
		GrossSalery = grossSalery;
		this.commisiionRate = commisiionRate;
	}

	public double getGrossSalery() {
		return GrossSalery;
	}

	public void setGrossSalery(double grossSalery) {
		GrossSalery = grossSalery;
	}

	public double getCommisiionRate() {
		return commisiionRate;
	}

	public void setCommisiionRate(double commisiionRate) {
		this.commisiionRate = commisiionRate;
	}

	@Override
	public String toString() {
		return "commisionEmployee [GrossSalery=" + GrossSalery + ", commisiionRate=" + commisiionRate + "]";
	}

	@Override
	public double Earning() {
		return commisiionRate * commisiionRate;
	}

	public void Displayalldetails() {
		System.out.println(super.toString());
		System.out.println(toString());

	}

	public void DisplayEarning() {
		System.out.println(Earning());

	}

}
