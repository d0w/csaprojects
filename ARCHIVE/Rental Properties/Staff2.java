
/**
 * Write a description of class Staff2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff2
{
    public static void printEmployees(Employee[] employees) {
        System.out.println("Employee Record");
        System.out.println("------------------------");
        for (Employee person : employees) {
            System.out.println("Employee #: " + person.getEmplNmbr());
            System.out.println("Full Name:  " + person.getName());
            System.out.println("Status:     " + person.getStatus());
            System.out.println("Salary:     " + person.getSalary());
            System.out.println("-----------------------");
        }
    }
}
