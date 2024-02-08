public class IsOdd {
    public static void main(String[] args) {
    }
    public static boolean IsBad(int number){
        if (number <= 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if( end < start || end <0 || start<0){
            return -1;
        }
        int sum=0;
        for(int i=start;i<=end;i++){
            if(IsBad(i)){
                sum +=i;
            }
        }
        return sum;
    }
}
