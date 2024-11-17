import java.util.Scanner;
class Factors{
public static void main(String [] args){
System.out.println("Enter The Number: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int factors = 0;
for (int i = 1; i<=num; i++){
if(num%i==0){
factors++;}}
System.out.println("Total Factors Are: " + factors);
}
} 