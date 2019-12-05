package com.functionalInterface;



import java.util.function.UnaryOperator;

//UnaryOperator<T> -> T apply(T t)
public class UnaryOperatorMain {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (s1)-> s1.toUpperCase();
        System.out.println(unaryOperator.apply("hello"));

        UnaryOperator<Employee> employeeUnaryOperator = (emp)->{
            if(emp.city.equals("Edison")){
                emp.state="NJ";
            }
            return emp;
        };

        Employee employee = new Employee();
        employee.city = "Edison";
        System.out.println(employeeUnaryOperator.apply(employee));
    }

}

class Employee{
    String city;
    String state;

    @Override
    public String toString(){
        return "Employee [city=" + city + ", state=" + state + "]";
    }
}
