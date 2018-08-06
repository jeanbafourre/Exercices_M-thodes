
public class Exo12 {

	/*
	Write a Java program that calculates the average of  three  predefined numbers.
	 */

	// Je créé une méthode nommmée "average" de type "double" avec 4 arguments.
	public static void average (double nb1, double nb2, double nb3, int nb4) {
		double sum = (nb1+nb2+nb3) / nb4;
		System.out.print(sum);
	}

	// Dans la méthode principale, j'appelle ma méthode "average".
	public static void main(String[] args) {
		average(2.4, 3.9, 4.2, 3);
	}
}
