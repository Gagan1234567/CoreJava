import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Streams {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employees.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employees.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employees.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employees.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employees.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employees.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employees.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employees.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employees.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employees.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employees.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employees.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employees.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employees.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employees.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employees.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
 /*       //count of all dept
      long n=  employees.stream().map(emp->emp.department).distinct().count();
        System.out.println(n);
        // average age of male and female
        double averageM= employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("Male"))
                .map(emp->emp.getAge()).mapToInt(i->i).average().getAsDouble();
        double averageF= employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("Female"))
                .map(emp->emp.getAge()).mapToInt(i->i).average().getAsDouble();

     System.out.println("averageMaleAge="+averageM+","+"averageFemaleAge="+averageF);
or
Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
employees.stream().collect(Collectors.
groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));


// Get the details of highest paid employee in the organization?

                Employee emp=
                employees.stream().
                collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();


     System.out.println("Id="+emp.getId()+" "+"Name="+emp.getName()+" "+"Age="+emp.getAge());

//Double employee=employees.stream().map(emp->emp.salary).mapToDouble(i->i)
//        .max().getAsDouble();
//        System.out.println(employee);

//Get the names of all employees who have joined after 2015?
       List<String> name=employees.stream().filter(emp->emp.yearOfJoining>2015)
       .map(emp->emp.name)
        .collect(Collectors.toList());
        System.out.println(name);
//Count the number of employees in each department?
        Map<String,Long> countOfEmployeBasedOnDept=employees.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment,Collectors.counting()));
        System.out.println(countOfEmployeBasedOnDept);


//What is the average salary of each department?
        Map<String,Double> averageSalaryInEachDept=employees.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryInEachDept);

//Get the age of youngest male employee in the product development department?
        int n=  employees.stream().filter(emp->emp.department.
                        equalsIgnoreCase("Product Development") &&
                        emp.getGender().equalsIgnoreCase("Male"))
                .map(Employee::getAge)
                .reduce((a,b)->a<b?a:b).get();
        System.out.println(n);
// Get the details of youngest male employee in the product development department?
        Employee em=  employees.stream().filter(emp->emp.department.
                        equalsIgnoreCase("Product Development") &&
                        emp.getGender().equalsIgnoreCase("Male")).
                collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).get();

        System.out.println(em.age+" "+em.name+" "+em.department);


//Who has the most working experience in the organization?
        Employee emp=employees.stream().collect
        (Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get();
        System.out.println(emp.getName() +"||"+emp.yearOfJoining);
// How many male and female employees are there in the sales and marketing team?
        Map<String,Long> maleAndFemaleInSalesAndMarketing=employees.stream().
         filter(emp->emp.getDepartment().equalsIgnoreCase("Sales And Marketing"))
         .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println(maleAndFemaleInSalesAndMarketing);


//What is the average salary of male and female employees?
        Map<String,Double> avergageSalaryOfMaleAndFemale=employees.stream()
        .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(emp->(int) emp.salary)));
        System.out.println(avergageSalaryOfMaleAndFemale);
  */
        Map<String,Set<Employee>> nameOfEmployeeInEachDepartment=employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.toSet()));
        System.out.println(nameOfEmployeeInEachDepartment);

        /*
        
       //find the male and female from employee whose age is greater than 20
      Map<String,Long> mp= employees.stream().filter(x->x.getAge()>20).collect(Collectors.
                groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(mp);
        //return male count  from employee whose age is greater than 20
       Long n= employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("Male"))
                .filter(emp->emp.getAge()>20).map(emp->emp.getAge()).count();
        System.out.println(n);
       //  secondHighestElement in an array
        int arr[]={8,1,30,6,40,5,2};
        Integer secondHighestElement=Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestElement);
        int sum= Arrays.stream(arr).reduce(0,(a, b)->a+b);
        System.out.println(sum);
*/
/*
//Unique character in a given string
         String str="misssiiipp";
               String[] s=str.split("");
        List<String> mp=Arrays.stream(s)
                .collect
                        (Collectors.groupingBy
                        (Function.identity(),Collectors.counting())).entrySet().stream()
                        .filter(x->x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
                        System.out.println(mp);

//first non repeating using streams
        String str = "issmsiiipp";
        String copiedString = str.substring(0);
        String[] s = copiedString.split("");

        String mp = Arrays.stream(s)
                .collect
                        (Collectors.groupingBy
                                (Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println(mp);
        char nonRepatedCahr = mp.charAt(0);
       int n= indexOfNonRepeating(str, nonRepatedCahr);
        System.out.println(n);
    }

    public static int indexOfNonRepeating(String str, char ch) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
//return a second character of a string
        String str = "a,b,c,d";
        String[] s=str.split(",");

       String result= Arrays.stream(s).skip(1).findFirst().get();

        System.out.println(result);
//reverse character of string
        String str ="a,b,c,d";
        String[] s=str.split(",");
       Optional<String> result= Arrays.stream(s).reduce((a,b)->b+" "+a);
       if(result.isPresent()){
           System.out.println(result.get());
       }
*/





    }
}