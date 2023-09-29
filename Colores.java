public class Colores { //ejercicio 9
    public enum Basicos{
        RED, GREEN, BLUE
    }
	public static void main(String[] args) {

        Basicos color = Basicos.BLUE;
        System.out.println("Es el color " + color);

        color = Basicos.RED;
        System.out.println("Ahora es el color " + color);
    }
}
