public class This {
    private String remitente;
    private String para;
    private String texto;
    
    //Constructor con sobrecarga de nombres al coincidir nombres de parámetros con los de campos

    public This (String remitente, String para, String texto) {
    	this.remitente = remitente; //this.remitente es el campo y remitente el parámetro
        this.para = para; //this.para es el campo y para el parámetro
        this.texto = texto; //this.texto es el campo y texto el parámetro
    }
    //Método con sobrecarga de nombres al coincidir un parámetro con un campo
    public void setRemitente (String remitente) {
        this.remitente = remitente; //this.remitente es el campo y remitente el parámetro
    }
    //Método con sobrecarga de nombres al coincidir una variable local con un campo
    public String extraerFraccionTexto () {
        String texto = ""; //texto es una variable local
        texto = this.texto.substring (0, 5);  //this.texto es el campo de los objetos de la clase
        return texto;
    }   
    }