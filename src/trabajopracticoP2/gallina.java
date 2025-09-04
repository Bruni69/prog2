package trabajopracticoP2;

/**
 *
 * @author Ludueña Bruno
 */
        //atributos de la clase
public class gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
        //constructor
    public gallina(int idGallina, int edad, int huevosPuestos){
        this.idGallina=idGallina;
        this.edad=edad;
        this.huevosPuestos=huevosPuestos;      
    
}
        //metodos

    public int getIdGallina() {
        return idGallina;
    }
       public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad++;
    }
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos++;
    }
    public void mostrarEstado() {
    System.out.println("ID: " + this.idGallina + ", Edad: " + this.edad + ", Huevos puestos: " + this.huevosPuestos);
}
    
}
