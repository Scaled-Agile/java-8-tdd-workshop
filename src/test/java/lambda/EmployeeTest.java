package lambda;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void testSortingByNameWithComparator() {
        List<Employee> employees = Lists.newArrayList(
                new Employee("Katie", 30),
                new Employee("Jason", 35)
        );
        Collections.sort(employees, Employee.getSortingByNameWithComparator());
        assertThat(employees.get(0), equalTo(new Employee("Jason", 35)));
    }

    @Test
    public void testSortingByNameWithLambdaFunction() {
        List<Employee> employees = Lists.newArrayList(
                new Employee("Katie", 30),
                new Employee("Jason", 35)
        );
        employees.sort(Employee.getSortingByNameWithLambdaFunction());
        assertThat(employees.get(0), equalTo(new Employee("Jason", 35)));
    }

    @Test
    public void testSortingByNameAndAgeWithLambdaFunction() {
        // TODO: Build your test case
    }

    @Test
    public void testSortingByNameAndAgeWithFunctionComposition() {
        // TODO: Build your test case
    }
}