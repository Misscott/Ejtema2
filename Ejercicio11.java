import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int minuendo;
        int sustraendo;
        int result;

        System.out.println("Se va a realizar la resta de dos numeros");
        System.out.println("Introduzca el primer numero (minuendo)");
        minuendo = Integer.parseInt(lector.nextLine());

        System.out.println("Introduzca el segundo numero (sustraendo)");
        sustraendo = Integer.parseInt(lector.nextLine());


        result = minuendo - sustraendo;
        System.out.println("El resultado de la resta es " + result);

        lector.close();
    }

}