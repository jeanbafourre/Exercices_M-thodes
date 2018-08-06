
public class Exo09bis {
	
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
	
	public static void table (int multi, int i) {
		
		for (i=1; i<11; i++) {
			int resultat = i*multi;
			System.out.println(multi + " x " + i + " = " + resultat);
		}
	}

	public static void main(String[] args) {
		table(8, 1);
	}

}
