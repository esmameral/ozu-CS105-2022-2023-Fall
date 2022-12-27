package week13.mvc.example;

public class App {
	public static void main(String[] args) {
		// Assemble all the pieces of the MVC
		Model m = new Model("Kaan");
		View v = new View("MVC Example");
		Controller c = new Controller(m, v);
		c.initController();
	}
}
