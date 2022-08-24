public class multilevelInheritance {
    void ab(){
        System.out.println("hindi");
    }
}
class b extends multilevelInheritance{
    void bc(){
        System.out.println("English");
    }
    void cd(){
        System.out.println("maths");
    }
}
class c extends b{
    void de(){
        System.out.println("physics");
    }
}
class d{
    public static void main(String args[]){
        c obj=new c();
        obj.de();
        obj.bc();
        obj.ab();
        obj.cd();
    }
}