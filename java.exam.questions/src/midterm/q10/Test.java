package midterm.q10;

public class Test {

	public static void main(String[] args) {
		StepTracker tr = new StepTracker(10000);
		System.out.println("Active days:"+tr.activeDays()); 
		System.out.println("Average steps:"+tr.averageSteps());
		tr.addDailySteps(9000);
		tr.addDailySteps(5000);
		System.out.println("Active days:"+tr.activeDays());
		System.out.println("Average steps:"+tr.averageSteps());
		tr.addDailySteps(13000);
		System.out.println("Active days:"+tr.activeDays());
		System.out.println("Average steps:"+tr.averageSteps());
		tr.addDailySteps(23000);
		tr.addDailySteps(1000);
		System.out.println("Active days:"+tr.activeDays());
		System.out.println("Average steps:"+tr.averageSteps());
		System.out.println("Total Steps:"+tr.getTotalSteps());
	

	}

}
