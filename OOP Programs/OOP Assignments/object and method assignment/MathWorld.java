import java.util.Scanner;
class MathWorld{
                                                 //   METHOD FOR CHECK EVEN ODD PROGRAM 
 


public void checkEvenOdd(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number You Want To Check For Even Odd: : ");
int num = sc.nextInt();
if(num % 2 == 0){
System.out.print(num+ " is Even Number");
}
else{
System.out.print(num+ " is Odd Number");
}
System.out.println(" ");
}

                                                   //   METHOD FOR GENERATING TABLE


public void generateTable(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number To Generate Table : ");
int num = sc.nextInt();
for(int i = 1; i<= 10; i++){
System.out.println(num + " * " + i + " = " + (num*i));
}
System.out.println(" ");
}

                                               //   METHOD FOR CALULATE FACTORIAL


public void calculateFactorial(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number To Calculate Factorial : ");
int num = sc.nextInt();
int factorial = 1;
for (int i =1; i<= num; i++){
factorial = factorial*i;
}
System.out.print(factorial+ " ");
System.out.println(" ");
}

                                               //   METHOD FOR REVERSE A NUMBER


public void reverseNumber(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number You Want To Reverse : ");
int num = sc.nextInt();
int reverse = 0;
while(num != 0){
int reminder = num % 10;
reverse = reverse*10 + reminder;
num = num/10;
}
System.out.println("The Reverse Number Is: "+reverse);
System.out.println(" ");
}

                                              //   METHOD TO CHECK PERFECT NUMBER


public void checkPerfectNumber(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number To Check It PerfectNumber:");
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
System.out.println(" ");
}

                                               //  METHOD TO CHECK ARMSTRONG NUMBER


public void checkArmstrong(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number To Check It Armstrong: ");
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
System.out.println("The Number "+ org_num+ " Is An Amstrong Number");
}
else{
System.out.println("The Number " +org_num+" Is Not An Amstrong Number");
}
System.out.println(" ");
}

                                               //  METHOD TO PRINT ALL FACTORS OF A NUMBER


public void printFactors(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number You Want To Calculate Factors: ");
int num = sc.nextInt();
System.out.print("The Factors Of A Number: ");
for(int i =1 ; i<=num; i++){
if(num%i == 0){
System.out.print(i+ " ");
}
}
System.out.println(" ");
}
                                                // METHOD TO CHECK PALINDROME NUMBER


public void checkPalindrome(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number To CheckPalindrome:  ");
int num = sc.nextInt();
int org_num = num;
int rev_num = 0;
while(num != 0){
int reminder = num%10;
rev_num = rev_num*10 + reminder;
num = num/10;
} 
if(org_num == rev_num){
System.out.println("The Number  " +org_num+"  Is Palindrome Number");
}
else {
System.out.println("The Number " +org_num+" Is Not Palindrome Number");
}
}


                                                 // METHOD TO PRINT DIAMOND PATTERN


public void demoDiamondPattern(){
Scanner sc = new Scanner (System.in);
System.out.print("Enter A number Till You Want Diamond Pattern : ");
int num  = sc.nextInt();
for(int i = 1; i<= num; i++){
for(int j = num; j >= i; j--){
System.out.print(" ");
}
for(int k = 1; k<= i ; k++){
System.out.print(" *");
}
System.out.println("");
}
}


                                                 //METHOD TO CALCULATE SQUARE OF A NUMBER


public void calculateSquare(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A number You Want Square : ");
int num = sc.nextInt();
int square = (num)*(num);
System.out.print("Square Of " + num +" Is:  " + square);
System.out.println(" ");
}


                                              // METHOD TO CALLTOMENU METHOD

public void callToMenuMethod(){
System.out.println("              Welcome To MathWord      ");
System.out.println("");
System.out.println("1 checkEvenOdd");
System.out.println("2 generateTable");
System.out.println("3 calculateFactorial");
System.out.println("4 reverseNumber");
System.out.println("5 checkPerfectNumber");
System.out.println("6 checkArmstrong");
System.out.println("7 printFactors");
System.out.println("8 checkPalindrome");
System.out.println("9 demoDiamondPattern");
System.out.println("10 calculateSquare");
System.out.println(" ");                 
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Choice: ");
int Choice = sc.nextInt();
if(Choice == 1){
checkEvenOdd();
}                                          
else if(Choice == 2){
generateTable();
} 
else if(Choice == 3){
calculateFactorial();
} 
else if(Choice == 4){
reverseNumber();
} 
else if(Choice == 5){
checkPerfectNumber();
} 
else if(Choice == 6){
checkArmstrong();

} 
else if(Choice == 7){
printFactors();
} 
else if(Choice == 8){
checkPalindrome();
} 
else if(Choice == 9){
demoDiamondPattern();
}
                               
else if(Choice == 10){
calculateSquare();
} 
System.out.println("");

System.out.print(" Would You Like To Continue Program?(yes/no): ");
String choice = sc.next();
if(choice.equals("yes")){
callToMenuMethod();
}
else{
System.out.println("You Have Done Your Job Very Well");  
}
}

                                           // MAIN METHOD

public static void main(String []args){
MathWorld mathworld = new MathWorld();
mathworld.callToMenuMethod();
}
}
