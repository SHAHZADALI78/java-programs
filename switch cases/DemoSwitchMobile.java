import java.util.Scanner;
class DemoSwitchMobile{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Company Name:");
String name = sc.nextLine();
switch(name){
case "vivo":
System.out.println("Vivo is famous for consistentency in best mobile production:");
break; 
case "oppo":
System.out.println("Oppo is one of the best mobile production Companies:");
break;
case "samsung":
System.out.println("Samsung is number one for its Best Camera Result:");
break;
case "iphone":
System.out.println("IPhone is at the top of all Mobile Companies and Successful Company of All The Times :");
break;
default:
System.out.println("Name of Company is incorrect:");
}
}
}