public class minflips {
    static boolean kthBitSet(int n, int k){
        if((n&(1<<(k-1))) != 0){
             return true;
        }else{ 
            return false;
        }
    }
    public static void main(String[] args) {
    int a = 4;
    int b=2;
    int c =5;
    int res = 0;
        for(int i=0; i<32; i++){
            boolean at = kthBitSet(a, i);
            boolean bt = kthBitSet(b , i);
            boolean ct = kthBitSet(c, i);
        if(ct & (at|bt)){
            continue;
        }
        else{
            if(ct){ 
                res++;
            }else{
                if(at) res++;
                if(bt) res++;
            }    
        }
    }
    System.out.println(res);
    }
}
