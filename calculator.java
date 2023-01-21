import java.util.*;
public class calculator {


public static void main(String[] args) {
    
    // now are the make the calculator
    // now we are the using the switch statement 
    System.out.println("enter the value according to your oparation ");
    System.out.println("1:-add");
    System.out.println("2:- substracts");
    System.out.println("3:- divide");
    System.out.println("4:- multipy");
    Scanner input =  new Scanner(System.in);
    int a = input.nextInt();
    
    switch (a) {
        case 1:
            System.out.println("you are the selected add calulation :-"+a);
            System.out.println("please inter the vlaue frist");
            int c = input.nextInt();
            System.out.println("please enter the value second");
            int d = input.nextInt();
            int f = c+d;
            System.out.println("your output is :-"+f);
            break;
        case 2:
            System.out.println("you are the selected substraction :-"+a);
            System.out.println("plsase enter inter the vlaue frist");
            c = input.nextInt();
            System.out.println("please enter th value second");
            d = input.nextInt();
            f = c-d;
            System.out.println("your output is : "+f);
            break;
        case 3:
            System.out.println("you are the seleted divide :- "+a);
            System.out.println("please enter the frist value ");
            c = input.nextInt();
            System.out.println("please enter th value second");
            d = input.nextInt();
            f = c/d;
            System.out.println("your output is : "+f);
            break;
        
        case 4 :
            System.out.println("you are the selected the multipliccation : - "+a);
            System.out.println("please enter the frist value ");
            c = input.nextInt();
            System.out.println("please enter th value second");
            d = input.nextInt();
            f = c*d;
            System.out.println("your output is : "+f);
            break;
        

        default:
        System.out.println("you are the not any specific input value");

            break;
    }

  do {
    System.out.println("fristly we done the do program then we chack the condaton:-"+a);
    a++;
    System.out.println("again chack the condation value"+a);
    

  } while (a > 4 );
    
input.close();
}  


}
