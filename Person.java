class Person {
	
    String name;
    int age;
    String address;
    String occupation;
    boolean isStudent;
	
	// constructor 
	public  Person(String pName,int pAge,String pAdress,String pOccupation,boolean pIsStudent){
		
	//initialise the instance variables	
	   name = pName;
		age = pAge;
		address = pAdress;
		occupation = pOccupation;
		isStudent = pIsStudent;
		
	 System.out.println("the Person constructor is invoked");
 }
	
	public void personDetails(){
	
	}
}
