package Company;

public class HourlyEmployee extends Employee implements Displayable {
	double HoureRate;
	int noOfHours;

	public HourlyEmployee(String name, int ssn, String address, gender sex, double houreRate, int noOfHours) {
		super(name, ssn, address, sex);
		HoureRate = houreRate;
		this.noOfHours = noOfHours;
	}

	public double getHoureRate() {
		return HoureRate;
	}

	public void setHoureRate(double houreRate) {
		HoureRate = houreRate;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [HoureRate=" + HoureRate + ", noOfHours=" + noOfHours + "]";
	}

	@Override
	public double Earning() {
		return noOfHours * HoureRate;
	}

	public void Displayalldetails() {
		System.out.println(super.toString());
		System.out.println(toString());

	}

	public void DisplayEarning() {
		System.out.println(Earning());

	}

}
