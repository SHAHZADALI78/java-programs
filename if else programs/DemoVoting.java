import java.util.Scanner;
class DemoVoting{
public static void main(String[]args){
System.out.println("enter your age:");
System.out.println("enter your education:");
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
int education = sc.nextInt();
if(age>=18 && education>=8 ){
System.out.println("you are elegible to cast vote");}
else if(age<18 && education>=8 ){
System.out.println("you cannot cast a vote becase of under age");}
else{
System.out.println("please contact nadra office your NIC card is expired");
}
}
}



