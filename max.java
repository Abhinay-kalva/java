public class max {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println("Max of 3, 7, 5: " + findMax(3, 7, 5));
        System.out.println("Max of Apple, Mango, Banana: " + findMax("Apple", "Mango", "Banana"));
        System.out.println("Max of 4.5, 2.3, 9.8: " + findMax(4.5, 2.3, 9.8));
    }
}
