package studentdatabaseapplication;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Total number of Students whose data is to be feeded:");
        Scanner ob=new Scanner(System.in);
        int numberOfStudents=ob.nextInt();
        Student students[]=new Student[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for(int i=0;i<numberOfStudents;i++)
        {
            System.out.println(students[i].showInfo());
            System.out.println();
        }
    }
}
