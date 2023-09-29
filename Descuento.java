public class Descuento{
	public static void main(String[] args){

	int pinicial = 85;
	double descuento = 0.15;
	double pfinal;

	pfinal = pinicial - (pinicial * descuento);
	
	System.out.println("El precio de los zapatos con el descuento es de " + pfinal);
	}
}