package week11.example3;

import java.util.ArrayList;
import java.util.List;

public class ReviewAnalysis {
	private List<Review> allReviews = new ArrayList<>();

	public ReviewAnalysis() {

	}

	public List<String> collectComments() {
		List<String> formattedComments = new ArrayList<String>();
		for (int i = 0; i < allReviews.size(); i++) {
			String comment = allReviews.get(i).getComment();
			if (comment != null && comment.length() != 0 && comment.contains("!")) {
				if (!comment.endsWith(".") && !comment.endsWith("!")) {
					comment += ".";
				}
				
				formattedComments.add(i + "-" + comment);
			}

		}
		System.out.println(formattedComments.getClass().getSimpleName());
		return  formattedComments;
	}

	public double getAverageRating() {
		double sum = 0;
		for (int i = 0; i < allReviews.size(); i++) {
			Review aReview = allReviews.get(i);
			sum += aReview.getRating();
		}

		return sum / allReviews.size();
	}

	public List<Review> getAllReviews() {
		return allReviews;
	}

	public void setAllReviews(List<Review> allReviews) {
		this.allReviews = allReviews;
	}

}
