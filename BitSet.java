import java.util.Scanner;


public class BitSet {
    static String BtoD(int n){
        if(n==0) return "0";
        String res = "";
        int r;
        while(n>0){
            r = n%2;
            res=r+res;
            n=n/2;
        }
        return res;

    }
    static void BitSetFromLSB(int n, int k){
        if((n & (1 << (k-1))) != 0){
            System.out.println("Kth bit is set from LSB");
        }
        else{
            System.out.println("Kth bit is not set from LSB");
        }
    }

     static void BitSetFromMSB(int n, int k){
        String b = BtoD(n);
        int tb = b.length();
        if((n & (1 << (tb-k))) != 0){
            System.out.println("Kth bit is set from MSB");
        }
        else{
            System.out.println("Kth bit is not set from MSB");
        }
    }
    public static void main(String[] args) {
        int N;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = sc.nextInt();
        System.out.print("Enter k: ");
        k = sc.nextInt();   
        BitSetFromLSB(N, k);
        BitSetFromMSB(N, k);
        System.out.println(BtoD(N));
        sc.close();
        
    }
}
