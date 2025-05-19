
package jdbcexample2;
import java.util.List;
/**
 *
 * @author USER
 */
public class JDBCExample2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
     
// Add employees
        EmployeeDAO.addEmployee("Alwis", "Software Engineer ", 75000);
        EmployeeDAO.addEmployee("Bob Marley", "Manager", 80000);
        // Update employee
        EmployeeDAO.updateEmployee(1, "John Doe","Senior Software Engineer",
        90000);
        // Get all employees
        List<EmployeeDAO> employees = EmployeeDAO.getAllEmployees();
        employees.forEach(System.out::println);
        // Delete employee
        EmployeeDAO.deleteEmployee(2);
    
    
}
}