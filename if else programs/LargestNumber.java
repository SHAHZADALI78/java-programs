import java.util.Scanner;
class LargestNumber{
public static void main(String []args){
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();
if(num1>num2 && num3<num1){
System.out.println("The Largest Number Is num1 ="+num1);
}
else if(num1<num2 && num2>num3){
System.out.println("The Largest Number Is num2 ="+num2);
}
else{
System.out.println("The Largest Number Is num3 ="+num3);
}
}
}