package test;

public class AccountService {
	
	public MyAccount myService(MyAccount myAccount){
		myAccount.setAmount(myAccount.getAmount() + 200);
		return myAccount;
	}

}
