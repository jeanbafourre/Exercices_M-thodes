
public class Exo07 {

	/*
	Write a Java program to divide two numbers and print the results (without the digits after the comma).
	Test Data:
	Input first number: 125
	Input second number: 24
	Expected Output :
	125 / 24 = 5
	*/
	
	// Je créé une méthode nommée "divide" de type "int", avec deux arguments.
	public static int divide(int nb1, int nb2) {
	int division = nb1 / nb2;
	System.out.println(nb1 + " / " + nb2 + " = " + division);
	return division;
	}
	
	public static void main(String[] args) {
		// J'appelle ma méthode "divide"
		divide(125, 24);

	}

}
