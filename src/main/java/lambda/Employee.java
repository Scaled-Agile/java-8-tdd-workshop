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

    // TODO: Implement by using a lambda function
    public static Comparator<? super Employee> getSortingByNameWithLambdaFunction() {
        throw new UnsupportedOperationException("To be implemented");
    }

    // TODO: Implement by using a lambda function that has multiple conditions
    public static Comparator<? super Employee> getSortingByNameAndAgeWithLambdaFunction() {
        throw new UnsupportedOperationException("To be implemented");
    }

    // TODO: Implement by using Function composition and Static Method References
    public static Comparator<? super Employee> getSortingByNameAndAgeWithFunctionComposition() {
        throw new UnsupportedOperationException("To be implemented");
    }
}
