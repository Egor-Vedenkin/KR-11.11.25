import javax.management.MBeanRegistration;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void listOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString() + " " + employees[i].getId());
            }
        }
    }

    public int avgSalary() {
        int quantityOfWorkers = 0;
        int summarySalary = 0;
        int avgSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                quantityOfWorkers += 1;
                summarySalary += employees[i].getSalary();
            }
        }

        avgSalary = summarySalary / quantityOfWorkers;
        return avgSalary;
    }

    public void taxCounter(String method) {
        switch (method) {
            case "PROPORTIONAL":
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i] != null) {
                        System.out.println("Налог у " + employees[i].getName() + " составляет: " + employees[i].getSalary() * 0.13);
                    }
                }
                break;
            case "PROGRESSIVE":
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i] != null) {
                        if (employees[i].getSalary() < 150) {
                            System.out.println("Налог у " + employees[i].getName() + " составляет: " + employees[i].getSalary() * 0.13);
                        } else if (employees[i].getSalary() < 350) {
                            System.out.println("Налог у " + employees[i].getName() + " составляет: " + employees[i].getSalary() * 0.17);
                        } else if (employees[i].getSalary() > 350) {
                            System.out.println("Налог у " + employees[i].getName() + " составляет: " + employees[i].getSalary() * 0.21);
                        }
                    }
                }
        }
    }

    public void indexSalary(int numberDepartment, int indexPercent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == numberDepartment) {
                    employees[i].setSalary(employees[i].getSalary() * (1 + indexPercent / 100));
                } else {
                    continue;
                }
            }
        }
    }

    public void firstEmployee(int numberDepartment, int searchSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == numberDepartment && employees[i].getSalary() > searchSalary) {
                    employees[i].printShortInfo();
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    public void employeesWithWageSalary(int wage, int employeeNumber) {
        int counterPrint = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < wage && counterPrint < employeeNumber) {
                    System.out.println(employees[i].getSalary());
                    counterPrint += 1;
                } else {
                    continue;
                }
            }
        }
    }

    public boolean checkEmployee(Employee worker) {
        boolean employeeHere = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (worker.equals(employees[i])) {
                    employeeHere = true;
                }
            }
        }
        if (employeeHere) return true;
        else return false;
    }

    public void addToBook(Employee obj) {
        boolean bookIsFull = true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                bookIsFull = false;
            }
        } if (!bookIsFull) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = obj;
                    break;
                }
            }
        } if (bookIsFull) {
            System.out.println("Невозможно добавить сотрудника");
        }
    }

    public void idFinder(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    System.out.println(employees[i]);
                    return;
                }
            }
        }
        System.out.println("Такого сотрудника нет");
    }


}


