package Interview.HashMap;

import java.util.HashMap;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public static void main(String args[]){
        Employee emp1 = new Employee("Ajay");
        System.out.println(emp1.hashCode());
        Employee emp2 = new Employee("Ajay");
        System.out.println(emp2.hashCode());
        System.out.println(emp1.equals(emp2));
        Employee emp3 = new Employee("Ajay");
        System.out.println(emp3.hashCode());
        HashMap<Employee,Integer> hm = new HashMap<>();
        hm.put(emp1,1000);
        hm.put(emp2,2000);
        hm.put(emp3,3000);
        System.out.println(hm.size());
    }
}
