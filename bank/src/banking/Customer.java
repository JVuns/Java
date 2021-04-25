package banking;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName.toString();
	}
	public String getLastName()
	{
		return lastName.toString();
	}
	public Account getAccount()
	{
		return account;
	}
	public void setAccount(Account account)
	{
		this.account = account;
	}
}
