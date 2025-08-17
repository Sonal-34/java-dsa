import java.util.Scanner;

public class Vote_Eligibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = s.nextInt();
        checkEligibility(age);
        s.close();

    }

    static void checkEligibility(int age) {
        if(age >= 18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not eligible for vote");
        }
    }
    }

