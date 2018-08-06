
public class Exo02 {

	/*
	Write a Java program to print the sum of six numbers. Go to the editor
	Test Data: 
	74 + 36 +5 +10+15+10
	Expected Output :
	150
	 */

	// Je créé une méthode nommée "addition" de type "int", avec six arguments.
	public static int addition (int nb1, int nb2, int nb3, int nb4, int nb5, int nb6) {
		// Cette méthode fait 3 choses :
		int sum = nb1 + nb2 + nb3 + nb4 + nb5 + nb6;	// Elle créé une variable "sum" de type "int" qui additionne les six arguments.
		System.out.println(sum);						// Elle affiche la valeur de cette variable.
		return sum;										// Elle fait un "return".
	}

	// J'appelle la méthode "addition" dans la méthode "main" en initialisant ses arguments.
	public static void main(String[] args) {
		addition(74, 36, 5, 10, 15, 10);
	}

}
