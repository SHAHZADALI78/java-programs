import java.util.Scanner;
class DemoTriangle{
public static void main(String[]args){
System.out.println("The Triangle is:");
System.out.println("Enter the Values Of Triangle:");
Scanner sc = new Scanner(System.in);
int sideA = sc.nextInt();
int sideB = sc.nextInt();
int sideC = sc.nextInt();
if(sideA==sideB && sideA==sideC){
System.out.println("Equalateral");}
else if(sideA==sideB && sideB!=sideC){
System.out.println(" ISOLATERAL");}
else{
System.out.println(" SCALENE");}
}
}
