
public class Exo05 {

	/*
	Write a Java program that takes two numbers as input and display the product of two numbers. 
	Test Data:
	Input first number: 25
	Input second number: 5  
	Expected Output :
	25 x 5 = 125
	*/
	
	// Je créé une méthode nommée "multiplication" de type "int" avec deux variables.
	public static int multiplication(int firstNb, int secondNb) {
		int product = firstNb*secondNb;										// La méthode créé une variable "product" qui est égale au produit des deux arguments 
		System.out.println(firstNb + " x " + secondNb + " = " + product);	// La méthode affiche une concaténation de Strings, 
		return product;														// La méthode retourne la variable "product".
	}
	
	// Dans la méthode "main", j'appelle la méthode "multiplication" en initialisant ses arguments.
	public static void main(String[] args) {
		multiplication(25, 5);

	}

}
