import java.util.Scanner;
class FactorsA{
public static void main(String [] args){
System.out.println("Enter The Number: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int factors = 0;
int i = 1;
while(i<=num){ 
i++;
if(num%i==0){
factors++;}}
System.out.println("Total Factors Are: " + factors);
}
}
 