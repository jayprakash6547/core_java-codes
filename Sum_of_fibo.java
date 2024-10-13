import java.util.Scanner;

public class Sum_of_fibo {

    static int fibo(int n){
        if(n<=0){
            return 0;
        }
        int fibo[]=new int[2*n+1];
        fibo[0]=0;
        fibo[1]=1;
        int s=0;
        for(int j=2;j<=2*n;j++){
            fibo[j]=fibo[j-1]+fibo[j-2];
        }
            for(int j=0;j<=2*n;j+=2){
                s+=fibo[j];
            }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // Sum_of_fibo obj = new Sum_of_fibo();
        System.out.println(fibo(n));
        s.close();
    }
}
