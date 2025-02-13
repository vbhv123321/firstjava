package oops;

public class Student{
    
    //data:data members:instance variable
    int id;
    String name;
    String city;

    //creating a constructor
    public Student(){
        System.out.println("creating a constructor");
    }
    public Student(int s, String n, String c){
        this.id= s ;
        this.name=n;
        this.city= c;
        System.out.println("creating a paramterized object");
    }

    //Behaviour : member methods : methods(functions)
    public void study(){
        System.out.println( name + " is studying");
    }

    public void showfulldetails(){
        System.out.println("id:" +id);
        System.out.println("name:"+name);
        System.out.println("city:"+ city);
    }
}