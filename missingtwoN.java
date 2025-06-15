public class missingtwoN {
    static boolean BitSetFromLSB(int n, int k){
        if((n & (1 << (k-1))) != 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7};
        int res1  = 0;
        for(int i=0; i<=7;i++){
            res1^=i;
        }
        int res2=0;
        for(int n:arr){
            res2^=n;
        }
        int res3 = res1^res2;
        int j =1;
        int k=0;
        while(k==0){
        if(BitSetFromLSB(res3, j)){
            k=j;
        }else{
            j++;
        }
    }
        int res4=0;
        int res5=0;
        for(int n: arr){
            if(BitSetFromLSB(n, k)){
                res4^=n;
            }else{
                res5^=n;
            }
        }
        int n1 = res1^res4;
        int n2 = res1^res5;
        System.out.println("Two missing numbers are - "+ n1+", "+n2);
    }
    }

