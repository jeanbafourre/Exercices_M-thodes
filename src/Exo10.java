
public class Exo10 {

	/*
	Write a Java program to compute the specified expressions and print the output.
	Test Data:
	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
	Expected Output
	2.138888888888889
	*/
	
	// Je créé une méthode nommée "operation" de type "void", avec 4 arguments.
	public static void operation (double nb1, double nb2, double nb3, double nb4) {
		double somme = (nb1*nb2-(nb2*nb2)) / (nb3-nb4);
		System.out.print(somme);
	}

	// Dans la méthode principale, j'appelle ma méthode "operation".
	public static void main(String[] args) {
		operation(25.5, 3.5, 40.5, 4.5);


	}

}
