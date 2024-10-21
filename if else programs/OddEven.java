import java.util.Scanner;
class OddEven{
public static void main(String[]args){
int num;
System.out.println("enter any number:");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
if(num%2==0){
System.out.println("The Number Is Even");
}
else{
System.out.println("The Number Is Odd");
}
}
}