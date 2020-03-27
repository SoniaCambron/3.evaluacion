import java.util.*;
import java.awt.Point;
public class Objetos {
		String nombre;
	    String apellido;
	    int edad;
	    String pais;
	 
	    // Declaración del constructor de clase
	    public Objetos(String nombre, String apellido, int edad, String pais){
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.edad = edad;
	        this.pais = pais;
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
	    	Objetos alice = new Objetos("Alice","Peter", 7, "Inglaterra");
	        Objetos maria = new Objetos("Maria","Cambron", 17, "España");
	        System.out.println(maria.toString());
	        System.out.println(alice.toString());
	    }



}
