package PracticalLabTest;

public class Main {
	public static void main(String...args) {
		
		//creating object of each class
		    BankA a= new BankA();
	        BankB b= new BankB();
	        BankC c= new BankC();
	        
     //displaying the bank balance in each banks
	        System.out.println("Amount deposited in Bank A: Rs." + a.getBalance());
	        System.out.println("Amount deposited in Bank B: Rs." + b.getBalance());
	        System.out.println("Amount deposited in Bank C: Rs." + c.getBalance());
	}
}
