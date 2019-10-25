package calendar;

public class CalendarConverter {
    static final int MONDAY = 1;
    static final int TUESDAY = 2;
    static final int WEDNESDAY = 3;
    static final int THURSDAY = 4;
    static final int FRIDAY = 5;
    static final int SATURDAY = 6;
    static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        switch (dayNumber){
            case 1:
                return "Poniedzialek";
            case 2:
                return "Wtorek";
            case 3:
                return "Sroda";
            case 4:
                return "Czwartek";
            case 5:
                return "Piatek";
            case 6:
                return "Sobota";
            case 7:
                return "Niedziela";
            default: return "Dzien tygodnia o podanym numerze nie istnieje";
        }
    }

}
