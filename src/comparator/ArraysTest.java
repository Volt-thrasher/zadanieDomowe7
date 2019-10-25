package comparator;

public class ArraysTest {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 7, 2, 8};
        int[] array2 = {1, 2, 3, 5, 7, 2};
        System.out.println(ArraysComparator.compare(array1,array2));
    }
}
