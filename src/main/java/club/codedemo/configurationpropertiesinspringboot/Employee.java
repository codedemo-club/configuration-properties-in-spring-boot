package club.codedemo.configurationpropertiesinspringboot;

/**
 * 员工
 */
public class Employee {
    private String name;
    /**
     * 薪水
     */
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
