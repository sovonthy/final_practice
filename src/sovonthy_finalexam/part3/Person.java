package sovonthy_finalexam.part3;

public abstract class Person {
	private String name;
	protected double nbOfSleepHours;
	public Person(String name, double nbOfSleepHours) {
		this.name = name;
		this.nbOfSleepHours = nbOfSleepHours;
	}
	public String getName() {
		return name;
	}
	public double getNbOfSleepHours() {
		return nbOfSleepHours;
	}
	public abstract void showSleepQuality();
}
