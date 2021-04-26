package banking;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Customer> customer = new ArrayList<>();
	private int numberOfCustomer = 0;
	private String bankName;
	
	public Bank(String bName)
	{
		bankName = bName;
	}
	public String getBankName()
	{
		return bankName;
	}
	public void addCustomer(String firstName, String lastName)
	{
		customer.add(new Customer(firstName, lastName));
		numberOfCustomer += 1;
	}
	public int getNumOfCustomer()
	{
		return numberOfCustomer;
	}
	public Customer getCustomer(int index)
	{
		return customer.get(index);
	}
	public String getUsername(int index) 
	{
		return customer.get(index).getFirstName()+" "+customer.get(index).getLastName();
	}
	public Customer findCustomer(String username)
	{
		for(int i=0; i<this.getNumOfCustomer(); i++){
//			Ez.printf("Username: %s Dest: %s\n", username, this.getUsername(i));
			if(username.equals(this.getUsername(i)))
			{
				return customer.get(i);
			}
		}
		return null;
	}
}
