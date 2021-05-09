abstract class User {
	protected String userName;
	protected int Id;
	protected String Password;
	protected String Email;

	public User() {
		System.out.println("New User is Created");
	}

	public void setUserEmail(String Email) {
		this.Email = Email;
	}

	public void setUserPassword(String Password) {
		this.Password = Password;
	}
	
	public String getUserEmail() {
		return Email;
	}
	
	abstract public void getUserDetails(); 
}

