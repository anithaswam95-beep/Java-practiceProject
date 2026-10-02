package stringDemo;

public class StringBasics {

	public static void main(String[] args) {

		String s1 = "Selenium";
		String s2 = "Selenium";

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		System.out.println("s1 == s2 : " + (s1 == s2));

		System.out.println("s1.equals(s2) : " + s1.equals(s2));

		String s3 = new String("Selenium");

		System.out.println("s3 = " + s3);

		System.out.println("s1 == s3 : " + (s1 == s3));

		System.out.println("s1.equals(s3) : " + s1.equals(s3));
	}
}
