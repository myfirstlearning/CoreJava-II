package com.collections;

import java.util.*;

//Set - not an ordered collection, it doesn't allow duplicates, not an index based
//HashSet -  LinkedHashSet((LinkedList + HashSet)it maintains insertion order)
//TreeSet - impls SortedSet extends Set, NavigableSet -> sorted order (doesn't uses hashcode or equals method)
//TreeSet - doesn't allow Null values
public class SetMain {

    public static void main(String[] args) {

        Set<String> color = new HashSet<>();
        color.add("Red");
        color.add("Blue");
        color.add("Red");


        System.out.println(color.size());
        System.out.println(color);

        //hashcode and equals implementation to identify duplicates
        Student s1 = new Student("John", "Lewisville");
        Student s2 = new Student("John", "Coppell");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());
        System.out.println(students);

        for(Student s: students){
            System.out.println(s);
        }


        // === Comparable Interface and CompareTo method
        Set<String> colorSet = new TreeSet<>();
        colorSet.add("red");
        colorSet.add("blue");
        colorSet.add("green");
        colorSet.add("red");

        for(String s: colorSet){
            System.out.println(s);
        }

        //lexicographic comparison
        Set<Employee> employeeSet = new TreeSet<>(Collections.reverseOrder());
        Employee employee1 = new Employee("abc1", "John", "Lewisville");
        Employee employee2 = new Employee("abc123", "Mike", "Denton");
        Employee employee3 = new Employee("bbc11", "Mike", "Coppell");
        Employee employee4 = new Employee("aabc11", "John", "Lewisville");
        Employee employee5 = new Employee("aabc11", "John", "Albany");

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);


        System.out.println(employeeSet.size());


        if(employeeSet != null && employeeSet.size() != 0) {
            for (Employee employee : employeeSet) {
                System.out.println(employee);
            }
        }

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpId().compareTo(o2.getEmpId());
            }
        };
        Comparator<Employee> comparator1 = (o1, o2) -> o1.getEmpId().compareTo(o2.getEmpId());

        Set<Employee> employeeSet1 = new TreeSet<>(new EmployeeIdComparator());
        employeeSet1.add(employee1);
        employeeSet1.add(employee2);
        employeeSet1.add(employee3);
        employeeSet1.add(employee4);
        employeeSet1.add(employee5);



        //NavigableSet(celling, floor, higher, lower, pollfirst, polllast)
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(1);
        navigableSet.add(2);
        navigableSet.add(3);
        navigableSet.add(4);
        navigableSet.add(5);

        System.out.println(navigableSet.ceiling(3));//>=
        System.out.println(navigableSet.floor(3));//<=
        System.out.println(navigableSet.higher(3));//>
        System.out.println(navigableSet.lower(3));//<

    }

}
