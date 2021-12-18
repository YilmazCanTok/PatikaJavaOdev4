import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basenumber;
        int numberofexponents;
        int total = 1;
        System.out.println("****************************************************");
        System.out.println("Program to find exponential numbers according to given numbers: ");
        System.out.println("----------------------------------------------------");
        System.out.print("Please enter the base number: ");
        basenumber = scanner.nextInt();
        System.out.print("Please enter the exponent of number: ");
        numberofexponents = scanner.nextInt();
        System.out.println("----------------------------------------------------");
        for (int i = 0; i <= numberofexponents-1 ; i++) {
            total = total*basenumber;
        }
        System.out.println("Result is : "+total);
    }
}
