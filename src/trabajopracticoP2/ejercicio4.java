package trabajopracticoP2;

/**4.	Gestión de Gallinas en Granja Digital
a.	Crear una clase Gallina con los atributos: idGallina, edad, 
* huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos),
* y mostrar su estado.

 *
 * @author Ludueña Bruno
 */
public class ejercicio4 {
    public static void main(String[] args) {
        //creo dos objetos gallina e inicializo los valores de sus atributos
        System.out.println("ingresan al gallinero dos gallinas y estos son sus datos:");
        gallina gallina1 = new gallina(001, 1,0);
        gallina gallina2 = new gallina(002, 0,0);
        
        //muestro estado de los dos objetos gallina
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        //las gallinas envejecieron y pusieron huevos, semuestran sus datos
        System.out.println("con el paso del tiempo los siguientes, estos son los nuevos datos de las gallinas con el paso del tiempo: ");
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(700);
        gallina2.setEdad(3);
        gallina2.setHuevosPuestos(1120);
      
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
    
            
}
