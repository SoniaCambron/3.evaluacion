import java.util.*;
public class Array1 {
	public static void main(String args[]){
		String[] paises=new String[4];
		Scanner entrada=new Scanner(System.in);
		for(int i=0;i<4;i++){
			System.out.println("Introduce un pais");
			paises[i]=entrada.next();
		}
		

		for(String cont:paises){
			System.out.println(cont);
		}
			
	}
}
