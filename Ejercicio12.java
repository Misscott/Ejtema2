import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int dividendo;
        int divisor;
        double result;

        System.out.println("Se va a realizar la division de dos numeros");
        System.out.println("Introduzca el primer numero (dividendo)");
        dividendo = Integer.parseInt(lector.nextLine());

        System.out.println("Introduzca el segundo numero (divisor)");
        divisor = Integer.parseInt(lector.nextLine());


        result = (double)dividendo/divisor;
        System.out.println("El resultado de la division es " + result);

        lector.close();
    }

}