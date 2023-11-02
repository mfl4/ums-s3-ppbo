package exercise;
public class MainAccess {
    public static void main(String[] args) throws Exception {
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        Manager manager3 = new Manager();
        Manager manager4 = new Manager();
        Manager manager5 = new Manager();

        // set all values
        manager1.setName("Fre");
        manager1.setSalary(5000000);
        manager1.setAge(20);
        manager1.setWorkHours(8.5f);
        
        manager2.setName("Yani");
        manager2.setSalary(9000000);
        manager2.setAge(28);
        manager2.setWorkHours(8.5f);
        
        manager3.setName("Jabib");
        manager3.setSalary(8000000);
        manager3.setAge(31);
        manager3.setWorkHours(8.5f);
        
        manager4.setName("Rafli");
        manager4.setSalary(1000000);
        manager4.setAge(24);

        manager5.setName("Han");
        manager5.setSalary(11000000);
        manager5.setAge(20);

        // get all values
        System.out.println(manager1.getName()); 
        System.out.println(manager1.getSalary()); 
        System.out.println(manager1.getManagerSalary());
        System.out.println((manager1.getAge()));
        System.out.println(manager1.workHours());
        
        System.out.println(manager2.getName());
        System.out.println(manager2.getSalary());
        System.out.println(manager2.getManagerSalary());
        System.out.println(manager2.getAge());
        System.out.println(manager2.workHours());

        System.out.println(manager3.getName());
        System.out.println(manager3.getSalary());
        System.out.println(manager3.getManagerSalary());
        System.out.println(manager3.getAge());
        System.out.println(manager3.workHours());
        
        System.out.println(manager4.getName());
        System.out.println(manager4.getSalary());
        System.out.println(manager4.getManagerSalary());
        System.out.println(manager4.getAge());
        System.out.println(manager4.workHours());

        System.out.println(manager5.getName());
        System.out.println(manager5.getSalary());
        System.out.println(manager5.getManagerSalary());
        System.out.println(manager5.getAge());
        System.out.println(manager5.workHours());

    }
}
