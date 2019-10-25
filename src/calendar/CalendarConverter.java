package calendar;

public class CalendarConverter {
    final int MONDAY = 1;
    final int TUESDAY = 2;
    final int WEDNESDAY = 3;
    final int THURSDAY = 4;
    final int FRIDAY = 5;
    final int SATURDAY = 6;
    final int SUNDAY = 7;

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
