import java.util.Scanner;

public class Bank{
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

    //This is the Sumbject Grade
	System.out.print("Enter Your Math grade: ");
	float Math = sc.nextFloat();

	System.out.print("Enter Your Filipino grade: ");
	float Filipino = sc.nextFloat();

	System.out.print("Enter Your HCI grade: ");
	float Hci = sc.nextFloat();

	System.out.print("Enter Your Programing grade: ");
	float Programing = sc.nextFloat();

	System.out.print("");

	float result  = (Math + Filipino + Hci + Programing) / 4;

	System.out.println("Average: " + result);

	if(result > 100){
	System.out.println("Invalid Grade");
	}
	else if(result > 95 ){
	System.out.println("Very Good Grade");
	}
	else if(result > 90){
    System.out.println("good job");
    }
	else if(result > 85){
    System.out.println("well done");
    }
    else if(result > 80){
    System.out.println("not bad");
    }
    else if(result > 75){
    System.out.println("almose");
    }else{
		System.out.println("ByeBye");
		}

    }
}

