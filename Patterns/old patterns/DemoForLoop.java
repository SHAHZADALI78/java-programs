import java.util.Scanner;

class DemoForLoop {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int num = 1; num <= n; num++) {
            sum += num; 
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
