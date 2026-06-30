package DSA.Pattern;
public class pattern {

    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
      for(int i=1; i<=totRows; i++){
            //inner - columns
            for(int j=1; j<=totCols; j++){
                //cell - (i,j)
                if(i== 1 || i == totRows || j==1 || j == totCols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//------------------------------------------------------------------
    public static void inverted_rotated_pyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
//------------------------------------------------------------------
    public static void floyds_triangle(int n){
        //outer
        int counter = 1;
        for(int i=1; i<=n; i++){
            //inner - how many times will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        //hollow_rectangle(4,5);
        //inverted_rotated_pyramid(4);
        //floyds_triangle(n);
    }

}