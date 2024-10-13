import java.util.Scanner;
public class Integer_To_Binary_Convert {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int number =s.nextInt();
        int binary =0;
        int i=0;
        while(number>0){
            int rem = number%2;
            binary = (int) (binary + rem*Math.pow(10,i));
            number = number/2;
            i++;
        }
        System.out.println(binary);
    }
}
