package lambda;

import java.util.Comparator;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public static Comparator<? super Employee> getSortingByNameWithComparator() {
        return new Comparator<Employee>() {
            @Override
            public int compare(Employee h1, Employee h2) {
                return h1.getName().compareTo(h2.getName());
            }
        };
    }

    // TODO: Implement by using lambda function
    public static Comparator<? super Employee> getSortingByNameWithLambdaFunction() {
        return (e1, e2) -> e1.getName().compareTo(e2.getName());
    }

    /* TODO:
    /   1. Implement by using lambda function with multiple conditions
    /   2. Implement by Static Method Reference and Function composition
     */
    public static Comparator<? super Employee> getSortingByNameAndAge() {
        return Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
    }

}
