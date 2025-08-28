package trabajopractico3;

/**2.	Registro de Mascotas
a.	Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, 
* simular el paso del tiempo y verificar los cambios.

 *
 * @author Ludueña Bruno
 */
public class ejercicio2 {
    public static void main(String[] args) {
        mascota b = new mascota();
        b.mostrarDatos();
        b.cumplirAnios(5);
        b.mostrarDatos();
    }
}
