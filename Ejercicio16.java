import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args){

        Scanner lector = new Scanner (System.in);

        double eur, dol, libras;

        System.out.println("Introduzca la cantidad en euros: ");
        eur = Double.parseDouble(lector.nextLine());

        dol = eur * 1.06; //1 euro son 1,06 dolares
        libras = eur * 0.87;//1 euro son 0,87 libras

        System.out.println(eur + " euros son " + dol + " dolares y " + libras + " libras.");

        lector.close();

    }
} 