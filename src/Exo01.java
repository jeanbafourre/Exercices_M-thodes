public class Exo01 {
	
	/*
	Write a Java program to print 'Hello' on screen and then print your name on a separate line. 
	Expected Output :
	Hello 
	YourName YOurSurname
	*/


	// Je créé une méthode nommée "affichageNom", qui va imprimer mes deux arguments "t" et "s".
	public static void affichageNom (String t, String s) {
		System.out.print(t);
		System.out.println(s);
	}
	
	// Dans la méthode "main", j'appelle ma méthode "affichageNom" et j'initialise mes arguments directement entre les parenthèses de la méthode.
	public static void main(String[] args) {
		affichageNom ("Bonjour ", "Jean-Baptiste Fourré!");
	}

}
