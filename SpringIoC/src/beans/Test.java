package beans;

public class Test {
	
	private String name;
	private int age;
	private String email;
	private int phnNo;
	
	public void setPhnNo(int phnNo) {
		this.phnNo = phnNo;
	}
	private Test() {
		System.out.println("Constructor calling.....");
	}
	public Test(String name, int age, String email) {
		this.name= name;
		this.age = age;
		this.email = email;
		
	}
	
	public void helloWorld() {
		System.out.println("Hello Spring.....");
		System.out.println("My name is : "+name+" and my age is : "+age+" and you can mail me at :"+email);
		System.out.println("You can also call me at : "+phnNo);
	}
}
