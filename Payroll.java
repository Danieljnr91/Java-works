class Employee{
    protected String name;
    protected int ID;
    protected double baseSalary;

    Employee(String name,int ID,double baseSalary){
        this.name=name;
        this.ID=ID;
        this.baseSalary=baseSalary;
    }

    double calculatePay(){
        System.out.print("Salary: ");
        return baseSalary;
    }
    void displayDetails(){
        System.out.println(
            "Employee Name: "+name+"\n"+
            "Employee ID: "+ID+"\n"+
            "Base Salary:"+baseSalary
        );
    }
}

class Developer extends Employee{
    private double overTimePay;
    Developer(String name,int ID,double baseSalary, double overTimePay){
        super(name,ID,baseSalary);
        this.overTimePay=overTimePay;
    }

    @Override 
    double calculatePay(){
        return baseSalary+overTimePay;
    }
    @Override 
    void displayDetails(){
       super.displayDetails();
       System.out.println("Total Developer Salary: "+(baseSalary+overTimePay));
    }
}

class Manager extends Employee{
    private double bonus;
    Manager(String name,int ID,int baseSalary,int bonus){
        super(name,ID,baseSalary);
        this.bonus=bonus;
    }

    @Override 
    double calculatePay(){
        return baseSalary+bonus;
    }
    @Override 
    void displayDetails(){
        super.displayDetails();
        System.out.println("Total Manager Salary: "+(baseSalary+bonus));
    }
}

public class Payroll{
    static void lines(){
        System.out.println("=========================================================================");
    }
    public static void main(String[] args){
        Developer dev = new Developer("Daniel Khulman",101,5000,50);
        Employee emp = new Employee("Daniel Khulman",101,5000);
        Manager manager = new Manager("Daniel Khulman",101,5000,50);

        System.out.println(dev.calculatePay());
        dev.displayDetails();
        lines();
        System.out.println(emp.calculatePay());
        emp.displayDetails();
        lines();
        System.out.println(manager.calculatePay());
        manager.displayDetails();
    }
}