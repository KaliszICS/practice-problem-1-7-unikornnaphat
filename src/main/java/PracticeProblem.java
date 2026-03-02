import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 && bool2);
        System.out.println(bool1 || bool2);
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a lowercase letter: ");
        char c1 = scanner.next().charAt(0);
        System.out.print("Input another lowercase letter: ");
        char c2 = scanner.next().charAt(0);
        System.out.println(c1 < c2);
        scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = scanner.nextDouble();
        System.out.println(num >= 0 && num <= 10);
        scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = scanner.nextDouble();
        System.out.println(num > 0 && num != 5);
        scanner.close();
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scanner.next();
        System.out.println(!word.equals("banana"));
        scanner.close();
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println(num % 2 == 0);
        scanner.close();
	}

}
