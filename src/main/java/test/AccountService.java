package test;

public class AccountService {

    public Account buy(Account account){
        account.amount = 0;
        return account;
    }

}
