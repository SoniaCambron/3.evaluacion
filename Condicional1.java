import java.util.*;
public class Condicional1 {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Cuantos años tienes?");
		int edad=entrada.nextInt();
		if(edad>40){
			System.out.print("Ohhh ya eres muy mayor");
		}
		else{
			System.out.print("Todavia eres joven no te preocupes");
			
		}
		
	}
}
