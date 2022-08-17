public class Prime {
    public static void main(String args[]) {
        int i, num = 4, count = 0;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        }
    }

