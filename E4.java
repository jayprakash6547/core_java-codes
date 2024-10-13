public class E4 {

    static int square(int x){
        int sq=x*x;
        return sq;
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(square(i));
        }
    }
}
