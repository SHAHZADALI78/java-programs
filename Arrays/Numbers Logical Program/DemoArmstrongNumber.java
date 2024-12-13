import java. util.Scanner;
class DemoArmstrongNumber{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number: ");
int num = sc.nextInt();
int org_num = num;
int sum = 0;
int numdigits = 0;

int number = num;
while(number>0){
number /= 10;
numdigits++;
}

number = num;
while(number>0){
int digit = number%10;
int power = 1;
for(int i = 1; i<=numdigits; i++){
power *= digit;
}

sum += power;
number /= 10;
}

if(sum == org_num){
System.out.println("The Number "+ org_num+ " Is An Armstrong Number");
}
else{
System.out.println("The Number " +org_num+" Is Not An Armstrong Number");
}
}
}