package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Farah");
        Polymorphism_Ariel my_Ariel = new Polymorphism_Jaysash ("Jaysash");
        Polymorphism_Zyrel my_Zyrel = new Polymorphism_JC ("JC");
        
        my_student.eat();
        my_Jaysash.sleep();
        my_JC.coding();
        
        System.out.println("---------------------------------------");
        
        my_student.Time();
        my_Jaysash.studentPogi();
        my_JC.studentSweet();
    }
}
