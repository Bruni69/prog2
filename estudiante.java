package trabajopractico3;

/**
 *
 * @author User
 */
public class estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
        
        void mostrarInfo(){
            System.out.println(nombre +" "+apellido+" "+curso+" "+calificacion);
        }
        void  subirCalificacion(double puntos){
            this.calificacion+=puntos;
        }
        void bajarCalificacion(double puntos){
            this.calificacion-=puntos;
        }
}

