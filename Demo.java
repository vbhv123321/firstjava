package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void find(List<Student> students){
        Scanner scc = new Scanner(System.in);
        boolean yes=true;
        while(yes){
            System.out.println("Student you want to display");
            int search_id=scc.nextInt();
             boolean found = false;
             for(Student s:students){
                if(s.id==search_id){
                System.out.println("student found");
                s.showfulldetails();
                found =true;
                break;
            }
         }
           if(!found){
          System.out.println("not found");
          }
          scc.nextLine();
          clearScreen();
          System.out.println("again:?");
          yes= scc.next().equalsIgnoreCase("yes");
          scc.close();
        }
        
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        for(int j=0;j<2;j++){

            
            System.out.println("Enter student Id");
            int i = sc.nextInt();
            clearScreen();
            sc.nextLine();

            System.out.println("Enter student Name ");
            String n = sc.nextLine();
            clearScreen();
            
            System.out.println("Enter student City");
            String c = sc.nextLine();
            clearScreen();

            Student student = new Student(i,n,c);
            students.add(student);
        }
        
        
        find(students);
       sc.close();
    }
}