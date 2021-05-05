
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{

    private enum EmploymentStatus { FULLTIME, PARTTIME, UNKNOWN };
    int emplNmbr;
    String name;
    EmploymentStatus status;
    double salary;

    public Employee(int in, String namein, double salaryin) {
        emplNmbr = in;
        name = namein;
        status = EmploymentStatus.FULLTIME;
        salary = salaryin;
    }
    

    public int getEmplNmbr() {
        return emplNmbr;
    }
    public String getName() {
        return name;
    }
    public EmploymentStatus getStatus() {
        return status;
    }
    public double getSalary() {
        return salary;
    }

    public void setEmplNmbr(int num) {
        emplNmbr = num;
    }
    public void setName(String in) {
        name = in;
    }
    public void setStatus(EmploymentStatus in) {
        status = in;
    }
    public void setSalary(int num) {
        salary = num;
    }
}
