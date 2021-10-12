package Company;

public class Company {

	public static void main(String[] args) {

		department d1 = new department( "System information",1);
		
		
		SalaredEmployee se = new SalaredEmployee("mk ",100 ,"Giza", gender.male, 85000, 5000,3500);
		d1.AddEmplyee(se);
		HourlyEmployee he = new HourlyEmployee("Ali ", 200,"Saudia",gender.male, 50, 50);
		d1.AddEmplyee(he);
		commisionEmployee ce = new commisionEmployee("Nour ", 300, "Masr",gender.female, 7000,10);
		d1.AddEmplyee(ce);
		d1.printallDetails();
		d1.showalldata();
		
	}

}
