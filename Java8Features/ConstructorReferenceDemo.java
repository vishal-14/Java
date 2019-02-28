package javaEight;

/**
 * 4.Create an Employee Class with instance variables (String) name,
 * (Integer)age, (String)city and get the instance of the Class using
 * constructor reference
 */
class Employee {
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

interface objectGenerate {
    Employee getInstance(String name, Integer age, String city);
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        objectGenerate obj = Employee::new;
        Employee emp = obj.getInstance("Vishal", 22, "Greater Noida");
        System.out.println(emp.toString());
    }
}
