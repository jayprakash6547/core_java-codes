import java.util.Scanner;
public class Swap_Two_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number1=s.nextInt();
        int number2=s.nextInt();
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println(number1+" "+number2);
    }
}
