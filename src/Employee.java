public class Employee {
    private String name;
    private int department;
    private int salary;
    private static int id;

    Employee(String name, int department, int salary, int id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return Double.compare(this.salary, other.salary) == 0;
    }

    @Override
    public String toString() {
        return "ФИО: " + this.name + ", Должность: " + this.department + ", Зарплата: " + this.salary;
    }

    public void printShortInfo() {
        System.out.println("ФИО: " + this.name + " Зарплата: " + this.salary);
    }

}
