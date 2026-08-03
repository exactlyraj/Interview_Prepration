import java.util.*;
import java.util.stream.*;
public class SortAListOfEmployeeBySalary {
    public static void main(String args[]){
       //sortAListOfEmployeeBySalary();
        top2SalaryByDepartment();
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
        System.out.println(" ========= ========= ========= ========= ========= ========= ========= ========= =========" +
                "\n Sort by salary "+
        list.stream().sorted(Comparator.comparing(Employee::Salary)).collect(Collectors.toList()));
        System.out.println(" Group By Department "+
        list.stream().collect(Collectors.groupingBy(Employee::department)));
        System.out.println(" Group By Department and max salary "+
        list.stream().collect(Collectors.groupingBy(Employee::department,Collectors.maxBy(Comparator.comparing(Employee::Salary)))));
        System.out.println(" Max salary of Employee "+
        list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::Salary)))+"\n " +
                "========= ========= ========= ========= ========= ========= ========= ========= =========");
        // Top 2 salary Group By Department
            Map<String, List<Employee>> topTwoByDept = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                empList -> empList.stream()
                                        .sorted(Comparator.comparing(Employee::Salary).reversed())
                                        .limit(2)
                                        .collect(Collectors.toList())
                        )
                ));

        System.out.println("Top 2 salary "+topTwoByDept);

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


        //Find the maximum salary from a list of Employee objects using streams.
        System.out.println("Maximum salary from a list "+
        list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::Salary))).get());
       }


       public static void top2SalaryByDepartment(){
           List<Employee> list = List.of(
                   new Employee(1,"A1","IT", 100000L),
                   new Employee(2,"B1","DBA", 20000L),
                   new Employee(3,"C1","AI", 20000L),
                   new Employee(4,"D1","IT", 19000L),
                   new Employee(5,"E1","DBA", 2000L),
                   new Employee(6,"F1","AI", 1000L),
                   new Employee(4,"G1","IT", 13000L),
                   new Employee(5,"H1","DBA", 23000L),
                   new Employee(6,"I1","AI", 13000L)
           );


              Map<String, List<Employee>> groupByDept =
                      list.stream().collect(Collectors.groupingBy(Employee::department));
              //System.out.println(groupByDept);

           Map<String, List<Employee>> limit =
                   groupByDept.entrySet().stream()
                           .collect(Collectors.toMap(x-> x.getKey(),x -> x.getValue().stream().sorted(Comparator.comparing(Employee::Salary).reversed()).limit(2).collect(Collectors.toList())));
           System.out.println(limit);

      }
}



record Employee(int id, String name, String department, Long Salary){}