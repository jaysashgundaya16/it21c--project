package polymorphism;

public class Polymorphism_JC extends Polymorphism_Student{   //child class
    Polymorphism_JC(String name){
        super(name);
    }
    @Override
    void coding(){
        System.out.println(name + " kay galabad ang ulo sa sigeg code");
    }    
    @Override
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
}