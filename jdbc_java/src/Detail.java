public class Detail {

    // creating the input function of the name
   private  String fist_name ;
   private  String last_name ;
   private  String mobile_number ;

   private String gender ;
   private  String Mobile_number ;
   private  String email ;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Detail(String fist_name, String last_name, String mobile_number, String gender, String mobile_number1, String email) {
        this.fist_name = fist_name;
        this.last_name = last_name;
        this.mobile_number = mobile_number;
        this.gender = gender;
        Mobile_number = mobile_number1;
        this.email = email;
    }

    public Detail(String fist_name, String last_name, String mobile_number, String gender, String Mobile_number) {
        this.fist_name = fist_name;
        this.last_name = last_name;
        this.mobile_number = mobile_number;
        this.gender = gender;
        this.Mobile_number = Mobile_number;
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
}
