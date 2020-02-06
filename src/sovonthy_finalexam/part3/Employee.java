package sovonthy_finalexam.part3;

public class Employee extends Person implements ITaxPayable {
	private double salary;
	public Employee(String name, double nbOfSleepHours, double salary) {
		super(name, nbOfSleepHours);
		this.salary = salary;
	}

	@Override
	public double calculateNetSalary() {
		double netSalary;
		double tax;
		
		if(salary<=200) {
			tax = salary * 5/100;
		}else {
			tax = salary * 0.1;
		}
		netSalary = salary - tax;
		return netSalary;
	}
	@Override
	public void showSleepQuality() {
		if(getNbOfSleepHours()<5) {
			System.out.println(getName() + " need more sleep");
		}else if(getNbOfSleepHours()<=8) {
			System.out.println("have enough sleep");
		}else {
			System.out.println("is probably sleep to much");
		}
	
	}

	public String toString() {
		String result = "Employee:[name: " +getName()+", salary:"+calculateNetSalary() + " ]";
		return result;
	}
}
