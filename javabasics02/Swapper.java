public class Swapper<T> {
    public static <T> void doSwap(T a, T b) {
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping the variables
        T temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Integer int1 = 10;
        Integer int2 = 20;
        System.out.println("Swapping integers:");
        doSwap(int1, int2);

        String str1 = "Hello";
        String str2 = "World";
        System.out.println("\nSwapping strings:");
        doSwap(str1, str2);
    }
}
