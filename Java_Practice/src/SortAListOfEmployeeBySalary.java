import java.util.*;
import java.util.stream.*;
public class SortAListOfEmployeeBySalary {
    public static void main(String args[]){
       sortAListOfEmployeeBySalary();
    }

    public static void  sortAListOfEmployeeBySalary(){
        List<Employee> list = List.of(
                new Employee(1,"Abhinav","IT", 100000L),
                new Employee(2,"Nupur","DBA", 20000L),
                new Employee(3,"Aayansh","AI", 20000L),
                new Employee(4,"Mohit","IT", 10000L),
                new Employee(5,"Rohit","DBA", 2000L),
                new Employee(6,"Agastya","AI", 1000L)
        );

        // Sort by salary
        System.out.println(
                list.stream().sorted(Comparator.comparing(Employee::Salary)).collect(Collectors.toList()));

        // Group by Department
        System.out.println(
                list.stream().collect(Collectors.groupingBy(Employee::department)));

        // Group by Department Sort by max salary
        System.out.println(
                list.stream().collect(Collectors.groupingBy(Employee::department,Collectors.maxBy(Comparator.comparing(Employee::Salary)))));
        // Get it from Map and Group by Department Sort by max salary
        Map<String, List<Employee>> hm = new HashMap<>();
        hm.put("employee",list);
        //.......
       }
}

record Employee(int id, String name, String department, Long Salary){}