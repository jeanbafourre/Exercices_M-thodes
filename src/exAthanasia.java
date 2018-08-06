
public class exAthanasia {
	
	// "void" est un TYPE qui est vide. Il ne retourne rien du tout.
	/*
	 void somme (int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	*/
	
	public static int somme1(int c, int d) {
		int sum = c+d;
		return sum;
	}

	public static void main(String[] args) {
		int s = somme1(10,20);
		System.out.println(s);
		int oh = s+51;
		System.out.println(oh);
	}

}
