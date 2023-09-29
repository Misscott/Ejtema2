import java.util.Scanner;

public class Edad{
	public static void main(String[] args){
		
		Scanner lector= new Scanner(System.in);

		int edad;
		int edadDias;//Dias tiene que estar en mayuscula porque esta relacionado con edad

		System.out.println("Introduzca su edad");
		//edad = lector.nextInt(); 
		//edad = lector.nextLine(); esta linea lee un string y consume un 555555555/n
		edad = Integer.parseInt(lector.nextLine());//equivalente a las dos lineas anteriores de codigo. Se usa para cubrir la excepcion que se produce
		
		edadDias = edad * 365;

		System.out.println("Una persona de " + edad + " años tiene " + edadDias + " días de vida.");

		lector.close();
	}
}