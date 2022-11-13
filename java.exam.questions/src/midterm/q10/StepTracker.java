package midterm.q10;

public class StepTracker {
	private int minSteps;
	private int totalSteps;
	private int numOfDays;
	private int activeDays;

	public StepTracker(int dailyStepsGoal) {
		minSteps = dailyStepsGoal;
		totalSteps = 0;
		numOfDays = 0;
		activeDays = 0;
	}

	public void addDailySteps(int steps) {
		totalSteps += steps;
		numOfDays++;
		if (steps >= minSteps) {
			activeDays++;
		}
	}

	public int activeDays() {
		return activeDays;
	}

	public double averageSteps() {
		if (numOfDays == 0) {
			return 0.0;
		} else {
			return (double) totalSteps / numOfDays;
		}
	}

	public int getTotalSteps() {
		return totalSteps;
	}
}
