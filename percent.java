import java.util.*;
public class percent {

	public static void main(String[] args) {
		// now we are the heare the calulating the parcentage the of the number 
		// now we are the calculating the parcentage the of the any number and also the calcuating the 
		// cgpat to parcentage and parcentage to cgpaf
		// fristly we are the takin the input value 
		float value1 , value2 , vlaue3 ;
		Scanner value = new Scanner(System.in);
		System.out.println("now we are the enter the obtain vlaue");
		value1 = value.nextFloat();
		System.out.println("enter the over all vlaue of the pasing mark");
		value2 = value.nextFloat();
		vlaue3 = (value1/value2)*100;
		System.out.println("your parcentage is the"+vlaue3+"%");
		value.close();
    }
}