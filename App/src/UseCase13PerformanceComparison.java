public class UseCase13PerformanceComparison {

    public static void main(String[] args) {

        String input = "madamimadam";

        long start = System.nanoTime();
        new StringBuilder(input).reverse().toString().equals(input);
        long end = System.nanoTime();

        System.out.println("StringBuilder Time: " + (end - start) + " ns");
    }
}