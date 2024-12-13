import java.util.Scanner;
class PalindromeNumber{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter A Number: ");
int num = sc.nextInt();
int org_num = num;
int rev_num = 0;
while(num != 0){
int reminder = num%10;
rev_num = rev_num*10 + reminder;
num = num/10;
}
System.out.println("The Reversed Number Is: " +rev_num); 
if(org_num == rev_num){
System.out.println("The Number " +org_num+" Is Palindrome Number");
}
else {
System.out.println("The Number " +org_num+" Is Not Palindrome Number");
}
}
}