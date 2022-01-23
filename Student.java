package week1.day1;

public class Student {
	
	String name="raj";
	int rollNo = 1;
	
public static void main(String[] args) {
	Student object = new Student();
			object.College();
	int num=object.rollNumber();
	System.out.println("rollNumber is " + num);
System.out.println("studentName is " +object.name);
}


public void College() {
	
	System.out.println("College Name :SRM");
}
	private int rollNumber() 
	{
		int roll=5;
		return(roll);
		
	}
	

}
