public class Person{
	        public String fname = "John";
	        public String lname = "doe";
	        public int age = 20;
}
public class Program
{
    public static void main(String[] args){
	    Person person = new Person();
	    System.out.println("My Name Is:" + person.fname + " and my last name is:" + person.lname + " And my age is:" + person.age);
    }
}
