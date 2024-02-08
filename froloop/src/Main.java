public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        System.out.println("The percentage of 2% is " + calculateInterest(1000,250));
        for (double rate=2.0; rate <=5; rate ++){
            double interestAmount= calculateInterest(1000, rate);
            System.out.println("1000 at " +rate+ "% interest ="+ interestAmount);
        }
    }
    public static double calculateInterest ( double amount, double interest){
        return (amount * (interest / 100));
    }
}