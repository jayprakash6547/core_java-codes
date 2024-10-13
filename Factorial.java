import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number=s.nextInt();
        int fact=1;
        for(int i=0;i<number;i++){
            fact=fact*(number-i);
        }
        System.out.println(fact);
    }
    }

