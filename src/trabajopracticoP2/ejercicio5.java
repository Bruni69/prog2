package trabajopracticoP2;

/**5.	Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.

 *
 * @author Ludueña Bruno
 */
public class ejercicio5 {
    public static void main(String[] args) {
        naveEspacial nave1 = new naveEspacial("nave1", 50);
        nave1.despegar();
        nave1.avanzar(51);
        nave1.mostrarDatosNave();
        nave1.recargarCombustible(50);
        nave1.mostrarDatosNave();
    }
    
}
