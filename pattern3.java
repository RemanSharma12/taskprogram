public class pattern3 {
    public static void main(String args[]) {
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i * 2; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2*i-2; k < 2*5-2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
