import static java.lang.System.*;
import java.util.*;
/*
class First{
    public static void main(String[] args) { // it will take as an arguement
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int x = 10;
        x-=-1;
        System.out.println(x);
    }
}*/

//Question: a student whether falling into category in a ,b,c,d hwere a means the student is getting marks 80 or above, cat b is 70 to 79.9, cat c is 60 to 69, cat d is less than 60
// print the student category as well as his name ,roll no,branch 
/*
class Student {
    String name;
    int roll_no;
    static String branch = "CSE";
    char grade = 'F';
    int total;

    void get_input() {
        Scanner obj = new Scanner(System.in);
        out.println("Enter the name: ");
        name = obj.next();
        out.println("Enter the Roll no: ");
        roll_no = obj.nextInt();
        out.println("Enter the marks: ");
        total = obj.nextInt();
    }

    char grade_calc(int total) {
        if (total >= 90) {
            grade = 'A';
        } else if (total >= 80 && total <= 89) {
            grade = 'B';
        } else if (total >= 70 && total <= 79) {
            grade = 'C';
        } else if (total >= 60 && total <= 69) {
            grade = 'D';
        }
        return grade;
    }

    void display() {
        out.println(
                "Name: " + name + "\n" + "Roll No: " + roll_no + "\n" + "Branch: " + branch + "\n" + "Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.get_input();
        s1.grade_calc(s1.total);
        s1.display();
        //
         // s1.name = "Bhupesh"; s1.roll_no = 24; grade = s1.grade_calc(78);
         // out.print("grade:" + grade + "\t" + "name:" + s1.name + "\t" + "roll_no:" +
         // s1.roll_no + "\t" + "section:" + branch);
         //

    }
}
*/
