import java.util.*;
public class Ejercicio6 {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n=entrada.nextInt();
		System.out.println("Dime otro numero");
		int n2=entrada.nextInt();
		System.out.println("Dime una letra(S/R/M/D)");
		String letra=entrada.next();
		if(letra=="S"){
			System.out.println(n+n2);
		}
		if(letra=="R"){
			System.out.println(n-n2);
		}
		if(letra=="M"){
			System.out.println(n*n2);
		}
		if(letra=="D"){
			System.out.println(n/n2);
			while(n2==0){
				System.out.println("Dime otro numero");
				int n3=entrada.nextInt();
				System.out.println(n/n3);
			}
		}
		
	
	}
		

}
//Defina una función que reciba 2 números enteros y una letra que representa una de las siguientes operaciones:
//S de suma,
//R de resta,
//M multiplicacioón y
//D división


