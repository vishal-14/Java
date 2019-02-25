package collections;

/**
 * Question 4: Write a program to sort Employee objects based on highest salary
 * using Comparator
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String Name;
    double Age;
    double Salary;


    public Employee(String employeeName, double employeeAge, double employeeSalary) {
        this.Name = employeeName;
        this.Age = employeeAge;
        this.Salary = employeeSalary;
    }

    double getSalary()
    {
        return Salary;
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vishal", 22.0, 16000.1D));
        employeeList.add(new Employee("Ritesh", 21.0, 16000.2D));
        employeeList.add(new Employee("Ajay", 22.5, 5300.3D));
        employeeList.add(new Employee("Mani", 23.0, 15000.4D));
        Collections.sort(employeeList, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        if (o1.getSalary() < o2.getSalary())
                            return 1;
                        else if(o1.getSalary()>o2.getSalary())
                            return -1;
                        else
                            return 0;
                    }
                }
        );

        for (Employee e : employeeList) {
            System.out.println(e.Name + " is " + e.Age + " and earns " + e.Salary);
        }
    }
}
