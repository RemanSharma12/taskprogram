import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        int x,y,sum;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value of x");
        x=obj.nextInt();
        System.out.print("Enter the value of y");
        y=obj.nextInt();
        sum=sum(x,y);
        System.out.print("sum of two numbers" + sum);
    }
    public static int sum(int x,int y){
        int sum=x+y;
        return sum;
    }
}
