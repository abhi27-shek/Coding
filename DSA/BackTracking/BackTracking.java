package DSA.BackTracking;

public class BackTracking {

//------------------------------------------------------------------
    //changeArr
    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]= arr[i]-2;
    }
    //print arr
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//------------------------------------------------------------------
//find subset of string
    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        
        //no choice
        findSubsets(str, ans, i+1);
    }
//------------------------------------------------------------------
    public static void findPermutation(String str, String ans){
        //base
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde"=> "ab"+"de"="abde"
            String NewStr = str.substring(0,i)+ str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        }
    }
//------------------------------------------------------------------
    //nQueen problem
    public static void nQueens(char board[][], int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = '.';
        }
    }

    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
        }
    }
//------------------------------------------------------------------

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        // String str = "abc";
        // findSubsets(str, "", 0);
        int n = 2;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}
