
public class Exo11 {

	/*
	Write a Java program to compute a specified formula. 
	Specified Formula : 
	4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) 
	Expected Output
	2.9760461760461765
	 */

	// Je créé une méthode nommée "operation" de type "void", avec 7 arguments.
	public static void operation (double nb1, double nb2, double nb3, double nb4, double nb5, double nb6, double nb7) {
		double somme = nb1*(nb2-(nb2/nb3)+(nb2/nb4)-(nb2/nb5)+(nb2/nb6)-(nb2/nb7));
		System.out.print(somme);
	}

	// Dans la méthode principale, j'appelle ma méthode "operation".
	public static void main(String[] args) {
		operation(4.0, 1.0, 3, 5, 7, 9, 11);

	}
}