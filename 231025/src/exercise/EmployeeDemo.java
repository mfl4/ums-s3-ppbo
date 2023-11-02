package exercise;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Luffy");
        e1.setSalary(2500000);
        e1.setAge(21);
        
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getAge());
    }
}
