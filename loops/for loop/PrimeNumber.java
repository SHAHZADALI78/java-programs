import java.util.Scanner;
class PrimeNumber {
public static void main(String[] args){
System.out.println("Enter The Number : ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int factors = 0;
for(int i=1; i<=num; i++){
if(num%i==0){
factors++;
}}
if(factors==2){
System.out.println("The Number " + num + " Is Prime Number ");}
else{
System.out.println("The Number " + num + " Is Not A Prime Number ");}
}
}





