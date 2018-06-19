package emp;

public class Sales extends Employee implements Bonus {
	
	public Sales(){
		
	}
	public Sales(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	
	public double tax(){
		double tax=getSalary()*0.13;
		return tax;
	}
	public void incentive(int pay){
		int inc=(int)(getSalary()+1.2*pay);
		setSalary(inc);
		
	}

}
