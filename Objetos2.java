import java.util.*;
import java.awt.Point;
public class Objetos2 {
		String nombre;
	    String apellido;
	    int edad;
	    String pais;
	 

	    public Objetos2(String nombrem, String apellidom, int edad, String paism){
	        this.nombre = nombrem;
	        this.apellido = apellidom;
	        this.edad = edad;
	        this.pais = paism;
	    }
	    public String getNombre(){
	        return nombre;
	    }

	    public String getApellido(){
	        return apellido;
	    }

	    public int getEdad(){
	        return edad;
	    }

	    public String getPais(){
	        return pais;
	    }
	 
	    public String toString(){
	        return("Hola mi nombre es "+ this.getNombre()+".\nMi apellido "+this.getApellido()+". Mi edad "
	        		+ this.getEdad()+". Y mi pais es "+ this.getPais());
	    }
	    public static void main(String[] args){
	    	Scanner entrada=new Scanner(System.in);
	    	System.out.println("Hola amigo. Como te llamas?");
	    	String nombrem =entrada.nextString();
	    	System.out.println("Cual es tu apellido?");
	    	String apellidom =entrada.nextString();
	    	System.out.println("Cuantos años tienes?");
	    	int edadm =entrada.nextInt();
	    	System.out.println("De que pais eres?");
	    	String paism =entrada.nextString();
	        Objetos2 maria = new Objetos2(nombrem,apellidom, edadm, paism);
	        System.out.println(maria.toString());

	    }



}
