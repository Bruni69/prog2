/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author User
 */
public class mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarDatos(){
        System.out.println(nombre+" "+especie+" "+edad);
        }
    int cumplirAnios(int aniosSumar){
        edad = edad +aniosSumar ;
        return edad;
    }    
}