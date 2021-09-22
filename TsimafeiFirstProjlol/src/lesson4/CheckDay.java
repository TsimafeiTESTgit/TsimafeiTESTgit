package lesson4;

public class CheckDay {
    public static void main(String[] args) {
        int day;
        int month;

        CheckDay date1 = new CheckDay();
        date1.checkDayAndMonthIsHoliday(30, 2);

    }


    private boolean checkDayAndMonthIsHoliday(int day, int month) {
        if (month > 0 && month < 13 && day > 0 && day < 32)
            return true;

        if (month == 2 && day > 29)
            return false;

        if (month == 1 && day == 1 || month == 1 && day == 7 || month == 3 && day == 8 || month == 5 && day == 1 || month == 5 && day == 9 || month == 7 && day == 3 || month == 11 && day == 7 || month == 12 && day == 25) {
            System.out.println("holiday");
        } else System.out.println("not holiday");
        return true;
    }


}
