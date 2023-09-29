public class Baraja {
    public enum Palo{
        OROS, COPAS, ESPADAS, BASTOS
    }
	public static void main(String[] args) {

        Palo palo;
        palo = Palo.OROS; 

        System.out.println( "El palo es " + palo + " y su valor ordinal es" + palo.ordinal());

