// import java.util.*;

// public class conditions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the age:- ");
//         int age = sc.nextInt();
        
        
//         if(age > 18){
//             System.out.println("ADULT");
//         }
//         else {
//             System.out.println("NOT ADULT");
            
//         }
//     }

// }


// public class conditions{
//     public static void main(String[] args){
//         for(int i=0; i < 11; i++){
//             System.out.print(i+"\n");
//         } 
//     }

    
    
// }

import java.util.Scanner;

public class conditions{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.print("enter your row size in matrix :- ");
        int n1=scn.nextInt();
        System.out.print("Enter your column size in matrix :- ");
        int n2 = scn.nextInt();

        int[][] mat=new int[n1][n2];

        for(int i= 0; i< n1 ; i++){
            System.out.println("row no:- "+(i+1));
            for(int j= 0; j < n2; j++){
                System.out.print("enter column value:- ");
                mat[i][j]=scn.nextInt();
            }
        }

        for(int i= 0; i< n1 ; i++){
            for(int j= 0; j < n2; j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}