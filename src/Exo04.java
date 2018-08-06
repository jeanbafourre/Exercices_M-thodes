
public class Exo04 {

	/*
	Write a Java program to print the result of the following operations.
	Test Data:
	a. -5 + 8 * 6
	b. (55+9) % 9 
	c. 20 + -3*5 / 8 
	d. 5+15/3*2-8%3
	
	Expected Output :
	43 
	1 
	19 
	13
	*/
	
	// Je créé une méthode nommée "operation" de type "int" avec 11 arguments.
	public static void operation (int nb1, int nb2, int nb3, int nb4, int nb5, int nb6, int nb7, int nb8, int nb9, int nb10, int nb11) {
		
		int sum1 = nb10 + nb2 * nb3; 					// La méthode créé une variable "sum1" de type "int" qui effectue une opération.
		System.out.println(sum1);						// La méthode affiche la valeur de la variable "sum1"
		
		int sum2 = (nb4 + nb5) % nb5;
		System.out.println(sum2);
		
		
		int sum3 = nb6 + (nb11 * nb1 / nb2);
		System.out.println(sum3);
		
		
		int sum4 = nb1 + nb8 / nb7 * nb9 - nb2 % nb7;
		System.out.println(sum4);
		
	}
	
	// Dans la méthode "main", j'appelle la méthode "operation" en initialisant ses 11 arguments.
	public static void main(String[] args) {
	operation(5, 8, 6, 55, 9, 20, 3, 15, 2, -5, -3);

	}

}
