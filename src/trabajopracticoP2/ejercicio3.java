package trabajopracticoP2;

/**3.	Encapsulamiento con la Clase Libro
a.	Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final

 *
 * @author Ludueña Bruno
 */
public class ejercicio3 {
    public static void main(String[] args) {
        libro c = new libro("20000 leguas de viaje submarino", "Julio Verne",1866);
        System.out.println("Lo siguiente es la informacion inicial del libro:");
        System.out.println(c.getDatos());   //Mostramos la informacion inicial del libro por consola
        
        // ingreso un año invalido para ver que sucede con el setter y muestro por consola
               c.setAnioPublicacion(-100);
               c.setAnioPublicacion(1860);
               
        //mostramos los datos finales
        System.out.println(c.getDatos());   // informacion actualizada
}
    }
   
