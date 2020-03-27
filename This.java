public class This {
    private String remitente;
    private String para;
    private String texto;
    
    //Constructor con sobrecarga de nombres al coincidir nombres de par�metros con los de campos

    public This (String remitente, String para, String texto) {
    	this.remitente = remitente; //this.remitente es el campo y remitente el par�metro
        this.para = para; //this.para es el campo y para el par�metro
        this.texto = texto; //this.texto es el campo y texto el par�metro
    }
    //M�todo con sobrecarga de nombres al coincidir un par�metro con un campo
    public void setRemitente (String remitente) {
        this.remitente = remitente; //this.remitente es el campo y remitente el par�metro
    }
    //M�todo con sobrecarga de nombres al coincidir una variable local con un campo
    public String extraerFraccionTexto () {
        String texto = ""; //texto es una variable local
        texto = this.texto.substring (0, 5);  //this.texto es el campo de los objetos de la clase
        return texto;
    }   
    }