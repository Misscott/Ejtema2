import java.util.Scanner;

public class Suma{
	public static void main(String[] args){
		
		Scanner lector= new Scanner(System.in); //pide entrada del teclado (System.in= entrada estandar)
		int a;
		int b;
		int ab;
			
		System.out.println("Dime un número: ");
		a= lector.nextInt();

		System.out.println("Dime otro número: ");
		b= lector.nextInt();
		
		ab=a+b;
		System.out.println(a + " + " + b + " es " + ab);

		lector.close();
	}
}