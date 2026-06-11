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
//------------------------------------------------------------------

    public static void printInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");
    }
//------------------------------------------------------------------

    public static void table(int n, int i){
        
        if (i == 10){
            System.out.println(n*i);
            return;
        }
        System.out.println(n * i);
        table( n, i+1);
    }
//------------------------------------------------------------------

   public static int fact(int n){
    if(n == 0){
        return 1;
    }
    return n * fact(n-1);
    }
//------------------------------------------------------------------

    public static int natural(int n){
        if(n == 1){
            return 1;
        }
        return n + natural(n-1);
    }
//------------------------------------------------------------------

    public static int fib(int n){
        if(n == 0 ){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
//------------------------------------------------------------------

    public static void sorted(int arr[], int n){}
//------------------------------------------------------------------
    //first Orrcurence
    public static int firstOrrcurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOrrcurence(arr, 5,0);
    }
//-------------------------------------------------------------------
    //Last Orrcurence
    public static void lastOrrcurence(int arr[], int key, int i){

    }
//------------------------------------------------------------------
    public static int powers(int x, int n){
        if(n==0){
            return 1;
        }

        return x*powers(x, n-1);
    }
//------------------------------------------------------------------
    //Tiling problem
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //Kaam
        //vertical
        int fnm1 = tilingProblem(n-1);

        //horizontal
        int fnm2 = tilingProblem(n-2);

        //Total Ways
        return fnm1+fnm2;
    }
//------------------------------------------------------------------
    //Remove Duplicates
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar= str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
//------------------------------------------------------------------
    //friends pairing problem
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pairing
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String args[]){
        int n = 3;
        //int i = 1;
        //printDec(n);
        //printInc(n);
        //table(n, i);
        //System.out.print(fact(n));
        //System.out.print(natural(n));
        //System.out.print(fib(n));
        //int arr[]={8,5,6,4,3,5};
        //System.out.print(powers(2,4));
        //int s[] ={1,3,3,9};
        //System.out.print(tilingProblem(n));
        //String str = "aabbhhishek";
        //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.print(friendsPairing(n));
    }
}
