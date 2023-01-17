// import java.util.Scanner;

// public class Demo{
//      public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         int n= scn.nextInt();
//         int a=0;
//         int b=1;
//         for(int i=1;i<=n;i++){
//                 System.out.println(a);
//                 int c=a+b;
//                 a=b;
//                 b=c;
//         }
//     }
// }


//Count no digits
import java.util.*;
public class Demo{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int count=0;
            while(n!=0){
                n=n/10;
                count++;
            }
         System.out.print(count);
        
    }
}