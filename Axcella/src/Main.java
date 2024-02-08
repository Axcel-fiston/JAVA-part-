import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        System.out.println("Enter the value ");
        Scanner r= new Scanner(System.in);
        x= r.nextInt();
        System.out.println("Enter the value ");
        y= r.nextInt();
        if(x>y){
            System.out.println("X is greater than y");
        } else if (x==y) {
            System.out.println("x and y are equal");

        } else{
            System.out.println("Y is greater than x");
        }
    }
}