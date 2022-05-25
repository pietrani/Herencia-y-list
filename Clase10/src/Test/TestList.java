/*

Caso recorridos personas
(Para cada salida por pantalla desde el punto dos dejar separadores)
separador
System.out.println("---------------------------------");        


1)Generar una lista cargada por fuerza bruta con Empleados y jefes
2)Realizar el recorrido mostrando para cada caso el toString 
3)Mostrar los que sean empleados y que tengan un nombre con M
4)Mostrar los empleados con dni mayor a uno que ingresemos por teclado 



*/
package Test;

import Org.Proydesa.Clases.Empleado;
import Org.Proydesa.Clases.Jefe;
import Org.Proydesa.Clases.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestList {
    
    public static void main(String[] args) {
        
        
         List<Persona> persona=new ArrayList<>();
         
        persona.add(new Empleado("cajero","Daniel",30665774));
        persona.add(new Empleado("repositor","marcos",33665784));
        persona.add(new Empleado("auxiliar","miguel",283587974));
        persona.add(new Jefe("Supervisor",10,"Mauro",22665778));
        persona.add(new Jefe("Gerente",18,"Alberto",21897563));
        persona.add(new Jefe("CEO",25,"Emilio",20155644));
        
        System.out.println(persona);  
       
        System.out.println("------------------------------------");
        
        
            for (Persona p1 : persona) {
                
                if (p1.getNombre().contains("m")|| p1.getNombre().contains("M")) {
                    
                    System.out.println("el empleado "+ p1.getNombre() + " tiene una M ");
                    
                }
                
            
        }
        System.out.println("-----------------------------------------------");
        
        int nuevoDni=cargarNumero(" ingrese el DNI que desea Comparar ");
        
        for (Persona p1 : persona) {
            if (p1.getDni()>nuevoDni) {
                System.out.println(" los empleados con DNI mayor son :" +p1.getNombre() );
            } 
            else {
                
                System.out.println("no existen empleados con DNI mayor al ingresado");
            }
            
        }
    }
    
   
    
    public static int cargarNumero(String texto) {
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        int numero = sn.nextInt();
        return numero;
    }
}
