public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(1,2020));
    }
    public static boolean isLeapYear(int year){
       if (year<1 || year>9999){
           return false;
       }
       else if ((year%4==0) && (year%100!=0) || (year%400==0)){
           return true;
       }
       return false;
    }
    public static int getDaysInMonth(int month , int year){
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            }
            default -> {
                return -1;
            }

            }
        }

    }

