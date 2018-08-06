
public class Exo09 {
	
	/*
	Write a Java program that takes a number as input and prints its multiplication table up to 10.
	Test Data:
	Input a number: 8
	Expected Output :
	8 x 1 = 8
	8 x 2 = 16
	8 x 3 = 24
	...
	8 x 10 = 80
	*/
	
	// Je créé une méthode nommée "table" de type "void" avec une variables "multi" de type "int" dont la valeur sera fixe, puis une variable "i" dont la valeur change.
	public static void table (int multi, int i) {
		
		// Je créé une boucle qui va me permmettre de multiplier "multi" par "i" tant que "i" sera strictement inférieur à 11, avec une inrémentation pour "i" à chaque tour de boucle. 
		while (i<11) {
			int resultat = i*multi;
			System.out.println(multi + " x " + i + " = " + resultat);
			i++;
		}
	}

	public static void main(String[] args) {
		table(8, 1);


	}

}
