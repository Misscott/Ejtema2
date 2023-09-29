import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args){

        Scanner lector = new Scanner (System.in);

        Double c, kelvin, fahr;

        System.out.println("Introduzca grados centígrados ");
        c = Double.parseDouble(lector.nextLine());

        kelvin = 273.5 + c;
        fahr = c * (9f/5) + 32;

        System.out.println(c + " grados centígrados son " + kelvin + " Kelvin y " + fahr + " Fahrenheit.");

        lector.close();

    }
} 