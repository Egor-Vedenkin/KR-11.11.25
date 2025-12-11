//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employer1 = new Employee("Василий", 1, 149, 1);
        Employee employer2 = new Employee("Егор", 2, 250, 2);
        Employee employer3 = new Employee("Олег", 3, 309, 3);
        Employee employer4 = new Employee("Владимир", 1, 190, 4);
        Employee employer5 = new Employee("Владислав", 1, 320, 5);
        Employee employer6 = new Employee("Александр", 3, 450, 6);
        Employee employer7 = new Employee("Сергей", 3, 100, 7);
        Employee employer8 = new Employee("Майя", 3, 50, 8);
        Employee employer9 = new Employee("Семен", 4, 250, 9);
        Employee employer10 = new Employee("Анастасия", 5, 460, 10);
        Employee employer11 = new Employee("Ксения", 1, 207, 11);

        EmployeeBook book = new EmployeeBook();
        book.addToBook(employer1);
        book.addToBook(employer2);
        book.addToBook(employer3);
        book.addToBook(employer4);
        book.addToBook(employer5);
        book.addToBook(employer6);
        book.addToBook(employer7);
        book.addToBook(employer8);
        book.addToBook(employer9);
        book.addToBook(employer10);
        book.addToBook(employer11);

        book.listOfEmployees();

        System.out.println("Средняя зарплата: " + book.avgSalary());

        book.firstEmployee(1, 500);

        book.idFinder(10);


    }
}