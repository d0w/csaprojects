
/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff
{
    public static Employee[] employees = new Employee[3];
    public static void main(String[] args) { 
        makeList();
        for (Employee person : employees) {
            System.out.println();
            System.out.println("Employee #: " + person.getEmplNmbr());
            System.out.println("Full Name:  " + person.getName());
            System.out.println("Status:     " + person.getStatus());
            System.out.println("Salary:     " + person.getSalary());
            System.out.println("-----------------------");
        }
    }
    
    public static Employee[] makeList() {
        employees[0] = new Employee(92857, "Sally", 22.25);
        employees[1] = new Employee(92767, "John", 10.45);
        employees[2] = new Employee(92215, "Hardy", 8.99);
        return employees;
    }
}
