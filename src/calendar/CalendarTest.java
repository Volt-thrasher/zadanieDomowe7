package calendar;

public class CalendarTest {
    public static void main(String[] args) {
        for (int i=1; i<8;i++){
            System.out.println(i+" dzien tygodnia to "+CalendarConverter.convertDayToString(i));
        }
    }
}
