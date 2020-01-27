import org.junit.Test;

import java.io.PrintStream;
//import org.mockito.Mockito.*;
import java.util.List;

import static org.junit.Assert.*;

public class Assignment2Test {

    @Test
    public void socialSecurityTax() {
        Assignment2  a = new Assignment2();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        e1.salary = 8899;
        e2.salary = 8900;
        e3.salary = 10000;
        e4.salary = 12000;
        assert a.socialSecurityTax(e2) == 6621.599999999999;
        assert a.socialSecurityTax(e3) == 6621.6;
        assert a.socialSecurityTax(e4) == a.socialSecurityTax(e3);
        assert a.socialSecurityTax(e1) == 6620.856;
    }

    @Test
    public void insuranceCoverage() {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        e1.age = 30;
        e2.age = 45;
        e3.age = 55;
        e4.age = 80;
        e1.salary = 1;
        e2.salary = 1;
        e3.salary = 1;
        e4.salary = 1;
        assert Assignment2.insuranceCoverage(e1) == 0.03;
        assert Assignment2.insuranceCoverage(e2) == 0.04;
        assert Assignment2.insuranceCoverage(e3) == 0.05;
        assert Assignment2.insuranceCoverage(e4) == 0.06;
    }

    @Test
    public void sortSalary() {
        Assignment2  a = new Assignment2();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.salary = 8899;
        e2.salary = 8900;
        e3.salary = 10000;
        e1.name = "Arch";
        e2.name = "Brandy";
        e3.name = "Catherine";
        //a.sortSalary(e1, e2, e3);
        //assertArrayEquals(List<Employee>({e3, e2, e1}));
    }
}