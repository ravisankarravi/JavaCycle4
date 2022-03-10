import java.util.*;
class Employee
{
    String Name, Address;
    int age; 
	long phone_number;
    float Salary;

    void print_Salary()
    {
        System.out.println(Salary);
    }

    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
        Officer o = new Officer();
        Manager m = new Manager();
		System.out.println("Enter the Details of Officer");
        o.input();
		System.out.print("Enter Specialization : ");
        o.specialization = sc.nextLine();
		System.out.println("Enter the Details of Manager");
        m.input();
		System.out.print("Enter Department : ");
        m.Department = sc.nextLine();
        o.display();
        System.out.println("Specialization : "+ o.specialization);
        m.display();
        System.out.println("Department : "+m.Department);
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        Name= sc.nextLine();
		System.out.print("Enter the Address :");
        Address=sc.nextLine();
        System.out.print("Enter the age :");
        age = sc.nextInt();
		System.out.print("Enter the Phone Number: ");
        phone_number = sc.nextLong();
		System.out.print("Enter the Salary : ");
        Salary = sc.nextInt();
    }

    void display()
    {
    System.out.print("\n Details \n Name : "+Name +"\n Address: "+ Address + "\n Age: " + age + "\n Ph No: "+ phone_number);
    print_Salary();
    }

}
class Officer extends Employee
{
    String specialization;
}

class Manager extends Employee
{
    String Department;
}
/*
Output
Enter the Details of Officer
Enter the name : John
Enter the Address :Hohn villa
Enter the age :25
Enter the Phone Number: 9495696969
Enter the Salary : 25000
Enter Specialization : Data Entry Analyst
Enter the Details of Manager
Enter the name : Thomas
Enter the Address :Thomas Villa
Enter the age :35
Enter the Phone Number: 9498987578
Enter the Salary : 50000
Enter Department : Bank Manager

 Details
 Name : John
 Address: John villa
 Age: 25
 Ph No: 949569696925000.0
Specialization : Data Entry Analyst

 Details
 Name : Thomas
 Address: Thomas Villa
 Age: 35
 Ph No: 949898757850000.0
Department : Bank Manager
