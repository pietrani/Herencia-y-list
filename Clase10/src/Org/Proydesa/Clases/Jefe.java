
package Org.Proydesa.Clases;

public class Jefe extends Persona {

    private String Ocupacion;
    private int delegar;

    public Jefe(String Ocupacion, int delegar, String nombre, int dni) {
        super(nombre, dni);
        this.Ocupacion = Ocupacion;
        this.delegar = delegar;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public int getDelegar() {
        return delegar;
    }

    public void setDelegar(int delegar) {
        this.delegar = delegar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Ocupacion= ").append(Ocupacion);
        
        sb.append(" delegar ").append(delegar);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void mostrar() {
        System.out.println("jefe de " + this.Ocupacion + " esta a cargo de " + this.delegar + " peronas ");
    }

}
