import java.lang.Math;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main (String[] args){

        Scanner lector = new Scanner(System.in);
        Double radio, area, longitud;

        System.out.println("Introduzca el radio de la circunferencia ");
        radio = Double.parseDouble(lector.nextLine());

        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio , 2);

        System.out.println("El area de la circunferencia es " + area + " cm al cuadrado y la longitud es de " + longitud + "cm.");

        lector.close();
    }
} 