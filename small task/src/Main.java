import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        System.out.println("Enter the number 1");
        Scanner r=new Scanner(System.in);
        a= r.nextInt();
        System.out.println("Enter the number 1");
        b= r.nextInt();
        if(a==b){
            System.out.println("You are right");
        }
        else {
            System.out.println("Error");
        }
    }
}