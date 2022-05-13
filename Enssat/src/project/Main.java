package project;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Micheal");
		Employee emp1 = new Employee("Jack");
		Client client1 = new Client("Diana");
		
		
		Project project1 = new Project(client1, emp1); 

		System.out.println(project1.getClient());
		System.out.println(project1.getEmplyee());
		
		
		Task task1 = new Task("Calling the client", "using phone", LocalDate.of(2022, 4, 30), LocalDate.of(2022, 5, 30), 10 );
		project1.addRequiredTask(task1);
		
		Task task2 = new Task("Write a report", "using Microsoft tool", LocalDate.of(2022, 4, 25), LocalDate.of(2022, 4, 30), 3 );
		project1.addRequiredTask(task2);
		 
		
		
		project1.showAllRequiredTasks();
		

	}

}
