import java.util.Scanner;
public class Pajarita{
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		System.out.println("De cuanto quieres hacer la pajarita?");
		 int filas=entrada.nextInt();
		 String espacios=" ";
		 String asterisco="*";
		 for(int i=0;i<filas/2;i++){
			 for (int nespacios=i;nespacios<0;nespacios--){
				 espacios=espacios+" "+" ";
			 }
			 for (int nasteriscos=0;nasteriscos<i;nasteriscos++){
				 asterisco=asterisco+"*";
			 }
		 }
		 
		if(filas==filas/2){
			
			System.out.println(asterisco+espacios+asterisco);
		}
		
	}
}
