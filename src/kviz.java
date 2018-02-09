import java.util.Scanner;

public class kviz {

	public static void main(String[] args) {
		randomSabiranje();
		randomOduzimanje();
	}

	public static void randomSabiranje() {
		// public static int randomSabiranje(int a, int b)
		// uklonio argumente a i b, jer metoda generise dva random broja
		// i pita korisnika da unese rezultat

		Scanner input = new Scanner(System.in);
		int rndNumA = (int) (Math.random() * 10);
		int rndNumB = (int) (Math.random() * 10);
		int answer;

		System.out.print("Koliko je " + rndNumA + "+" + rndNumB + "? :");
		answer = input.nextInt();

		if (answer == (rndNumA + rndNumB)) {
			System.out.println("Odgovor je TACAN");
		} else {
			System.out.println("Odgovor NIJE TACAN. Tacan odgovor je " + (rndNumA + rndNumB));
		}
	}

	public static void randomOduzimanje() {
		// public static int randomOduzimanje(int a, int b)
		// uklonio argumente a i b, jer metoda generise dva random broja
		// i pita korisnika da unese rezultat

		Scanner input = new Scanner(System.in);
		int rndNumA = (int) (Math.random() * 10);
		int rndNumB = (int) (Math.random() * 10);
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
		} else {
			System.out.println("Odgovor NIJE TACAN. Tacan odgovor je " + (rndNumA - rndNumB));
		}
	}

	public static void randomMnozenje() {
		Scanner input = new Scanner(System.in);

		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);

		System.out.println("Koliko je " + a + " * " + b + " ?");
		int odgovor = input.nextInt();

		if (odgovor == a * b) {
			System.out.println("Unijeli ste tacan odgovor.");
		} else {
			System.out.println("Unijeli ste pogresan odgovor.");
		}

		input.close();

	}

	public static void randomDjeljenje() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 50);

		Scanner input = new Scanner(System.in);

		System.out.println("Koliko je " + a + " / " + b + " ?");

		int rezultat = input.nextInt();

		if (rezultat == a / b) {
			System.out.println("Odgovor je tacan.");
		} else {
			System.out.println("Odgovor nije tacan.");
		}
		input.close();
	}

	public static int randomKorjenovanje(int a) {
		// Eldin
	}

	public static int randomKvadriranje(int b) {
		// Eldin
	}

}
