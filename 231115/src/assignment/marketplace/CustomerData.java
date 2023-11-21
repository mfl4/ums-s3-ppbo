package assignment.marketplace;

public class CustomerData {
    private String name ;
    private String address;
    private String birthDate;
    private String job;
    private long salary;

    public CustomerData() {
        System.out.println("\n" + "No customer data available");
    }

    public CustomerData(String name, String address, String birthDate, String job, long salary) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.job = job;
        this.salary = salary;

        System.out.println(
            "\n" +
            "<= CUSTOMER DATA =>" + "\n" +
            "Name : " + this.name + "\n" +
            "Address : " + this.address + "\n" +
            "Birth Date : " + this.birthDate + "\n" +
            "Job : " + this.job + "\n" +
            "Salary : " + this.salary
        );
    }
}
