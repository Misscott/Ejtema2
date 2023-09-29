public class Enumerados { //ejercicio 10

    public enum Meses{
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO,
        AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
    }

    public enum Notas{
        DO, RE, MI, FA, SOL, LA, SI
    }
     public enum Calificaciones{
        IN, SU, BI, NT, SB
    }

	public static void main(String[] args) {

        Meses mes = Meses.ENERO;
        System.out.println("El mes es " + mes);

        Notas nota = Notas.LA;
        System.out.println("La nota musical es " + nota);

        Calificaciones calificacion = Calificaciones.SU;
        System.out. println("La calificación del alumno es un " + calificacion);  
    }
}