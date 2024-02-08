public class main {
    public static void main(String[] args) {

        int value=1;
        if (value==1){
            System.out.println("value was 1");
        } else if (value==2) {
            System.out.println("value was 2");
      }
        else {
          System.out.println("was not 1 or 2");
       }
        int switchvalue=3;

        switch (switchvalue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3,4,or a 5");
                System.out.println("actually it was a " + switchvalue);
            }
            default -> System.out.println("was not 1,2,3,4 or 5");
       }

//
        String month ="XYZ";
        System.out.println(month + " is in the " + getQuater(month) + " quarter");
    }
    public static String getQuater(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield  badResponse;
            }
        };
    }

}
