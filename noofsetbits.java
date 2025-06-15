import java.util.Scanner;

public class noofsetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int num = n;
        int tsb = 0;
        while(n>0){
            if((1&n) == 1){
                tsb+=1;
            }
                n=n>>1;
        }
        System.out.println("Total number of set  bits in "+ num + " = "+tsb);
        sc.close();
    }
}
