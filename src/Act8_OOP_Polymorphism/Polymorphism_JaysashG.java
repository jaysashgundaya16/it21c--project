package polymorphism;

public class Polymorphism_Jaysash extends Polymorphism_Student{ //child class
    Polymorphism_Jaysash(String name){
        super(name);
    }
    @Override
    void sleep(){
        System.out.println(name + " kay gatulog nga gasiga ang mata");
    }
    @Override
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
    
}
