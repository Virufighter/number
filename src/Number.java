import java.util.Scanner;

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
            if(n%2==0){
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
    public void even(int n){
       if(n%2==0){
           System.out.println("even");
       }else {
           System.out.println("odd");
       }
    }
    public int reverse(int n){
        int r=0;
        while(n>0){
            r=r*10+(n%10);
            n=n/10;
        }
        return r;
    }

    public static void main(String[] args) {
        Number n1=new Number();
        Scanner sc=new Scanner(System.in);
        int j=1;
        while (j==1){
            System.out.println("1.Largest");
            System.out.println("2.smallest");
            System.out.println("3.prime");
            System.out.println("4.even or not");
            System.out.println("5.reverse");
            System.out.println("Enter your choice");
            int s= sc.nextInt();
            switch (s){
                case 1:
                    System.out.println("enter 3 values");
                    System.out.println(n1.largest(sc.nextInt(),sc.nextInt(), sc.nextInt()));
                    break;
                case 2:
                    System.out.println("enter 3 values");
                    System.out.println(n1.smallest(sc.nextInt(),sc.nextInt(), sc.nextInt()));
                    break;
                case 3:
                    System.out.println("enter a value");
                    n1.prime(sc.nextInt());
                    break;
                case 4:
                    System.out.println("enter a value");
                    n1.even(sc.nextInt());
                    break;
                case 5:
                    System.out.println("enter a value");
                    System.out.println(n1.reverse(sc.nextInt()));
                    break;
            }
            System.out.println("do you want to continue 1.yes 2.no");
            j= sc.nextInt();
            }
        }
    }


