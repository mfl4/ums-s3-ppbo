package exercise;

public class Manager extends Employee {
    private float workHours = 7.5f;
    
    public int workHours() {
        return (int)workHours;
    }

    public void setWorkHours(float workHours){
        this.workHours = workHours;
    }
    
    public float getManagerSalary() {
        return getSalary() * 2;
    }
}
