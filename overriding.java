class hello {
    public void eat() {
        System.out.println("I can eat");
    }
    public void display() {
        System.out.println("HELLO");
    }
    public void show() {
        System.out.println("HELLO");
    }
}
class hii extends hello {

    @Override
    public void eat() {
        System.out.println("I eat food");
    }

    public void display() {
        System.out.println("hey");
    }
}

class Main {
    public static void main(String[] args) {
        hii sc = new hii();
        sc.eat();
        sc.display();
        sc.show();
    }
}
