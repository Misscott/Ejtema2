import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args){

        Scanner lector = new Scanner (System.in);

        Double eur, dol, libras;

        System.out.println("Introduzca la cantidad en euros ");
        eur = Double.parseDouble(lector.nextLine());

        dol = eur * 1.06;
        libras = eur * 0.87;

        System.out.println(eur + " euros son " + dol + " dolares y " + libras + " libras.");

        lector.close();

    }
} 