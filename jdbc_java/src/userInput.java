import java.util.Scanner;

public class userInput {
     // creating the user input function

    public Detail inputStore(){
        // creating the scanner function
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter the frist_name");
        String frist_name = input.next();
        System.out.println("enter the last_name");
        String last_name = input.next() ;
        System.out.println("enter the mobile number");
        String mobile_number = input.next() ;
        System.out.println("enter the geder");
        System.out.println(" Press 1 : Male  and Press 2 : Femail") ;
        int gender_number = input.nextInt() ;
        String gender ;
        // now creating the condition
        if (gender_number == 1){
            gender = "Male" ;
        }else{
            gender = "Female" ;
        }




        Detail  student_detail = new Detail(frist_name , last_name  , mobile_number , gender , mobile_number) ;
    }

}
