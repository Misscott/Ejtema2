import java.util.Scanner;

public class Operacionswitch{
	public static void main(String[] args){
		
		Scanner lector= new Scanner(System.in); //pide entrada del teclado (System.in= entrada estandar)
		double a, b;
		int operacion;
		
		System.out.println("Dime un número: ");
		a= lector.nextInt();

		System.out.println("Dime otro número: ");
		b= lector.nextInt();
		
		System.out.println("¿Qué operación desea realizar?:\n 1) sumar\n 2) restar \n 3) multiplicar\n 4) dividir");
		operacion= lector.nextInt();

		switch(operacion){
		
			case 1:
			System.out.println(a+b);
			break;
		
			case 2:
			System.out.println(a-b);
			break;

			case 3:
			System.out.println(a*b);
			break;

			case 4:
			System.out.println(a/b);
			break;
		
			default:
			System.out.println("Opción no válida");
			break;
		}

		lector.close();
	}
}