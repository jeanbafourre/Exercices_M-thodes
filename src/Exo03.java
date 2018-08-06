
public class Exo03 {

	/*
	Write a Java program to divide two numbers and print on the screen . 
	Test Data : 
	50/3
	Expected Output :
	16.6666667
	 */

	// Je créé une méthode nommée "division" de type "double" avec deux arguments.
	public static double division (double nb1, double nb2) {
									// Cette méthode fait 3 choses :
		double sum = nb1 / nb2;		// Elle créé une variable "sum" de type "double", qui divisera le premier argument par le second.
		System.out.print(sum);		// Elle affiche de résultat de "sum"
		return sum;					// Elle retourne la variable "sum".
	}

	// Dans la méthode "main", j'appelle la méthode "division" en initialisant ses 2 arguments.
	public static void main(String[] args) {
		division(50, 3);
	}

}
