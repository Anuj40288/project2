//import java.util.*;

//public class thirdclass{
    //public static void main(String[] absa){
       // int num = 5,factorial = 1;
       // for(int i=1; i<=num; ++i){
            //factorial *=i;

        //}
       // System.out.println("Factorial of "+ num + "is;" +factorial);
    //}
//}

import java.util.*;

public class thirdclass {
    public static void main(String[] args){
        int rows = 5;
        for (int i = 1; i <= rows; ++i){
            for (int j = 1; j <= i; ++j){
                System.out.println("*");
            }
            System.out.println(); 
        }
    }
}