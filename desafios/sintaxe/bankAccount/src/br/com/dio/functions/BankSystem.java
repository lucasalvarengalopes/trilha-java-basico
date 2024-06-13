package br.com.dio.functions;

import br.com.dio.models.TerminalAccount;

import java.util.Scanner;

public class BankSystem {
	private void printMenu() {
		System.out.println("""
						What would you like to do?
						1 - Deposit
						2 - Withdraw
						3 - Check balance
						0 - Exit
						
						""");
	}
	
	private void welcomeMessage(String name, String agency, int accountNumber, double balance) {
		System.out.printf("""
						
						Hi %s, thank you for choosing DIO International Bank!
						Your agency is %s, your account number is %d and your balance is %.2f, that is already available for you.
						
						""", name, agency, accountNumber, balance);
		
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("""
						Welcome to DIO International Bank!
						
						Please, enter your name:
						""");
		
		String name = scanner.nextLine();
		
		System.out.println("Please, enter your agency:");
		String agency = scanner.nextLine();
		
		System.out.println("Please, enter your account number:");
		int accountNumber = scanner.nextInt();
		
		System.out.println("Please, enter your initial balance:");
		double balance = scanner.nextDouble();
		
		TerminalAccount account = new TerminalAccount(name, balance, agency, accountNumber);
		int option = 0;
		
		welcomeMessage(name, agency, accountNumber, balance);
		
		do {
			printMenu();
			option = scanner.nextInt();
			
			switch (option) {
				case 1:
					System.out.println("Please, enter the value you want to deposit:");
					double depositValue = scanner.nextDouble();
					account.deposit(depositValue);
					break;
				case 2:
					System.out.println("Please, enter the value you want to withdraw:");
					double withdrawValue = scanner.nextDouble();
					account.withdraw(withdrawValue);
					break;
				case 3:
					System.out.println("Your balance is: " + account.getBalance());
					break;
				case 0:
					System.out.println("Thank you for using DIO International Bank!");
					break;
				default:
					System.out.println("Invalid option. Please, try again.");
					break;
			}
		}while (option != 0);
	}
}
