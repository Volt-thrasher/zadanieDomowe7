package numberSum;

public class Number {

    public static int numberSum(int num) {
        int sum = 0;
        for (int i = 1; num / Math.pow(10, i) > 0; i++) {
            sum += (num % Math.pow(10, i) / Math.pow(10, i - 1));
        }
        return sum;
    }
}
