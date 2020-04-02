package studentdatabaseapplication;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradYear;
    private String studentID;
    private String courses=null;
    private int tuitionBalance=0;
    private static int costOfCourse=1000;
    static int Id=1000;
    public Student()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter student details: ");
        System.out.println("Firstname");
        this.firstname=ob.nextLine();
        System.out.println("Lastname");
        this.lastname=ob.nextLine();
        System.out.println("Select -\n1 - Fresher\n2 - 2nd Year\n3 - 3rd Year\n4 - Final year");
        this.gradYear=ob.nextInt();
        setStudentId();
    }
    private void setStudentId() {
        this.studentID = this.gradYear + "" + Id;
        Id++;
    }
    public void enroll()
    {
        while(true)
        {
            System.out.print("Enter course to enroll(Q to quit)");
            Scanner ob=new Scanner(System.in);
            String course=ob.nextLine();
            if(!course.equals("Q"))
            {
                if(this.courses==null)
                this.courses=course;
                else
                this.courses=this.courses+"\n"+course;
                this.tuitionBalance=this.tuitionBalance+costOfCourse;
            }
            else
            {
                break;
            }
        }
//        System.out.println("ENROLLED COURSES\n"+this.courses);
//        System.out.println("TUITION BALANCE: "+this.tuitionBalance);
    }
    public void viewBalance()
    {
        System.out.println("Balance Due-$"+this.tuitionBalance);
    }
    public void payTuition()
    {
        viewBalance();
        System.out.print("Enter your payment:$");
        Scanner ob=new Scanner(System.in);
        int pay=ob.nextInt();
        this.tuitionBalance=this.tuitionBalance-pay;
        System.out.println("Thanks.!Your transaction of $"+pay+" is successful");
    }
    public String showInfo()
    {
        return "Name: "+this.firstname+" "+this.lastname +
               "\nStudent ID: "+this.studentID +
               "\nGraduation Year: "+ this.gradYear +
               "\nCourses Enrolled to:\n"+ this.courses +
               "\nBalance Due: "+this.tuitionBalance;
    }


}
