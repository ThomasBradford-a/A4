package backend;

class Account {
	private String id;
	private String name; 
	private double balance;
	//this has no modifier as it provides the righgt level of security / privacy (eg private, public)
	Account(String id, String name, double balance) throws Exception {
		
		this.id = id;
		if(name.isBlank())
			throw new Exception("name is blank");
		this.name = name;
		if(balance<0)
			throw new Exception("balance is negative");
		this.balance = balance;
		
	}
	public String toString() {
	String message="";
	message += this.id+",";
	message +=this.name+",";
	message+=this.balance+",";
		return message;
	}
}
