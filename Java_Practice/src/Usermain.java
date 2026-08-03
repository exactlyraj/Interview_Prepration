import java.util.*;
import java.util.stream.Collectors;

public class Usermain {

    public static void main (String args[]) {

        List<Users> list =
                List.of(new Users(1, "abhinav", "abhinav@gmail.com","dept1",2000L),
                        new Users(2, "Amit", "Amit@gmail.com","dept1",200L),
                        new Users(3, "Amit", "abhinav@gmail.com","dept1",100L),
                        new Users(4, "abhinav", "abhinav@gmail.com","dept2",2000L),
                        new Users(5, "Amit", "Amit@gmail.com","dept2",1000000L),
                        new Users(6, "Abhinav", "amit@gmail.com","dept2",200L)
                );
        List<Users> distinctUsers = list.stream().collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(
                                Comparator.comparing(u -> u.name() + u.email())
                        )),
                        ArrayList::new
                ));

 /*       distinctUsers.forEach(u ->
                System.out.println(u.getName() + " - " + u.getEmail())
        );*/

//System.out.println(distinctUsers);

/*System.out.println(
list.stream().collect(Collectors.groupingBy(Users::depatment,Collectors.maxBy(Comparator.comparing(Users::salary))))
);*/
        System.out.println(
        list.stream().sorted(Collections.reverseOrder(Comparator.comparing(Users::salary))).limit(2).collect(Collectors.groupingBy(Users::depatment))
   );
        System.out.println(
                list.stream()
                        .collect(Collectors.groupingBy(
                                Users::depatment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        listl -> listl.stream()
                                                .sorted(Comparator.comparingDouble(Users::salary).reversed())
                                                .limit(2)
                                                .collect(Collectors.toList())
                                )
                        ))

                );
System.out.println("************ "+
        list.stream().collect(Collectors.groupingBy(Users::depatment,
                Collectors.collectingAndThen(Collectors.toList(),
                        list2-> list2.stream()
                                .collect(Collectors.maxBy(Comparator.comparing(Users::salary).thenComparing(Users::name)))
                ))));


    }


}


record Users(int id, String name, String email, String depatment, Long salary) {
}


/*
1,abhinav,abhinav@gmail.com

2,Amit,Amit@gmail.com

3,Amit,abhinav@gmail.com

 4,abhinav,abhinav@gmail.com

5,Amit,Amit@gmail.com
6,Abhinav,amit@gmail.com
*/

