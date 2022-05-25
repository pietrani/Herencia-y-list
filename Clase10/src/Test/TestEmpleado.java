
/*
GENERAR DE MANERA ABSTRACTA UN METODO PARA QUE NOSOTROS PODAMOS INDICAR 
    QUE HACEN CADA UNO TANTO EMPLEADO COMO TRABJADOR PERO DEJANDOLO DE LA SIGUEINTE FORMA
    
    Empleado->Salida que diga 
    "El empleado  trabaja en:(rubro)"
    
    Jefe->
    "Jefe de (rubro) a cargo de (delegadas) personas"
    
    
    
*/

package Test;

import Org.Proydesa.Clases.Empleado;
import Org.Proydesa.Clases.Jefe;

public class TestEmpleado {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("cajero", "Daniel", 25666888);
        Jefe j1 = new Jefe("Supervisor", 10, "Mauro", 22665778);

        System.out.println(e1.toString());

        System.out.println("----------------------");

        System.out.println(j1.toString());
        System.out.println("----------------------");

        e1.mostrar();

        System.out.println("----------------------------");

        j1.mostrar();

    }

}
