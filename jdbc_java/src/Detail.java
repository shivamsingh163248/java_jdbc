import java.util.Scanner;

public class Detail {

    // creating the input function of the name
    private String fist_name;
    private String last_name;
    private String mobile_number;

    private String gender;
    private String Mobile_number;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Detail(){

    }

    public Detail(String fist_name, String last_name, String mobile_number, String gender, String mobile_number1, String email) {
        this.fist_name = fist_name;
        this.last_name = last_name;
        this.mobile_number = mobile_number;
        this.gender = gender;
        Mobile_number = mobile_number1;
        this.email = email;
    }



    public String getFist_name() {
        return fist_name;
    }

    public void setFist_name(String fist_name) {
        this.fist_name = fist_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGetMobile_number() {
        return Mobile_number;
    }

    public void setGetMobile_number(String Mobile_number) {
        this.Mobile_number = Mobile_number;
    }


    public void takeinput() {
        // creating the scanner function
        Scanner input = new Scanner(System.in);
        System.out.println("enter the frist_name");
        String frist_name = input.next();
        setFist_name(frist_name);
        System.out.println("enter the last_name");
        String last_name = input.next();
        setLast_name(last_name);
        System.out.println("enter the mobile number");
        String mobile_number = input.next();
        setMobile_number(mobile_number);
        System.out.println("enter the email");
        String email = input.next();
        setEmail(email);
        System.out.println("enter the geder");
        System.out.println(" Press 1 : Male  and Press 2 : Femail");
        int gender_number = input.nextInt();
        String gender;
        // now creating the condition
        if (gender_number == 1) {
            gender = "Male";
        } else {
            gender = "Female";
        }
  setGender(gender);






    }

    // creating the function for the update the information usiing the switch
    public void updateInformation(){

        System.out.println("enter the number for the update information for the followig number down ");
        System.out.println(" PRESS 1 : UPDATE FRIST NAME");
        System.out.println("PRESS 2 : UPDATE LAST NAME ");
        System.out.println("PRESS 3 : UPDATE GENDER");
        System.out.println("PRESS 4 : UPDATE EMAIL");
        System.out.println("PRESS 5 : UPDATE MOBILE NUMBER");
        Scanner input = new Scanner(System.in) ;
        int number = input.nextInt() ;
        // NOW CREATING THE Switch care

        switch ()
    }

}
