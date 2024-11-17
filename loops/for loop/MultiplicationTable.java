import java.util.Scanner;
class MultiplicationTable{
public static void main(String [] args){
System.out.println("Enter A Number For Multiplication Table:");
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
 System.out.println("Multiplication Table for " + number );
for(int num=1; num<=10; num++){
System.out.println(number + "*" + num + "=" + (number*num));
}
}
}
