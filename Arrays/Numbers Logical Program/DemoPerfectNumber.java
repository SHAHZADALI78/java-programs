import java.util.Scanner;
class DemoPerfectNumber{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number: ");
int num = sc.nextInt();
int sum = 0;
for(int i=1; i<num ; i++){
if(num%i == 0){
sum = sum + i;
}
}
if(sum == num){
System.out.println("The Number "+num+ " Is A Perfect Number");
}
else{
System.out.println("The Number " +num+" Is Not A Perfect Number");
}
}
}


