
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savings = new SavingsAccount();
		CurrentAccount current = new CurrentAccount();
		savings.mainMethod();
		savings.checkBankBalance();
		savings.validateUser();
		System.out.println();
		current.mainMethod();
		current.checkBankBalance();
		current.validateUser();
		
	}

}
