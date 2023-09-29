
import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		
		Scanner lector= new Scanner(System.in);

		String s1 = new String("Hola");
		String s2 = new String("nHola");
		String s3 = "Hola";

		if (s1.equals(s3)) { //con variables de tipo referencia no se usa == porque puede causar un error.
			System.out.println("Son iguales");
		}
		
		else {
			System.out.println("Son distintos");
		}

		lector.close();
	}
}