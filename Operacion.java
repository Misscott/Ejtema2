import java.util.Scanner;

public class Operacion{
	public static void main(String[] args){
		
		Scanner lector= new Scanner(System.in); //pide entrada del teclado (System.in= entrada estandar)
		double a, b;
		double ab                      = 0;
		char op = ' ';
		int operacion;
		
		System.out.println("Dime un número: ");
		a = lector.nextDouble();

		System.out.println("Dime otro número: ");
		b = lector.nextDouble();
		
		System.out.println("¿Qué operación desea realizar?:\n 1) sumar\n 2) restar \n 3) multiplicar\n 4) dividir");
		operacion= lector.nextInt();

		if(operacion==1){
			ab = a + b;
			op = '+';
		}
		
		else if(operacion==2){
			ab = a - b;
			op = '-';	
		}
		
		else if(operacion==3){
			ab = a * b;
			op = '*';	
		}

		else if(operacion==4){
			ab = a / b;
			op = '/';
		}

		else{
			System.out.println("Introduzca un valor válido");
		}

		if(op!=' '){
		System.out.println(a + " " + op + " " + b + " = " + ab);
		}

		lector.close();
	}
}