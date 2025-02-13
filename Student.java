package oops;

public class Student{
    
    //data:data members:instance variable
    int stu_id;
    String name;
    String city;

    //Behaviour : member methods : methods(functions)
    public void study(){
        System.out.println( name + " is studying");
    }

    public void showfulldetails(){
        System.out.println("id:" +stu_id);
        System.out.println("name:"+name);
        System.out.println("city:"+ city);
    }
}