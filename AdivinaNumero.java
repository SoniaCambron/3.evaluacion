import java.util.*;
public class AdivinaNumero {
	public static void main(String args[]){
		int cont=(int)(Math.random()*100);
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		while(numero!=cont){
			intentos++;
			System.out.println("Introduce un numero");
			numero=entrada.nextInt();
			if(cont<numero){
				System.out.println(" mas bajo que "+numero);
			}
			else if(cont>numero){
				System.out.println(" mas alto que "+numero);
			}
		}
		System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos.");

	}
		
}
