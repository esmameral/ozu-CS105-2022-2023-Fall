package week11.example3;

public class TestAnalysis {

	public static void main(String[] args) {
		try {
			ReviewAnalysis analysis = new ReviewAnalysis();
			


			Review r1 = new Review(4, "Good! Thx");
			Review r2 = new Review(3, "OK site");
			Review r3 = new Review(5, "Great!");
			
			Review r4 = new Review(2, "Poor! Bad.");
			Review r5 = new Review(3, "");
			Review r6 = new Review(5, "Super !!");
			Review r7 = new Review(2, "xxx");

			analysis.getAllReviews().add(r1);
			analysis.getAllReviews().add(r2);
			analysis.getAllReviews().add(r3);
			analysis.getAllReviews().add(r4);
			analysis.getAllReviews().add(r5);
			analysis.getAllReviews().add(r6);
			analysis.getAllReviews().add(r7);
			System.out.println("AVG:" + analysis.getAverageRating());

			for (String element : analysis.collectComments()) {
				System.out.println(element);
			}
		} catch (Exception e) {
			System.out.println("Some of the reviews could not be added to the list!!");
			e.printStackTrace();
		}
	}

}
