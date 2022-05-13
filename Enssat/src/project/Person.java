package project;

public class Person {
	private String name;
	//last name
	//email \
	//phone number
	 
	public Person(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//name mustn't contain any special chars #@%$ 123356 
		//REGEX
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My Name is "+getName();
	}

	public boolean equals(Person person) {
		// TODO Auto-generated method stub
		return this.name.equals(person.name);
	}
	
	
	
	
	
}
