package proyecto3;

import java.util.Scanner;


public class Proyecto3 {

    public static void main(String[] args) {
    double salario, aumento;
     
    Empleado empleado=new Empleado();
    Scanner dat= new Scanner(System.in);
    System.out.print("Nombre: ");
    empleado.setNombre(dat.next());
    System.out.print("Apellido: ");
    empleado.setApellido(dat.next());
    System.out.println("Salario: ");
    empleado.setSalario(dat.nextDouble());
    salario=empleado.getSalario();
    System.out.print("\nSalario con aumento: "+ empleado.aumento());
    aumento=empleado.aumento();
    System.out.print("\nSalario anual: "+ empleado.salarioAnual());
    }

 
}
