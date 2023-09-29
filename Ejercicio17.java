import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double plitro, pmedio, totdeposito, numkm1, numkm, l1, l2, ltotal, consumo1, consumo2, consumomedio;

        System.out.println("Se va a calcular el consumo medio de su automovil.");
        System.out.println("Introduzca el precio del litro de combustible que vaya a repostar");
        plitro = Double.parseDouble(lector.nextLine());
        pmedio = plitro;
        //guardamos el primer precio del combustible en otra variable para no perderlo mas adelante
        System.out.println("¿Cual fue el total pagado en euros?");
        totdeposito = Double.parseDouble(lector.nextLine());

        System.out.println("¿Cuantos kilómetros marcaba el cuentakilómetros cuando repostó?");
        numkm1 = Double.parseDouble(lector.nextLine());

        l1 = totdeposito / plitro;
        consumo1 = (l1 * 100) / numkm1;
        //se hace el consumo en litros por cada 100 kilometros 

        System.out.println("¿Cual fue el total pagado en euros la segunda vez repostando?");
        totdeposito = Double.parseDouble(lector.nextLine());

        System.out.println("¿Cuanto costaba el litro de combustible la segunda vez?");
        plitro = Double.parseDouble(lector.nextLine());

        pmedio = (pmedio + plitro) / 2;
        //sacamos el precio medio del combustible usando como datos los precios del combustible de los dos primeros repostajes
        l2 = totdeposito / plitro;
        ltotal = (l1 + l2) / 2;
        //sacamos la media de los litros repostados (aunque deberia asumirse que son los mismos)
        System.out.println("¿Cuantos kilometros marcó el cuentakilometros al final?");
        numkm = Double.parseDouble(lector.nextLine());

        consumo2 = (ltotal * 100) / (numkm - numkm1);
        //se hace el consumo total de los viajes 2 y 3
        consumomedio = (consumo1 + consumo2) / 2;
        //sacamos el consumo medio en litros por cada 100 km
        System.out.println("El precio medio del combustible es de " + pmedio + " euros y el consumo medio del vehiculo es de " + consumomedio + " litros por cada 100 km.");

        lector.close();
    }
}