package DSA.Recursion;

public class recursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");
    }

    public static void table(int n, int i){
        
        if (i == 10){
            System.out.println(n*i);
            return;
        }
        System.out.println(n * i);
        table( n, i+1);
    }

   public static int fact(int n){
    if(n == 0){
        return 1;
    }
    return n * fact(n-1);
    }

    public static int natural(int n){
        if(n == 1){
            return 1;
        }
        return n + natural(n-1);
    }
    public static int fib(int n){
        if(n == 0 ){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    

    public static void main(String args[]){
        int n = 6;
        //int i = 1;
        //printDec(n);
        //printInc(n);
        //table(n, i);
        //System.out.print(fact(n));
        //System.out.print(natural(n));
        //System.out.print(fib(n));
    }
}
