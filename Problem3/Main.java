package Problem3;

public class Main {
	public static void main(String[] args) {
		
		//creating the instance of employee class and entering the value
		Address ad=new Address("Lane B 1","Netaji Park","Malda","West Bengal","732101");
		Department d=new Department("ABCD1998","EE","Employee");
		Employee ep=new Employee("Bishwadeep Sinha",(byte)24,"7478897295",ad,"ABC_031",17500,d);
	
		 
		ep.displayemp();

	}

}