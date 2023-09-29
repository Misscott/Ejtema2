import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int seg;
        int dias, horas, min;

        System.out.println("Defina el numero de segundos");
        seg = Integer.parseInt(lector.nextLine());

       // for(int min = 0; seg>=60; min++){

        //    seg-= 60;

         //   for(int hora = 0; min>=60; hora++){

          //      min-= 60;

          //     for(int dia = 0; hora>=60; dia++){

           //     hora-= 24;
                
           //    }
           // }
       // }

       min = seg / 60;
       seg = seg % 60;

       //En este punto los segundos ya estan calculados correctamente

       horas = min / 60;
       min = min % 60;
    
       //En este punto los minutos ya estan calculados correctamente

       dias = horas / 24;
       horas = horas % 24;

       //En este punto las horas ya estan calculadas correctamente
       //Y el resto que queda son dias

       System.out.println(dias + " dias " + horas + " horas " + min + " minutos y " + seg + " segundos.");

        lector.close();
        }
      
    }