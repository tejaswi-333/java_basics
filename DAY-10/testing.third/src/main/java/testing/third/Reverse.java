package testing.third;

public class Reverse {
	public String revrse(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return reversed;
	}
}
