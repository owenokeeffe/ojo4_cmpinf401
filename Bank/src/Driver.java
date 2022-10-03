
public class Driver {

	public static void main(String[] args) {
	
		/*
		 * Account
		 *  accountNumber: String
		 *  accountType: String	
		 *  balance: double
		 *  interestRate: double
		 *  owner: User
		 *  
		 * User
		 * 		ssn: String
		 * 		userName: String
		 * 		password: String
		 * 		dob: String
		 * 		firstName: String
		 * 		lastName: String
		 * 
		 * Transaction
		 * 		transactionID: String
		 * 		transactionType: String
		 * 		amount: double
		 * 		originAccountNumber: String
		 * 		deestingationAccountNumber: String
		 */

		
		User u = new User("111-11-1111", "Owen", "O'Keeffe");
		System.out.println(u.getFirstName() + " " + u.getLastName());
		
		
		
		
	}

}
