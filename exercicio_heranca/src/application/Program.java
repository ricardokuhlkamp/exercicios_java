package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc; //a conta empresarial também é uma conta, por isso é possível fazer a atribuição ao lado.
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2; //Tenho que forçar um casting. A conta não é uma conta empresarial, por isso é preciso forçau com casting.
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3; //Não é permitido apesar do programa não observar agora que acc3 é um Savings Account. Ao executar ira dar erro!
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		Account acc11 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc11.getBalance());
		
		Account acc12 = new SavingsAccount(1002, "Alex", 1000.0, 0.01);
		acc12.withdraw(200.0);
		System.out.println(acc12.getBalance());
		
		Account acc13 = new BusinessAccount(1003, "Alex", 1000.0, 500.0);
		acc13.withdraw(200.0);
		System.out.println(acc13.getBalance());
		
		//Polimorfismo
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
	}

}
