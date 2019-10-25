package comparator;

public class ArraysTest {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 7, 2, 8};
        int[] array2 = {1, 2, 3, 5, 7, 2};
        System.out.println(ArraysComparator.compare(array1,array2));

        int[][] array11 = new int[2][3];
        int[][] array22 = new int[2][3];
        array11[0]= new int[]{1,2, 3};
        array11[1]= new int[]{3,3,6};
        array22[0]= new int[]{1, 2, 3};
        array22[1]= new int[]{3,4,6};
        System.out.println(ArraysComparator.compare(array11,array22));
    }
}
