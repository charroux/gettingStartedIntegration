package test;

public class AccountService {
	
	public MyAccount myService(MyAccount myAccount){
		System.out.println(myAccount);
		myAccount.setAmount(myAccount.getAmount() + 200);
		return myAccount;
	}

}
