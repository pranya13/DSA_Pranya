import java.util.Scanner;

public class PowerOf2 {
    static int P2(int n){
        if(n==0) return 1;
        return 2*P2(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        System.out.println(P2(n));
        sc.close();
    }
}
