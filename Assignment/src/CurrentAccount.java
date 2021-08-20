
public class CurrentAccount implements BankAccount{
	public void mainMethod() {
		System.out.println("This is a Current account class");
	}

	@Override
	public void checkBankBalance() {
		// TODO Auto-generated method stub
		System.out.println("this is a current account method");
	}

	@Override
	public void validateUser() {
		// TODO Auto-generated method stub
		System.out.println("this is a current account validate method");
	}

}
