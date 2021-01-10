package day10_public.encap.obj;

public class Hotel {
	
	private Chef chef;
	private Employee emp;
	String s ;
	
	public Hotel() {
		this.chef = new Chef() ;
		this.emp = new Employee();	
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return this.chef;
	}
	
	public void setEmp(Employee em) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
	
}
