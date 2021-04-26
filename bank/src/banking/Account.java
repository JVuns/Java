package banking;

public class Account {
	private double balance = 0;
	
	public Account(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public boolean deposit(double amt)
	{
		if(amt <= 0)
		{
			return false;
		}
		balance += amt;
		return true;
	}
	public boolean withdraw(double amt)
	{
		if(amt >= balance || amt <= 0)
		{
			return false;
		}
		balance -= amt;
		return true;
	}
	public boolean transfer(double amt, Account acc)
	{
		if((amt + amt*0.1) >= balance || amt <=0)
		{
			return false;
		}
		balance -= amt + amt*0.1;
		acc.deposit(amt);
		return true;
	}
}
