package day14_api.lang.object;

public class Person implements Cloneable{
	
	private String name;
	
	public Person(String name) {
		this.name  =name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.getName().equals(this.name)) {
				return true;
			}
		}
		// Person의 이름이 같은지 확인해서 같다면 true
		return false; //이름이 같지않다
	}

	@Override
	public String toString() {
		return "멤버변수:"+name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	protected void finalize() throws Throwable {
		System.out.println(this.name +"님 소멸했습니다");
	} 
	
	
	
	
	
	
	
	
	
//	
	
}
