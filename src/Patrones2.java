import java.util.Scanner;

public class Patrones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int a = sc.nextInt();
		
		for (int i=0; i<a; i++) { 
			if (i%2==0) { 
					System.out.printf("*");
			}
			else {	System.out.printf(".");
			}
	
			}
					System.out.printf("\n");
		
		for (int i= 0; i<a; i++) {
			if (i%2==0) {
					System.out.printf("12");
			}
			else {	System.out.printf("34");
			}
			}
					System.out.printf("\n");
		
		for (int i= 0; i<a; i++) {
			if (i%2==0) {
					System.out.printf("||");
			}
			else {	System.out.printf(".");
			}
			}
					System.out.printf("\n");
	}
}

