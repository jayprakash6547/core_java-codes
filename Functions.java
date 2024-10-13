// import java.util.*;

public class Functions {
    static int Greatest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int ans = Greatest(a, b);
        System.out.println(ans);
    }
}
