/*
    
    
    GENERAR UNA CLASE PADRE Persona
    
    QUE TENGA LA MISMA UN DNI Y NOMBRE
    
    
    A SU VEZ VA A TENER 2 CLASES HIJAS
    
    Empleado y Jefe
    
    ambas tienen un trabajo la diferencia es que jefe tiene
    el campo delegar que indica la cantidad de personas a cargo
    
    GENERAR DE MANERA ABSTRACTA UN METODO PARA QUE NOSOTROS PODAMOS INDICAR 
    QUE HACEN CADA UNO TANTO EMPLEADO COMO TRABJADOR PERO DEJANDOLO DE LA SIGUEINTE FORMA
    
    Empleado->Salida que diga 
    "El empleado  trabaja en:(rubro)"
    
    Jefe->
    "Jefe de (rubro) a cargo de (delegadas) personas"
    
    
    */

package Org.Proydesa.Clases;


public abstract class Persona {
    private String nombre;
    private int dni;

    public Persona() {
    }

    
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   
    public abstract void mostrar();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" nombre= ").append(nombre);
        sb.append(" dni= ").append(dni);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    



}




