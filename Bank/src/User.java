import java.util.UUID;

public class User {
private String userID;
private String ssn;
private String userName;
private String firstName;
private String lastName;
Account account;

public User(String ssn, String firstName, String lastName) {
	this.userID = UUID.randomUUID().toString();
	this.ssn = ssn;
	this.firstName = firstName;
	this.lastName = lastName;
	
}

public String getUserID() {
	return userID;
}

public void setUserID(String userID) {
	this.userID = userID;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSsn() {
	return ssn;
}

public Account getAccount() {
	return account;
}

}
