
package Org.Proydesa.Clases;

public class Empleado extends Persona {

    private String tarea;

    public Empleado() {
    }

    public Empleado(String tarea, String nombre, int dni) {
        super(nombre, dni);
        this.tarea = tarea;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" tarea= ").append(tarea);

        sb.append('}');
        return sb.toString();
    }

    @Override

    public void mostrar() {

        System.out.println("El empleado es :" + this.tarea);

    }


    
    
  
    
    
    
    

  
    }
   
  
    
        
    

