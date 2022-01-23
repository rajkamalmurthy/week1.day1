package week1.day1;

public class Mobile {

	private void makeCall() 
	{
		int mobileNumber=978732222;
		System.out.println("calling "+ mobileNumber);
	}
	
	private void sendMsg()
	{
		String message ="Hi";
		System.out.println("sendingMessage "+message);
		
	}
	
	private void saveContact()
	{
		int contact= 978732222;
		System.out.println("saving contact " +contact);
	}
	
	public static void main(String[] args) 
	{
		Mobile object = new Mobile();
		object.sendMsg();
		object.makeCall();
		object.saveContact();
	}
}
