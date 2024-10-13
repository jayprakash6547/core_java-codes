import java.util.*;

class Switch_Case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("choose the value of a");
        int a = s.nextInt();
        System.out.println("choose the value of b");
        int b = s.nextInt();
        System.out.println("Please choose a Operator + - * / % in these Operator");
        int operator = s.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);

                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }

}
