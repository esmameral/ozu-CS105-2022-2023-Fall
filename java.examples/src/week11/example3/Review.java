package week11.example3;

public class Review {
	private int rating;
	private String comment;

	/**
	 * Precondition: r >= 0, c is not null.
	 * @throws Exception 
	 */
	public Review(int r, String c) throws Exception {
		if(r<0) {
			throw new Exception("Rate must be greater than 0 !!! "+" rate:"+r+" comment:"+c);
		}
		rating = r;
		comment = c;
	}

	public int getRating() {
		return rating;
	}

	public String getComment() {
		return comment;
	}

}
