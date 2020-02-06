package sovonthy_finalexam.part3;

public class Student extends Person {
	private String schoolName;
	
	public Student(String schoolName, String name, double nbOfSleepHours) {
		super(name, nbOfSleepHours);
		this.schoolName = schoolName;
	
	}

	@Override
	public void showSleepQuality() {
		if(getNbOfSleepHours()<7) {
			System.out.println(getName() + " need more sleep");
		}else if(getNbOfSleepHours()<9) {
			System.out.println("have enough sleep");
		}else {
			System.out.println("is probably sleep to much");
		}
		
	}
	public String toString() {
		String result = "Student:[name: " +getName()+", school:"+schoolName + " ]";
		return result;
	}


	
}
