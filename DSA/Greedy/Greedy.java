package DSA.Greedy;
import java.util.*;

public class Greedy {
    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println(minDiff);
    }
}


// int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         //end time basic sorted
//         int maxAct = 0;
//         ArrayList<Integer>ans = new ArrayList<>();

//         //1st activity
//         maxAct = 1;
//         ans.add(0);
//         int lastEnd = end[0];
//         for(int i=1; i<end.length; i++){
//             if(start[i] >= lastEnd){
//             //activity select
//             maxAct++;
//             ans.add(i);
//             lastEnd = end[i];
//             }
//         }
//         System.out.println("max activities =" + maxAct);
//     for(int i=0; i<ans.size(); i++){
//         System.out.println("A"+ans.get(i)+" ");
//     }
//     System.out.println();

// int val[] = {60, 100, 120};
//         int weight[] = {10, 20, 30};
//         int W = 50;
        
//         double ratio[][] = new double[val.length][2];
//         //0th col =>; 1st col => ratio

//         for(int i=0; i<val.length; i++){
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }

//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity = W;
//         int finalVal = 0;
//         for(int i=ratio.length-1; i>=0; i--){
//             int idx = (int)ratio[i][0];
//             if(capacity >= weight[idx]){ //include full item
//                 finalVal += val[idx];
//                 capacity -= weight[idx];
//             }else{
//                 //include fractional item
//                 finalVal += (ratio[i][1] * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }
//         System.out.println("final value = " + finalVal);