public class Main {
    public static void main(String[] args) {
        System.out.println("3 is " +(isPrime(3)?"": "NOT")+ " a prime number");
        System.out.println("9 is " +(isPrime(9)?"": "NOT")+ " a prime number");
        System.out.println("15 is " +(isPrime(15)?"": "NOT")+ " a prime number");
        System.out.println("41 is " +(isPrime(41)?"": "NOT")+ " a prime number");
        int count=0;
for (int i =10; count<50 && i<=500;i++){
    if(isPrime(i)){
        System.out.println("number" + i+ " is a prime number");
        count++;
    }
}
System.out.println("Total numbers of prime numbers between 10  and 50 is " + count);
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <=2){
            return (wholeNumber==2);
        }
        for(int divisor=2; divisor <= wholeNumber/2; divisor++){
            if (wholeNumber%divisor==0){
              return false;
            }
        }
        return true;
    }
}