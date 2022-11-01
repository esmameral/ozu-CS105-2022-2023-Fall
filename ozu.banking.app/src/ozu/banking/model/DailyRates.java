package ozu.banking.model;

public class DailyRates {
	 private static double interestRate=12.75;
	 private static double usdRate=18.50;
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		DailyRates.interestRate = interestRate;
	}
	public static double getUsdRate() {
		return usdRate;
	}
	public static void setUsdRate(double usdRate) {
		DailyRates.usdRate = usdRate;
	}
}
