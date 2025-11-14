public class Employee {
    private String name;
    private String department;
    private int salary;
    private int id;

    public String getName() {
        return this.name;
    }
    public String getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
