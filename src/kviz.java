import java.util.Scanner;

public class kviz {

	public static void main(String[] args) {
		randomSabiranje();
		randomOduzimanje();
	}
	
    public static void randomSabiranje(){
		// public static int randomSabiranje(int a, int b)
		// uklonio argumente a i b, jer metoda generise dva random broja
		// i pita korisnika da unese rezultat

		Scanner input = new Scanner(System.in);
		int rndNumA = (int)(Math.random()*10);
		int rndNumB = (int)(Math.random()*10);
		int answer;

		System.out.print("Koliko je " + rndNumA + "+" + rndNumB + "? :");
		answer = input.nextInt();

		if (answer == (rndNumA + rndNumB)) {
			System.out.println("Odgovor je TACAN");
		}
		else {
			System.out.println("Odgovor NIJE TACAN. Tacan odgovor je " + (rndNumA+rndNumB));
		}
	}

	public static void randomOduzimanje(){
		// public static int randomOduzimanje(int a, int b)
		// uklonio argumente a i b, jer metoda generise dva random broja
		// i pita korisnika da unese rezultat

		Scanner input = new Scanner(System.in);
		int rndNumA = (int)(Math.random()*10);
		int rndNumB = (int)(Math.random()*10);
		int answer;

		if (rndNumA < rndNumB) {
			int tmp = rndNumA;
			rndNumA = rndNumB;
			rndNumB = tmp;
		}

		System.out.print("Koliko je " + rndNumA + "-" + rndNumB + "? :");
		answer = input.nextInt();

		if (answer == (rndNumA + rndNumB)) {
			System.out.println("Odgovor je TACAN");
		}
		else {
			System.out.println("Odgovor NIJE TACAN. Tacan odgovor je " + (rndNumA-rndNumB));
		}
	}

	public static int randomMnozenje(int a, int b){
		
	}
	public static int randomDjeljenje(int a, int b){

	}
	public static int randomKorjenovanje(int a){
		// Eldin
	}
	public static int randomKvadriranje(int b){
		// Eldin
	}
	
}
