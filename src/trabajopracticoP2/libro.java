package trabajopracticoP2;

/**
 *
 * @author Ludueña Bruno
 */

    //clase libro
public class libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //constructor para la asignacion de variables e inicializa los atributos del objeto desde el pricicipio.
    public libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
    //metodo para cambiar el año de publicacion y condicional
    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio > 0 && nuevoAnio <= 2025){
            this.anioPublicacion = nuevoAnio;
            System.out.println("el anio actualizado es "+this.anioPublicacion);
       }else{
            System.out.println("el anio ingresado no es correcto");
            }
            }
    
    public  String getDatos(){
       return "Titulo: " + this.titulo + ", Autor: " + this.autor + ", Anio de publicacion: " + this.anioPublicacion;
        
    }
}
