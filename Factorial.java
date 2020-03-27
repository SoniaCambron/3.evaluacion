import java.util.*;
public class Factorial {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n=entrada.nextInt();
		int cont, factorial=1;
		for(cont=1;cont<=n;cont++){
			factorial=factorial*cont;
		}
		System.out.print(factorial);
	}
		

}
