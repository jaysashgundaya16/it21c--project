package Act1_OOP_Inheritance;

public class Parent {
    String name;
    
    Parent(String name){
        this.name = name;
    }
    
    void eat(){
        System.out.println(name + " Want to break free");
    }
    void sleep(){
        System.out.println(name + " I want to breaaak freeeee!");
    }
}