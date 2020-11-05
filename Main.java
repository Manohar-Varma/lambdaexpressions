package lambdaexpressions;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {



        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 24);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);




        Stream<Employee> filtered_name = employees.stream().filter(p -> p.name.startsWith("T")).sorted(); //.forEach(p-> System.out.println(p.name));
        filtered_name.forEach(p-> System.out.println(p.name));












        // we're sorting list by using an anonymous inner class that implements Comparator.
//
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//Lambdas replace the above with something that's much easier to read.
// In Comparator you'll notice it's marked with @FunctionalInterface.
// you can drop argument types. The compiler is really good at figuring types based on context



//        Collections.sort(employees, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));
//
//        for (Employee employee : employees) {
//            System.out.println(employee.name+" "+employee.age);
//        }



//        Predicate<Employee> predicateForAge = (e) -> e.age >= 25;
//        Predicate<Employee> predicateForName = (e) -> e.name.startsWith("T");
//
//        System.out.println("-------------Predicate By Age---------------");
//
//        for(Employee emp : employees) {
//            if(predicateForAge.test(emp)) {
//                System.out.println(emp.name +" is eligible by age "+emp.age);
//            }
//        }
//        System.out.println("------------Predicate By Name----------------");
//        for(Employee emp : employees) {
//            if(predicateForName.test(emp)) {
//                System.out.println(emp.name +" is eligible by name Starting with T ");
//            }
//        }





//        System.out.println("------Filter age by stream-------");
//
//        // using lambda to filter data through stream
//        Stream<Employee> filtered_age = employees.stream().filter(p -> p.age >= 25);
//
//        // using lambda to iterate through collection
//        filtered_age.forEach(
//                emp -> System.out.println(emp.name+": "+emp.age));







//        Stream<Employee> filtered_name = employees.stream().filter(p -> p.name.startsWith("T")).sorted(); //.forEach(emp-> System.out.println(emp.name));
//         filtered_name.forEach(emp-> System.out.println(emp.name));













//
//                 try {
//            List<Employee> filtered_name1 = employees.stream().filter(p -> p.name.startsWith("T"));
//          filtered_name1.forEach(employee -> System.out.println(employee.name));
//
//        }
//        catch (ClassCastException ex){
//            System.out.println("Exists still ");
//        }

    }
























    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}






