import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Autor Kamila Silva
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//char x;
		double z;
		int y;
		String x;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		//x = sc.next().charAt(0);
		//System.out.println("Você digitou: " + x);
		//System.out.printf("Você digitou: %.2f%n", x);
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
