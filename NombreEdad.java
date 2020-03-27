import java.util.*;
public class NombreEdad {
	public static void main(String args[]){
		System.out.println("Hola amigos");
		System.out.print("Dime como te llamas");
		Scanner entrada=new Scanner(System.in);
		String nombre=entrada.nextLine();
		System.out.print("Cuantos años tienes?");
		String edad=entrada.nextLine();
		System.out.print("Te llamas "+nombre+" y tienes "+edad+" años.");
		
		
	}
}
