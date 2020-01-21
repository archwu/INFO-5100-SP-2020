import java.util.*;

public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double tax = employee.salary <= 8900 ? employee.salary * 0.062 * 12 : 106800 * 0.062;
        return tax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
        //write your code here
        double insurance;
        int age = employee.age;
        int salary = employee.salary;
        if (age < 35) {
            insurance = salary * 0.03;
        } else if (age <= 50 && age >= 35) {
            insurance = salary * 0.04;
        } else if (age > 50 && age < 60) {
            insurance = salary * 0.05;
        } else {
            insurance = salary * 0.06;
        }

        return insurance;
    }


    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.sort((x, y) -> Integer.compare(e1.salary, e2.salary));
        for (Employee employee : list) {
            System.out.println(employee.name);
        }
    }

//Extra credit


    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
	    /*
	     write your understanding here.
	     Java always pass by value. Therefore calling the swap method will result in two copies of the original Employee
	     objects pointing to the original
	     Your Answer:
	    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);//
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.salary = 8899;
        e2.salary = 8900;
        e3.salary = 10000;
        e1.name = "Arch";
        e2.name = "Brandy";
        e3.name = "Catherine";
        sortSalary(e1, e2, e3);
    }


    public static void swap(Employee x, Employee y) {
        Employee temp = new Employee(x.name, x.age, x.gender, x.salary);
        x.name = y.name;
        x.age = y.age;
        x.gender = y.gender;
        x.salary = y.salary;
        y.age = temp.age;
        y.name = temp.name;
        y.gender = temp.gender;
        y.salary = temp.salary;
    }
}

class Employee {
    String name;
    int age;
    int gender;
    int salary;

    public Employee(String name, int age, int gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return this.name;
    }
}

class Gender {
    static final int FEMALE = 0;
    static final int MALE = 1;
}