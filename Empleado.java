
package proyecto3;

public class Empleado {
    String nombre;
    String apellido;
    Double salario;
   
    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Empleado() {
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    double aumento(){
        return getSalario()*1.10;
    }
    
    double salarioAnual(){
        
        return aumento()*12;
    }
}
