import java.util.*;
public class Question_1 {

    public static void main(String args[]){
        int n=10;
        for(int i=0; i<n; i++){

            // for I
            for (int j=0; j<n; j++){
                if(j==(n-1)/2 || i==0 && j<n-1 || i==n-1 && j<n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // for N
            for (int j=0; j<n; j++){
                if(j==0 || i==j || j==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // for E
            for (int j=0; j<n; j++){
                if((j==1 && i!=0 && i!=n-1)
                        || (i==0 && j>1)
                        || (i>=(n-1)  && j>1)
                        || (i==((n-1)/2) && j>0 ) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //for U
            for (int j=0; j<n; j++){
                if(((j==1 || j==n-1) && i!=n-1)
                        || (i==n-1 && j>1 && j<n-1))
                        //(j==1 || j==n-1) && i<n-1 || i==n-1 && j%2==0
                    //(j==1 && i!=n-1 ) || (j==(n-1) && i!=n-1) || (i==(n-1) && j>0 && j!=n-1 ))
                    {
                        System.out.print("*");
                    }
                else{
                    System.out.print(" ");
                }
            }
            //for R
            for (int j=0; j<n; j++){
                if(j==1 && i!=0
                        || (i==0 && j>1 && j<n-1 && i<n-1)
                        || (j==(n-1) && i>0 &&  i<(n-1)/2)
                        || (i==((n-1)/2) && j>0 && j<n-1)
                       // || (i-j==2 && i>5)
                        || (i-j==(((n-1)/2)-2) && j>0)

                       /* || (j==4 && i==6)
                        || (j==5 && i==7)
                        || (j==6 && i==8)
                        || (j==7 && i==9)
                        || (j==8 && i==10)*/

                   /*     || (j==4 && i==n-5)
                        || (j==5 && i==n-4)
                        || (j==6 && i==n-3)
                        || (j==7 && i==n-2)
                        || (j==8 && i==n-1)*/
                ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //for O
            for (int j=0; j<n; j++){
                if(j==1 && i!=0 && i<n-1
                        || (i==0 && j>1 && j<n-1)

                        ||   (j==n-1 &&i>0 &&i<n-1)
                        || (i==n-1 && j<n-1 && j>1)

                ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // for N
            for (int j=0; j<n; j++){
                if(j==1  || (i==j && i!=0) || j==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }


            System.out.println();
        }
    }
}
