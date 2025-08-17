import java.util.Scanner;

public class Display_Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = s.nextInt();
        System.out.println("Grade is: " + displayGrades(marks));
        s.close();

    }
    static String displayGrades(int marks) {
        if(marks >=91 && marks <= 100)
        {
            return "AA";
        }
        else if (marks >=81 && marks <= 90) {
            return "AB";
        }
        else if (marks >=71 && marks <=80) {
            return "BB";
        }
        else if (marks >=61 && marks <=70) {
            return "BC";
        }
        else if (marks >=51 && marks <=60) {
            return "CD";
        }
        else if (marks >=41 && marks <=50) {
            return "DD";
        }
        else if (marks <=40 && marks >=0) {
            return "Fail";
        }
        else
        {
            return "Invalid Marks";
        }
    } 
}
