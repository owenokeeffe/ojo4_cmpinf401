import java.util.UUID;
public class Account {
private String accountNumber;
private String accountType;
private double balance;
private double interestRate;
private User owner;


public Account(String accountType) {
	this.accountNumber = UUID.randomUUID().toString();
	this.accountType = accountType;
	this.balance = 0;
	this.interestRate = 0;
}

public Account(String accountType, double interestRate) {
	this.accountNumber = UUID.randomUUID().toString();
	this.accountType = accountType;
	this.balance = 0;
	this.interestRate = interestRate;
	
	


	
}

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

public String getAccountNumber() {
	return accountNumber;
}

public String getAccountType() {
	return accountType;
}

public double getBalance() {
	return balance;
}

}
