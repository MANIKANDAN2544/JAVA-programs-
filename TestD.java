class Employee
{
public Employee()
{
System.out.println("Employee Constructor");
}
public void printd()
{
System.out.println("Employee method");
}
}
class Manager extends Employee
{
public Manager()
{
System.out.println("Manager Constructor");
}
public void printd()
{
System.out.println("Manager method");
}
}
class Staff extends Employee
{
public Staff()
{
System.out.println("Staff Constructor");
}
public void printd()
{
System.out.println("Staff method");
}
}
class TestD
{
public static void main(String[] args)
{
Employee E1=new Employee();
Manager M1=new Manager();
Staff S1=new Staff();
E1.printd();
M1.printd();
S1.printd();
Employee E2=new Manager();
E2.printd();
Employee E3=new Staff();
E3.printd();
Employee ref;
ref=S1;
ref.printd();
ref=E1;
ref.printd();
ref=M1;
ref.printd();
Employee E5=new Manager();
Employee E6=new Staff();
Manager M5=(Manager) E5;
Staff S5=(Staff) E6;
M5.printd();
S5.printd();
}
}