public class singleInheritance {
    void ac(){
        System.out.println("hello");
    }
    void bab(){
        System.out.println("Hello team");
    }
}
 class abc extends singleInheritance{
    void show(){
        System.out.println("hey");
    }
}
class ba{
    public static void main(String args[]){
        abc obj=new abc();
        obj.show();
        obj.ac();
        obj.bab();
    }
}
