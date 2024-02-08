import java.util.Scanner;

class Person{
    private String surname;
    private String firstName;
    private String street;
    private String zipCode;
    private String city;

    public Person(){

    }

    public Person(String surname, String firstName, String street, String zipCode, String city){
        this.surname = surname;
        this.firstName = firstName;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }
    //Method for initialization
    public void initialize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your surname: ");
        this.surname = scanner.nextLine();
        System.out.println("Enter your first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter your street: ");
        this.street = scanner.nextLine();
        System.out.println("Enter your zip code: ");
        this.zipCode = scanner.nextLine();
        System.out.println("Enter your city: ");
        this.city = scanner.nextLine();
    }
    //Method for displaying datas
    public void print(){
        System.out.println("Your surname is :"+ this.surname);
        System.out.println("Your first name is :"+ this.firstName);
        System.out.println("Your street name is :"+ this.street);
        System.out.println("Your zip code is :"+ this.zipCode);
        System.out.println("Your city is :"+ this.city);
    }

}

class Staff extends Person{
    private String education;
    private String position;

    public Staff(){

    }

    public Staff(String education, String position){
        this.education = education;
        this.position = position;
    }

    public void initialize1(){
        super.initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your education : ");
        this.education = scanner.nextLine();
        System.out.println("Enter your position : ");
        this.position = scanner.nextLine();
    }

    public void print1(){
        super.print();
        System.out.println("Your education is :"+ this.education);
        System.out.println("Your position is :"+ this.position);
    }
}

class MainClass{
    public static void main(String[] args){
        Staff staff = new Staff();
        staff.initialize1();
        staff.print1();
    }
}