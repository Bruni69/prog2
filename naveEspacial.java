package trabajopractico3;

/**
 *
 * @author Ludueña Bruno
 */
public class naveEspacial {
    String nombre;
    int combustible;
    
    
    public naveEspacial(String nombre, int combustible){
        this.nombre=nombre;
        this.combustible=combustible;
    }
        public boolean validarCombustible(){
            return combustible>=1;
                
        }
               
        public void despegar(){
            if (validarCombustible()){
                System.out.println("despegando");
            }else{
                    System.out.println("la nave no cuenta con combustible para realizar este viaje");
            }
        }
        public void avanzar(int distancia){
            for (int i = 0; i < distancia; i++) {
                if (validarCombustible()){
                    System.out.println("avanzando");
                    combustible= combustible-1;    
                } else {    
                    System.out.println("combustible insuficiente");
                       }
            }
        }
        public void recargarCombustible(int cantidad) {
            int capacidadMaxima=50;
            if (combustible +cantidad<= capacidadMaxima){
                combustible+=cantidad;
                         
                System.out.println("cargando combustible, se cargaran: "+cantidad);
            } else{
                System.out.println("tanque lleno,o excede su capacidad de combustible");
            }
        }
        
        public void mostrarDatosNave() {
        System.out.println("Nombre: " + this.nombre + ", combustible: " + this.combustible);

}
}    
    

