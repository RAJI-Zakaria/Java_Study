package project;

import java.util.ArrayList;

public class Project {
	Client client;
	Employee emplyee;
	ArrayList<Task> requiredTasks;
	ArrayList<Task> subTasks;

	public Project(Client client, Employee emplyee) {
		requiredTasks = new ArrayList<Task>();
		this.client = client;
		this.emplyee = emplyee;
	}
	
	public void showAllRequiredTasks() {
		for(Task task : requiredTasks ) {
			System.out.println(task);
			System.out.println("--------------------------");
		}
	}

	public void addRequiredTask(Task task1) {
		requiredTasks.add(task1); 
	}

	public Client getClient() {
		return client;
	}

	public Employee getEmplyee() {
		return emplyee;
	}
	
	
}
