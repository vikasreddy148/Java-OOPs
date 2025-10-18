package test;
import entity.*;
public class Launch {
	public static void main(String[] args) {
		Project p1 = new Project(1,"Gmail","Abhishek");
		Project p2 = new Project(2,"Gdrive","Vikas");
		Project p3 = new Project(3,"Gphotos","Varun");
		
		
		Employee emp1 =new Employee(19,"Arjun",p1,p2);
		Employee emp2 =new Employee(20,"Sachin",p2,p3);
		Employee emp3 =new Employee(21,"Virat",p1,p2,p3);
		
		
			
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);

	
}
}
