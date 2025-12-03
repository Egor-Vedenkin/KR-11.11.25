//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employer1 = new Employee("Василий", 1, 149, 1);
        Employee employer2 = new Employee("Егор", 2, 250, 2);

        EmployeeBook book = new EmployeeBook();
        book.addToBook(employer1);
        book.addToBook(employer2);

        book.listOfEmployees();
        System.out.println("Средняя зарплата: " + book.avgSalary());
        book.taxCounter("PROGRESSIVE");
    }
}