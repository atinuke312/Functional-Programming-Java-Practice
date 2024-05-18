import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 3, 6, 2, 54, 22, 45);
        //printAllNumbersInListStructured (numbers);
        printEvenNumbersInListStructured(numbers);

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number: numbers){
            System.out.println(number);
        }
    }
    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number: numbers){
            if(number % 2 ==0){
                System.out.println(number);
            }
        }
    }
    
    
}
