import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) { //Metodo Main
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de carateres para patrones");
		int a = sc.nextInt();
		patron1(a); // Primer Patron
		System.out.println();
		patron2(a); // Segundo Patron
		System.out.println();
		patron3(a); // Tercer Patron
	}
	
	
	public static void patron1(int a) { // Metodo primer patron
		
		for (int i=0; i<a; i++) { // Ciclo patron con contador int i
			if (i%2==0) {	// Validacion para ejecucion secuencial de patron
			System.out.printf("*");
			} else {
				System.out.printf(".");}
		}
				System.out.printf("\n"); 
	}
	
	public static void patron2(int a) { // Metodo segundo patron
		
	
		for (int i=0; i < a; i++) { // Ciclo patron con contador int i
			if (i%2==0) { // Validacion para ejecucion secuencial de patron
				System.out.printf("12");
			} else { 
				System.out.printf("34");
			}
		}
				System.out.printf("\n");
	}
			
	public static void patron3(int a) { //Metodo tercer patron
			
		for (int i=0; i< a; i++) { // Ciclo patron con contador int i
			if (i%2==0) { // Validacion para ejecucion secuencial de patron
				System.out.printf("||");
			} else {
				System.out.printf(".");
			}
		}
	}

}
