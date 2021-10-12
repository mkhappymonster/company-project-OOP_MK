package Company;

import java.util.ArrayList;

public class department {

	String dname;
	int did;
	ArrayList<Employee> emparr;

	public department(String dname, int did) {
		super();
		this.dname = dname;
		this.did = did;
		emparr = new ArrayList<Employee>();

	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public void AddEmplyee(Employee e) {
		emparr.add(e);

	}

	public void DeleteEmployee(int inx) {
		emparr.remove(inx);
	}

	public int getCount() {
		return emparr.size();
	}

	public void showalldata() {
		for (int i = 0; i < emparr.size(); i++) {
			System.out.println(emparr.get(i).getSsn() + " " + emparr.get(i).getName() + emparr.get(i).getAddress());
		}
	}

	public void printallDetails() {
		for (int i = 0; i < emparr.size(); i++) {
			if (emparr.get(i) instanceof SalaredEmployee) {
				((SalaredEmployee) emparr.get(i)).Displayalldetails();
			}
			if (emparr.get(i) instanceof commisionEmployee) {
				((commisionEmployee) emparr.get(i)).Displayalldetails();
			}
			if (emparr.get(i) instanceof HourlyEmployee) {
				((HourlyEmployee) emparr.get(i)).Displayalldetails();
			}
		}
	}

	public department() {
		super();
	}
}
