public class CheckPrime {

    public static boolean isPrime(int prime)
    {
        if(prime<=1)
        {
            return false;
        }
        for(int i=2;i<=prime;i++)
        {
            if(prime%i==0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        // TODO code application logic here
        int prime=17;
        if(isPrime(prime))
        {
            System.out.println("Prime");
        }
        else
        {
            
            System.out.println("Not Prime");
        }
    }
}
