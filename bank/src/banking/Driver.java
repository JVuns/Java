package banking;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		boolean running = true;
		Bank bank1 = new Bank("Java");
		Ez.printf("Welcome to %s bank\n", bank1.getBankName());
		Scanner Input = new Scanner(System.in);
		bank1.addCustomer("Amatsuka", "Uto");
		Account acc = new Account(10000000);
		bank1.getCustomer(0).setAccount(acc);
		while (running) {
			Ez.print("Menu: ");
			Ez.print("[1] Login");
			Ez.print("[2] Create new account");
			Ez.print("[3] Exit");
			Ez.print("[4] Debug single account");
			Ez.print("[5] Debug account list");
			Ez.print("[6] Terminate");
			int option1 = Input.nextInt();

			switch(option1) {
			case 1:
				Ez.print("Enter your first name: ");
				Input.nextLine();
				String fn = Input.nextLine();
				Ez.print("Enter your surname: ");
				String ln = Input.nextLine();
				String us = fn + " " + ln;
					for(int i=0; i<bank1.getNumOfCustomer(); i++){
						if(us.equals(bank1.getUsername(i))) {
							bank1.getCustomer(i).setAccount(bank1.getCustomer(i).getAccount());;
							boolean logged = true;
							while(logged){
								Ez.printf("Welcome %s\n", bank1.getUsername(i));
								Ez.print("Menu: ");
								Ez.print("[1] Balance");
								Ez.print("[2] Withdraw");
								Ez.print("[3] Deposit");
								Ez.print("[4] log out");
								int option2 = Input.nextInt();
								int amount;
								switch(option2) {
								case 1:
									Ez.printf("Your balance is: %f\n", bank1.getCustomer(i).getAccount().getBalance());
									Ez.pause();
									break;
								case 2:
									Ez.print("Withdrawal amount:");
									amount = Input.nextInt();
									if(bank1.getCustomer(i).getAccount().withdraw(amount)){
										Ez.printf("%d $ has been withdrawed\n", amount);
										Ez.pause();
									}
									else {
										Ez.print("[Error] You do not have enough credit or have inserted invalid number");
										Ez.pause();
									}
									break;
								case 3:
									Ez.print("Deposit amount:");
									amount = Input.nextInt();
									if(bank1.getCustomer(i).getAccount().deposit(amount)){
										Ez.printf("%d $ has been deposited\n", amount);
										Ez.pause();
									}
									else {
										Ez.print("You cannot deposit loan");
										Ez.pause();
									}
									break;
								case 4:
									logged = false;
									Ez.print("You have logged out");
									break;
								}
							}
						}
						else {
							if(i == bank1.getNumOfCustomer()-1) {
							Ez.printf("Username %s %s not found\n", fn, ln);
							Ez.pause();
							}
						}
					}
						
				break;
			case 2:
				Input.nextLine();
				Ez.print("Please enter your first name");
				String firstName = Input.nextLine();
				System.out.flush();
				Ez.print("Please enter your surname");
				String lastName = Input.nextLine();
				Ez.printf("Your name is: %s %s \n", firstName, lastName);
				Ez.print("Confirm account name? (y/n)");
				char confirm = Input.next().charAt(0);
				if (confirm == 'y' || confirm == 'Y')
					bank1.addCustomer(firstName, lastName);
					Account acc2 = new Account(0);
					bank1.getCustomer(bank1.getNumOfCustomer()-1).setAccount(acc2);
					Ez.print("Account created");
					Ez.print();
				break;
			case 3:
				System.exit(0);
				break;
			case 4:
				int inputIndex = 0;
				Ez.print("Account's index:");
				try{
					inputIndex = Input.nextInt();
				}catch(Exception error) {
					Ez.print("Index invalid");
				}
				Input.nextLine();
				try{
					Ez.print(bank1.getUsername(inputIndex));
				}catch(Exception error) {	
					Ez.print("Index invalid");
					Ez.print();
				}
				Ez.print("Press Enter to continue");
				Input.nextLine();
				break;
			case 5:
				for(int i=0; i<bank1.getNumOfCustomer(); i++)
				{
					Ez.print(bank1.getUsername(i));
				}
				Input.nextLine();
				Ez.print("Press Enter to continue");
				Input.nextLine();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				Ez.print("Not a valid option");
				break;
					}
				}
		Input.close();
	}
}
