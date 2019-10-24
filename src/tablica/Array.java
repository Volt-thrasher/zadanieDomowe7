package tablica;

import java.util.Random;

public class Array {

    public static void reversedArray(int[] array) {
        String result = "";
        for (int i = 0; i < 2*array.length -1; i++) {
            int a = array[array.length-1-Math.abs(array.length - 1 - i)];
            if (array.length-Math.abs(array.length - 1 - i) == array.length) {
                result = result + " " + a + " " + a;
            } else
                result = result + " " + a;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        Array.reversedArray(array);
    }


}
