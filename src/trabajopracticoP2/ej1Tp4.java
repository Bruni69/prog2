/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticoP2;

import trabajopractico3.ClaseEmpleado;

/**
 *
 * @author User
 */
public class ej1Tp4 {
    public static void main(String[] args) {
        ClaseEmpleado emp1 = new ClaseEmpleado("bruno", "cadete", 1300);
        ClaseEmpleado emp2 = new ClaseEmpleado("roberto", "albañil");
        ClaseEmpleado emp3 = new ClaseEmpleado("pablo", "carpintero");
       
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        emp1.actualizarSalario(10);
        System.out.println(emp1);
    }
}
