package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Farah");
        Polymorphism_Jaysash my_Jaysash = new Polymorphism_Jaysash ("Jaysash");
        Polymorphism_JC my_JC = new Polymorphism_JC ("JC");
        
        my_student.eat();
        my_Jaysash.sleep();
        my_JC.coding();
        
        System.out.println("---------------------------------------");
        
        my_student.Time();
        my_Jaysash.studentPogi();
        my_JC.studentSweet();
    }
}
