/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author User
 */
public class ClaseEmpleado {                                                                        //atributos de la clase y el atributo static
   private static int ultimoId = 0;
   private static int totalEmpleados = 1;
   private int id;
           
   String nombre;
   String puesto;
   double salario;
   
   

    public ClaseEmpleado(String nombre, String puesto, double salario) {       /**Constructor con el uso del this. Este constructor
        ultimoId++;                                                             *cumple con la consigna numero 2, uno que reciba todos     
        totalEmpleados++;                                                                                                                                        *los parametros.    
        this.id = ultimoId;                                                     */
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
        
        
       
    }

    public ClaseEmpleado(String nombre, String puesto) {                        //Constructor sobrecarga que solo pide nombre y puesto y adjudica sueldo automaticamente
        ultimoId++;
        totalEmpleados++;
        this.id = ultimoId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1800.00;
        }
    
    public void actualizarSalario(double porcentajeAumento){                    //metodo que pide un % de aumento y aplica al sueldo el incremento actualizando el sueldo
        if (porcentajeAumento > 0)
            this.salario+= salario*(porcentajeAumento/100);
    }
    @Override
    public String toString(){                                                   //el toString muestra los datos
        return "Empleado:"+ nombre +" ,ID:" + id + " ,Puesto:" + puesto + " ,salario:" + salario + " y total de empleados trabajando:" +totalEmpleados; 
    }
}
//tengo problemas cuando vuelvo a crear una nueva instancia, comienza a dar mal los resultados inicializa las variables y no compila el nuevo empleado para sumarlo a la cantidad de empleados.