public class Sum {
    public static void main(String[] args) {
       int count=0;
       int sum= 0;
       for (int i =100; i>0;i++){
            if((i%3==0) && (i%5==0)){
               sum+=i;
               System.out.println("found a match"+i);
               count++;
           }
           if(count==5){
               System.out.println("the sum of numbers that met the conditions above are " +sum );
break;
           }

       }
    }
}
