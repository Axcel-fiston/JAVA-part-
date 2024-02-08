public class Do{
    public static void main(String[] args) {
//int number=4;
int lastNumber=20;
int OddCount=0;
int EvenCount=0;
//while (number<=lastNumber){
//    number++;
//    if(!IsEvenNumber(number)){
//        OddCount++;
//        continue;
//    }
//
//    System.out.println("Even number " +number);
//    EvenCount++;
//    if(EvenCount>=5){
//        break;
//    }
//}
//        System.out.println("The total Odd Numbers = " + OddCount);
//        System.out.println("The total Even Numbers = " + EvenCount);
        for(int number=4; number<=lastNumber;number++){
            if(!IsEvenNumber(number)){
                OddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            EvenCount++;
            if(EvenCount>=5){
                break;
            }
        }
        System.out.println("The total Odd Numbers = " + OddCount);
       System.out.println("The total Even Numbers = " + EvenCount);
    }
    public static boolean IsEvenNumber(int number){
        if(number %2==0){
            return true;
        }
        return false;

    }
}