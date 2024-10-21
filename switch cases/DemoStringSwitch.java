import java.util.Scanner;
class DemoStringSwitch {
public static void main(String [] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter The Day:");
String day = s.nextLine();
switch (day){
case "monday":
System.out.println("It's Start of Week and today is your Database class at 9:00! ");
break;
case "tuesday":
System.out.println("It's second day of week and today is your Lab of Database at 9:30! ");
break;
case "wednesday":
System.out.println("It's third of Week and today is your Software Design class at 2:30! ");
break;
case "thursday":
System.out.println("It's mid of Week and today is your Linear Algebra class at 2:00! ");
break;
case "friday":
System.out.println("It's half day of Week and today is your Discrete Structures class at 12:30! ");
break;
case "saturday":
System.out.println("It's weekend and today is Holiday! ");
break;
default:
System.out.println("Choose The Correct Day! ");
}
}
}

