class PersonTester{

    public static void main(String[] args){
	
	   //parameterised constructor
        Person person1 = new Person("Dev",25,"1 Main Street","Engineer",false);
    /*   no argument constructor
	    person1.name = "Dev";
        person1.age = 25;
        person1.address = "1 Main Street, City";
        person1.occupation = "Engineer";
        person1.isStudent = false;*/
        System.out.println(person1.name + "|" + person1.age + "|" + person1.address + "|" + person1.occupation + "|" + person1.isStudent);

        Person person2 = new Person("Suhas",30,"2 A Street","Teacher",false);
       /* person2.name = "Suhas";
        person2.age = 30;
        person2.address = "2 A Street, Town";
        person2.occupation = "Teacher";
        person2.isStudent = false;*/
        System.out.println(person2.name + "|" + person2.age + "|" + person2.address + "|" + person2.occupation + "|" + person2.isStudent);

        Person person3 = new Person("Kiran",18,"3 B Street","Student",true);
       /* person3.name = "Kiran";
        person3.age = 18;
        person3.address = "3 B Street, Village";
        person3.occupation = "Student";
        person3.isStudent = true; */
        System.out.println(person3.name + "|" + person3.age + "|" + person3.address + "|" + person3.occupation + "|" + person3.isStudent);

        Person person4 = new Person("Emily Brown",40,"4 C Street","Doctor",false);
       /* person4.name = "Emily Brown";
        person4.age = 40;
        person4.address = "4 C Street, City";
        person4.occupation = "Doctor";
        person4.isStudent = false; */
        System.out.println(person4.name + "|" + person4.age + "|" + person4.address + "|" + person4.occupation + "|" + person4.isStudent);

        Person person5 = new Person("Yashwanth",50,"5  D Street","Lawyer",false);
       /* person5.name = "Yashwanth";
        person5.age = 50;
        person5.address = "5  D Street, Town";
        person5.occupation = "Lawyer";
        person5.isStudent = false; */
        System.out.println(person5.name + "|" + person5.age + "|" + person5.address + "|" + person5.occupation + "|" + person5.isStudent);

      /*  Person person6 = new Person();
        person6.name = "Eshwar";
        person6.age = 22;
        person6.address = "6 E Street, Village";
        person6.occupation = "Student";
        person6.isStudent = true;
        System.out.println(person6.name + "|" + person6.age + "|" + person6.address + "|" + person6.occupation + "|" + person6.isStudent);

        Person person7 = new Person();
        person7.name = "venkatesh";
        person7.age = 35;
        person7.address = "7 F Street, City";
        person7.occupation = "Engineer";
        person7.isStudent = false;
        System.out.println(person7.name + "|" + person7.age + "|" + person7.address + "|" + person7.occupation + "|" + person7.isStudent);

        Person person8 = new Person();
        person8.name = "Bharath";
        person8.age = 28;
        person8.address = "8 G Street, Town";
        person8.occupation = "Artist";
        person8.isStudent = false;
        System.out.println(person8.name + "|" + person8.age + "|" + person8.address + "|" + person8.occupation + "|" + person8.isStudent);

        Person person9 = new Person();
        person9.name = "Darshan";
        person9.age = 19;
        person9.address = "9 P Street, City";
        person9.occupation = "Student";
        person9.isStudent = true;
        System.out.println(person9.name + "|" + person9.age + "|" + person9.address + "|" + person9.occupation + "|" + person9.isStudent);

        Person person10 = new Person();
        person10.name = "Shankar";
        person10.age = 45;
        person10.address = "10 Q  Street, Town";
        person10.occupation = "Teacher";
        person10.isStudent = false;
        System.out.println(person10.name + "|" + person10.age + "|" + person10.address + "|" + person10.occupation + "|" + person10.isStudent);*/
    }
}
