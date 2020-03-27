import java.util.*;
public class Cuadrado{
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		System.out.println("De cuanto quieres hacer el cuadrado?");
		 int lado=entrada.nextInt();
		 for(int i=0;i<=lado;i++){
			 for(int cont=0;cont<=lado;cont++){
				 System.out.println("*");
			 }
		 }
		 
	}
}
