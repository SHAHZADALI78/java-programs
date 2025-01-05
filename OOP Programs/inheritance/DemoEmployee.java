class Employee {
public void work() {
System.out.println("Employee is working.");
}
public double getSalary() {
return 20000; 
}
}
class HRManager extends Employee {
public void work() {
System.out.println("HR Manager is managing employee resources.");
}

public void addEmployee(String employeeName) {
System.out.println(employeeName + " has been added to the company.");
    }
}
public class DemoEmployee {
public static void main(String[] args) {
Employee emp = new Employee();
emp.work(); 
System.out.println("Salary: " + emp.getSalary());          
HRManager hrManager = new HRManager();
hrManager.work();
hrManager.addEmployee("Johncena");
System.out.println("Salary: " + hrManager.getSalary()); 
}
}






