package project;

import java.time.LocalDate;

public class Task {
	private String title;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private int levelPriority;
	private boolean isExecuted;
	
	
	
	
	public Task(String title, String description, LocalDate startDate, LocalDate endDate, int levelPriority) {
 
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.levelPriority = levelPriority;
		
		this.isExecuted = false;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public int getLevelPriority() {
		return levelPriority;
	}
	public void setLevelPriority(int levelPriority) {
		this.levelPriority = levelPriority;
	}
	public boolean isExecuted() {
		return isExecuted;
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "title : "+title+ "\ndescription : "+description+ "\nstartDate : "+startDate+ "\nendDate : "+endDate+ "\nlevelPriority : "+levelPriority+ "\nisExecuted : "+isExecuted;
	}
	
	
	
	
}
