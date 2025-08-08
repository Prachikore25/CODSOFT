import java.util.Scanner;
class Account{
	private double Balance;
	public Account(double initalbalance) {
		Balance = initalbalance;
	}
	public void deposite(double amount) {
		if(amount>0) {
			Balance=Balance+amount;
			System.out.println("deposited amount:"+amount);
		}
		else {
			System.out.println("invalid deposite amount");
		}
	}
	public void withdraw(double amount) {
		if(amount<=Balance && amount>0) {
			Balance=Balance-amount;
		}
		else if(amount<=0) {
			System.out.println("invalid withdrawal amount");
		}
	}
	public void checkBal() {
		System.out.printf("balance is:%f\n",Balance);
	}
}
public class ATMSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account user = new Account(0);
		int choice = 0;
		
		while(choice!=4) {
			System.out.println("enter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				user.checkBal();
				break;
			case 2:
				System.out.println("Enter amount to deposite: ");
				double deposit = sc.nextDouble();
				user.deposite(deposit);
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				double withdraw = sc.nextDouble();
				user.withdraw(withdraw);
				break;
			case 4:
				System.out.println("THANK YOU!");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		sc.close();
	}
}
