package StepOne;

import java.util.Scanner;



public class Customer {
	private String name;
	private int acc_No;
	private int balance;
	private int password;

	public Customer(String name, int acc_No, int balance, int password) {
		super();
		this.name = name;
		this.password = password;
		this.acc_No = acc_No;
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("Balance is not less than ZERO");
		}

	}

	public String getName() {
		return name;
	}

	public int getAcc_No() {
		return acc_No;
	}

	public String getBalance() {
		System.out.print("Enter a password: ");
		Scanner sc = new Scanner(System.in);
		int password = sc.nextInt();
		if (password == 1611) {
			return "Account Balance is = " + balance;
		}
		return "Wrong Password ";
	}

	public void addBalance() {

		System.out.println("WellCome !" + name);

		System.out.println("Enter amount: ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();

		if (amount > 0) {
			this.balance = this.balance + amount;
			System.out.println("Amount " + amount + " credited succesfully");

		} else {
			System.out.println("Amount Shoulde be Greater than ZERO");
		}
	}

	public void withdraw() {

		System.out.println("WellCome !" + name);

		System.out.print("Enter PIN: ");
		Scanner sc = new Scanner(System.in);
		int password = sc.nextInt();

		if (password == 1611) {
			System.out.print("Enter Amount for withdraw: ");
			int amount = sc.nextInt();

			if (amount > 0 && amount <= balance) {
				balance -= amount;
				System.err.println("amount withdraw: " + amount + " || remaining acount balance: " + balance);
			} else {
				System.out.println("!! Insufficient Balance or withdraw ammount shoulde be greater than 1");
			}
		} else {
			System.out.println("Wrong Password..");
		}

	}

	public void userLogin() {

		System.out.println("Welcome to StepOne Bank !");
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("Choose pption to use Services....");
		System.out.println("--------------------");
		System.out.println("1) Check ur Acc Details");
		System.out.println("2) Add Amount!");
		System.out.println("3) Withdraw balance");
		System.out.println("3) Logout");
		System.out.println("--------------------");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("provide account number: ");
			int accountnumber = sc.nextInt();
			if (accountnumber == acc_No) {
				System.out.println("Welcome to StepOne Bank !");
				System.out.println("--------------------");
				System.out.println("Acount Holder Name: " + name);
				System.out.println("Acount Number: " + acc_No);
			}

			break;
		case 2:
			addBalance();
			break;
		case 3:
			withdraw();
			break;
		case 4:
			userLogin();
			break;
		default:
			System.out.println("Choose correct option or stay updated....");
		}

	}

}
