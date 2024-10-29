import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		double waktu = scanner.nextDouble();
		double ipk = scanner.nextDouble();
		System.out.print("");
		int eprt = scanner.nextInt();
		System.out.print("");
		String hak = scanner.nextLine();
		System.out.print("");
		String lomba = scanner.nextLine();

		boolean cumlaude;
		if (hak.equals("ada")) {
			System.out.println("Cumlaude");;
			} else if (lomba.equals("ada")) {
			System.out.println("Cumlaude");;
		    } else if (waktu <= 3.0) {
				System.out.println("Cumlaude");;
			} else if (ipk >= 3.5) {
				System.out.println("Cumlaude");;
			} else if (eprt >= 450) {
				System.out.println("Cumlaude");;
			} else {
				System.out.println("Tidak Cumlaude");
				return;
			}
}
}
	
		











