
package proyecto3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmpleadoTest {
    
    public EmpleadoTest() {
    }
    

    @Test
    public void testEmpleado() {
        System.out.println("Empleado 1");
     
        Empleado instance = new Empleado("Juan", "Lopez", 1200);
        double expResult = 15840.0;
        System.out.println("Nombre " + instance.nombre);
        System.out.println("Salario " + instance.salario);
        System.out.println("Salario +10% " + instance.aumento());
        System.out.println("Salario anual " + instance.salarioAnual());
        double result = instance.salarioAnual();
        assertEquals(expResult, result, 0);       
        
        
        System.out.println("Empleado 2");
        Empleado instance2 = new Empleado("Martha", "Guzman", 2200);
        double expResult2 = 29040.0;
        System.out.println("Nombre " + instance2.nombre);
        System.out.println("Salario " + instance2.salario);
        System.out.println("Salario +10% " + instance2.aumento());
        System.out.println("Salario anual " + instance2.salarioAnual());
        double result2 = instance2.salarioAnual();
        assertEquals(expResult2, result2, 0);       
        fail("The test case is a prototype.");
    }
    

}
