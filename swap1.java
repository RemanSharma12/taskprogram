import java.util.Scanner;

public class swap1 {
    public static void main(String args[]){
        int a,b,temp;
        System.out.println("enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping"+a+" "+b);
    }
}
