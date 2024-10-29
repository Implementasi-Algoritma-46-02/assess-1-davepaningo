import java.util.Scanner;
public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		int A = scanner.nextInt();
		System.out.print("");
		int B = scanner.nextInt();
		System.out.print("");
		int C = scanner.nextInt();
		System.out.print("");
		int D = scanner.nextInt();
		System.out.print("");
		int E = scanner.nextInt();

		if (A % 2 == 2 && B % 2 == 2 && C % 2 == 2 && D % 2 == 2 && E % 2 == 2) {
			System.out.println("valid"); 
          }else if (A % 2 == 0 && B % 2 == 0 && C % 2 == 0 && D % 2 == 0 && E % 2 == 0) {
			System.out.println("tidak valid");
		  } else {
			System.out.println("tidak valid");
		   } return;


		}
		}

		


