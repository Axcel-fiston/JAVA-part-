public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1440);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println(" Invalid Value");
        }
        else {
            long day;
            long year;

            day=minutes/1440;
            year=minutes/51640;
            System.out.println(minutes+" min = "+ year+" y and "+ day+" d ");
        }
    }
}
