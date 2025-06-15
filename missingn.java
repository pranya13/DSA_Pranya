public class missingn {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int res =0;
        for(int i=0; i<=6; i++){
           res^=i;
        }
        int res2=0;
        for(int n: arr){
            res2^=n;
        }
        int missingnum = res^res2;
        System.out.println("Missing number is "+missingnum);

    }
}
