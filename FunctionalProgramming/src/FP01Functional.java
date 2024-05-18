import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 3, 6, 2, 54, 22, 45);
        List<String> courses = List.of("Spring","Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker","Kubernetes");
        //printAllNumbersInListFunctional (numbers);
        //printEvenNumbersInListFunctional (numbers);
        //printSquaresOfEvenNumbersInListFunctional(numbers);
        //printOddNumbersInListFunctional (numbers);
        //printCubesOfOddNumbersInListFunctional(numbers);
        //printAllCourses(courses);
       // printAllCoursesContainingSpring(courses);
        //printAllCoursesLongerThan4(courses);
        printNumOfCharsInEachCourse(courses);

    }




    private static void print(int number){
        System.out.println(number);
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);//for each element, call the print function;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //stream, if filter is true, then print
        numbers.stream()
                .filter(number -> number %2 ==0)
                .forEach(System.out::println);//for each element, call the print function;
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        //stream, if filter is true, then print
        numbers.stream()
                .filter(number -> number %2 ==0)
                .map(number -> number * number)
                .forEach(System.out::println);//for each element, call the print function;
    }
    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2!=0).map(number-> number*number*number).forEach(System.out::println);
    }


    private static void printAllCourses(List<String>courses){
        courses.stream().forEach(System.out::println);
    }

    private static void printAllCoursesContainingSpring(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    private static void printAllCoursesLongerThan4(List<String> courses) {
        courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
    }

    private static void printNumOfCharsInEachCourse(List<String> courses) {
        courses.stream().map(course -> course + " " +course.length()).forEach(System.out::println);
    }
}
