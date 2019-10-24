package numberSum;

public class Number {

    public static int numberSum(int num) {
        int sum = 0;
        for (int i = 1; num / Math.pow(10, i) > 0; i++)
        {
            sum += (num % Math.pow(10, i) / Math.pow(10, i - 1)); //do sumy dodaje reszte od dzielenia liczby
                                            // przez 10^i, ktora dzielimy przez potege 10 o 1 mniejsza
                                            // zeby odciac cala koncowke. W wyniku zostaje jedna cyfra okreslajaca
                                            // liczbe danej potegi 10 
        }
        return sum;
    }
}
