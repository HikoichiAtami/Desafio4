import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para dibujar el patron"); // mensaje enviado por consola para ingreso de datos
		int a = sc.nextInt(); // variable int compartida para cada metodo
		
		patron(a); // patron cuadrado vacio
		System.out.println(); // salto de linea para que no queden juntos
		patron2(a); // patron Z
		System.out.println(); // salto de linea
		patron3(a); // patron X
	}
		
	public static void patron(int a) { //Metodo patron cuadrado vacio
		
		int i,j; // variables contador globales
		
		for(i = 0 ; i < a ; i++) { //Patron inicio
			 	System.out.printf("*");
				}
				System.out.printf("\n");
			
			for(j = 0 ; j < a - 2 ;j++) { // patron central
				System.out.printf("*"); 
			
			for(i = 0 ; i < a - 2 ;i++) { // patron central
				System.out.printf(" ");
				}
			 	System.out.printf("*"); 
			 	System.out.printf("\n");
				}
			
			for(i = 0 ; i < a ; i++) { // patron final
				System.out.printf("*");
				}
				System.out.printf("\n");
			
		}
	public static void patron2(int a) { // metodo patron Z
		
		
		for(int i = 0 ; i < a ;i++){ // patron inicio
			for(int j = 0 ; j < a ;j++){
				if(i==0 || i==a-1){	// condiciones para impresion patron central
					System.out.printf("*");	
				}else if (i+j==a-1){ // condiciones para impresion patron central
					System.out.printf("*");				
				}else{ 				//condicion fin patron
					System.out.printf(" ");
				}				
			}
			System.out.printf("\n");
		}
	
	}
	
	public static void patron3(int a) { // metodo patron X
	
		
		for (int i = 1; i <=a ; i++) { // inicio patron
            for (int j = 1; j <=a; j++){
                if (i == j) {	// condiciones para impresion patron central
                	System.out.print("*");
               
                } else if (i + j == a + 1 ){ // condiciones para impresion patron central
                	System.out.print("*");
                
                } else {					// fin patron
                
                    System.out.print(" ");
                }
            	}
            		System.out.printf("\n");
		}
	}
}
	
	


	

