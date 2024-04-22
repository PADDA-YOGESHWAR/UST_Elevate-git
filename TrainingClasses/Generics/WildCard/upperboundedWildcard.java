import java.util.List;

public class upperboundedWildcard {

    // Generic method to calculate the sum of elements in a list
    public static <T extends Number> double sumOfNumbers(List<T> numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumOfNumbers(integerList));

        List<Double> doubleList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        System.out.println("Sum of doubles: " + sumOfNumbers(doubleList));

        // List of Longs
        List<Long> longList = List.of(100L, 200L, 300L);
        System.out.println("Sum of longs: " + sumOfNumbers(longList));
    }
}
