package oops;

public class Demo {
    public static void main(String[] args) {
        //object of the class student
        Student st1;
        st1 = new Student();
        st1.stu_id=1;
        st1.name="vaibhav";
        st1.city="mumbai";
        st1.study();
        st1.showfulldetails();
    }
}
