class Person {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor"); //this
        System.out.println("(3) Performs Employee's tasks ");
    }
    public Employee(String s) {
        System.out.println(s);
    }
}

public class Faculty extends Employee {
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }

    public static void main(String[] args) {
        new Person();
        System.out.println();
        new Employee();
        System.out.println();
        new Faculty();
    }
}

//