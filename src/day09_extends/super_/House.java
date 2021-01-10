package day09_extends.super_;

public class House extends Person {
	// house
	private Person[] persons;
	public House() {
		persons = new Person[10];
	}
	
	public void getIn(Person[] p) {
		for(int i = 0; i<p.length; i++) {
			persons[i] = p[i];
			}
	}
	
	public void print() {
		for(int i = 0; i<persons.length;i++) {
			if(persons[i] != null) {
				System.out.println("이름 : " + persons[i].getName() +", 나이 : " + persons[i].getAge());
			}
		}
	}

	public Person[] getPersons() {
		return this.persons;
	}
	
	public void setPersons(Person[] persons ) {
		this.persons = persons;
	}
	
	
}
