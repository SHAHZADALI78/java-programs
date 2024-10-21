import java.util.Scanner;
class GradeCalculator{
public static void main(String[]args){
System.out.println("Enter the Marks:");
Scanner sc = new Scanner(System.in);
int marks = sc.nextInt();
if(marks>=90 && marks<=100){
System.out.println(" Your Grade Is: A-1");}
else if(marks>=80 && marks<=90){
System.out.println(" Your Grade Is: A");}
else if(marks>=70 && marks<=80){
System.out.println(" Your Grade Is: B");
}

else if(marks>=50 && marks<=65){
System.out.println(" Your Grade Is: C");
}
else{
System.out.println(" Your Are Fail");
}
}
}



