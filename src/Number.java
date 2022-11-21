public class Number {
    public int largest(int a,int b,int c){
        int result= c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return result;
    }
    public int smallest(int a,int b,int c){
        int result=  c < (a < b ? a : b) ? c : ((a < b) ? a : b);;
        return result;
    }
    public void prime(int n){
        int f=1;
        for (int i=2;i<=n/2;i++){
            if(n/2==0){
                f=0;
                break;
            }
        }
        if(f==1){
            System.out.printf("prime");
        }else {
            System.out.printf("not prime");
        }
    }

}
