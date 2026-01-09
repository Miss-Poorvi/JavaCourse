/*

Create a base class Employee with:
    Private fields: name (String), salary (double)
    A constructor to initialize these fields
    Public getter methods
    A method getDetails() that returns:
    Name: {name}, Salary: {salary}


Create a subclass Manager that:
    Has an additional private field: department (String)
    Uses super() to call the parent constructor
    Overrides getDetails() to include the department:
    Name: {name}, Salary: {salary}, Department: {department}


In the main() method:
    Create one Employee object and one Manager object
    Store both in variables of type Employee
    Print their details using the getDetails() method

Expected Output:
    Name:  Alice,  Salary:  50000.0
    Name:  Bob,  Salary:  80000.0,  Department:  IT


*/

// TODO: Create an class called Employee
class Employee{
    private String name;
    private double salary;
    
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getDetails(){
        return "Name: " + name + ", Salary: " + salary;
    }
}

// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
    private String department;
    
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    
    public String getDetails(){
        return super.getDetails() + ", Department: " + department;
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee emp = new Employee("Alice", 50000.0);
        Employee mgr = new Manager("Bob", 80000.0, "IT");

        // Print details
        System.out.println(emp.getDetails());
        System.out.println(mgr.getDetails());
        
    }
}
