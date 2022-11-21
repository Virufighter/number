public class Number {
    public int largest(int a,int b,int c){
        int result= c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return result;
    }

}
