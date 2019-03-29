package ConstructoDemo;

public class First {
	int rollno;
	String name;
	static String College="KIT";
	static String University="KUK";
	
	
	First(){
		System.out.println("This is the default Constructor");
		this.rollno=rollno;
		this.name=name;
	}
	
	First(int a,String b){
		System.out.println("This is the parameterized Constructor");
		rollno=a;
		name=b;
		
	}
	static {
		System.out.println("This is the static block");
	}
	
	void display() {
		System.out.println("Rollno is : " + rollno + "\nName is : " + name + "\n" + College + "\n" + University);
	}
	
	static void display1() {
		University="KURUKSHETRA UNIVERSITY";
	}

	public static void main(String[] args) {
		First ss=new First(111,"SINGLA");
		//First ss1=new First(123,"TEJAS");
		ss.display();
		First.College="Kit:";
		//ss1.display();
		// TODO Auto-generated method stub

	}

}
