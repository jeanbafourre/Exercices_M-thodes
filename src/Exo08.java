
public class Exo08 {
	/*
	Write a Java program to calculate the remainder of division of two numbers and print the results.
	Test Data:
	Input first number: 125
	Input second number: 24
	Expected Output :
	125 mod 24 = 5
	*/
	
	// Je créé une méthode nommée "modulo" de type "int", avec deux arguments.
	public static int modulo (int nb1, int nb2) {
		int result = nb1 % nb2;
		System.out.print(nb1 + " mod " + nb2 + " = " + result);
		return result;
	}
	
	public static void main(String[] args) {
		// J'appelle ma méthode "modulo".
		modulo(125, 24);

	}

}
