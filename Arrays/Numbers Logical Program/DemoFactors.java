import java.util.Scanner;
class DemoFactors{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number: ");
int num = sc.nextInt();
System.out.print("The Factors Of A Number: ");
for(int i =1 ; i<=num; i++){
if(num%i == 0){
System.out.print(i+ " ");
}
}
}
}