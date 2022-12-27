import java.util.*;
public class condation {
     public static void main(String[] args) {

      Scanner age = new Scanner(System.in);
      
        System.out.println("enter the your age");
        int a = age.nextInt();
       
        if (a >= 18) {
            System.out.println("you are the eligiable for the voting in indian contitution ");
        } else {
            System.out.println("you are the not eligiable for the voting ");
        }

        
    

    
         System.out.println("this is the name of my user name");
         System.out.println("now we are take the input from the user");
         System.out.println("here we useing the acanner vale "); // this is thake part of the scanner

         
         System.out.println("now we are thake the formula of the (a+b) wholw square");
         System.out.println("now we are the give the value of the a ");
         int g = age.nextInt();
         System.out.println("now we are the given input value of the b ");
        int h = age.nextInt();
        int k = g*g;
        int m = h*h;
        int l = 2*g*h;
        System.out.println(k+m+l);
    
    
        age.close();

        if (g == 1) {
            System.out.println("this is the condation the of the 1");
        } else {
            if (h == 1) {
                System.out.println("this is the b value are the 1");
                
            } else {
                System.out.println("this is the b not value of the 1");
            }
        }
    }
}
