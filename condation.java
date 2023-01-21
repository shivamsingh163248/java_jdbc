import java.util.*;
public class condation {
     /**
     * @param args
     */
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
    
       

        if (g == 1) {
            System.out.println("this is the condation the of the 1");
        } else {
            if (h == 1) {
                System.out.println("this is the b value are the 1");
                
            } else {
                System.out.println("this is the b not value of the 1");
            }
        }

         int inp = age.nextInt();
         int jvm = age.nextInt();
         int imp = age.nextInt();
         int jsm = age.nextInt(); 
        if ((inp == jvm) && (imp > jsm)) {
            System.out.println("this is the equall number");
        } else {
            System.out.println("this is the not equall number");
        }
        if (imp == inp) {
            System.out.println("there are two number aare the match");
        } else {
           System.out.println("therre are the not same number are the match");
        }
        if (jvm == jsm) {
            System.out.println("there is the same number of two value");
        } else {
            System.out.println("there is two number are the not equall");
        }
        int dk = 6 , rt = 7  , sz = 4 , mb = 6;
        if (dk >= rt ) {
           System.out.println("two number are the same "); 
           if (sz == mb) {
            System.out.println("this is the also two equall number");
           } else {
            System.out.println("this is not equall number");
           }
        } else {
            System.out.println("this is not a euall number");
        }

        age.close();
    
    

    }
}
