
public class Exo06 {

	/*
	Write a Java program to print the sum (addition) of two numbers.
	Test Data:
	Input first number: 125
	Input second number: 24
	Expected Output :
	125 + 24 = 149
	 */
	
	// Je créé une méthode "addition" de type "int", avec deux arguments.
	public static int addition(int nb1, int nb2) {
		int sum = nb1 + nb2;
		System.out.print(nb1 + " + " + nb2 + " = " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		// J'appelle ma méthode "addition" en initialisant mes arguments
		addition(125,24);
	}

}
