import java.util.Scanner;
class DemoBMI{
public static void main(String[]args){
System.out.println("Enter the Height in terms of feet and Mass in terms of kg");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Mass: ");
System.out.println("Enter the Height: ");
int Mass = sc.nextInt();
int Height = sc.nextInt();
// Formula to calculate BMI: BMI = mass in kg/(height in meters)*2
// Convert feet to meters: (1feet = 0.3048meters)
//int Height = Height*0.3048;
double HeightMeters = Height * 0.3048;
double bmi = Mass / (Height * Height); // BMI formula

if (bmi < 18.5) {
System.out.println("The Person is Underweight: "+bmi);} 
else if (bmi >= 18.5 && bmi < 24.9) {
System.out.println("The Person is Normal: "+bmi);}
 else {
System.out.println("The Person is Overweight: "+bmi);}
}
}

