import java.util.Scanner;

public class Contador{
	public static void main(String[] args){
		
		Scanner lector= new Scanner(System.in); //pide entrada del teclado (System.in= entrada estandar)
		int contador= 65;
		
		while (contador<80){
		System.out.println(contador);
		contador++;
		}

		lector.close();
	}
}