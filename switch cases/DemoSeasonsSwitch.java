import java.util.Scanner;
class DemoSeasonsSwitch{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Season Name: ");
String season = sc.nextLine();
switch (season){
case "winter":
System.out.println("Winter Season Runs From December To February!");
break;
case "spring":
System.out.println("Spring Season Runs From March To May!");
break;
case "summer":
System.out.println("Summer Season Runs From June To August!");
break;
case "autumn":
System.out.println("Autumn Season Runs From September To November!");
break;
default:
System.out.println("Insert Correct Season Name!");
}
}
}
