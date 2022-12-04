/*import java.util.*;
public class Question_2 {

public static void main(String args[]){
    int n=5;
    for(int i=1; i<n; i++){
        for (int j=1; j<n; j++){
            System.out.print(i);
        }
        System.out.println();
    }
}

}*/

public class Question_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                if((i==0 && j<n-1)|| j==0  ||(i==n-1 && j<n-1) || (j==n-1 &&i>0 &&i<n-1) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}

