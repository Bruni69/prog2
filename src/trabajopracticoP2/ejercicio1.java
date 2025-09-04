package trabajopracticoP2;

/**
 *
 * @author Ludueña Bruno
 */
public class ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estudiante a = new estudiante();
        a.mostrarInfo();
        a.subirCalificacion(8);
        a.mostrarInfo();
        a.bajarCalificacion(7);
        a.mostrarInfo();
    }
    
        
}
