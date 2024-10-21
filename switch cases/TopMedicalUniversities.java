import java.util.Scanner;
class TopMedicalUniversities{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Number:");
int number = sc.nextInt();
switch(number){
case 1:
System.out.println("The Top Medical University in Pakistan is: ");
System.out.println("University of Health Sciences Lahore, Located in Punjab Province!");
break;
case 2:
System.out.println("The Second Top Medical University in Pakistan is: ");
System.out.println("Dow University of Health Sciences Karachi, Located in Sindh Province!");
break;
case 3:
System.out.println("The Third Top Medical University in Pakistan is: ");
System.out.println("King Edward Medical University Lahore, Located in Punjab Province!");
break;
case 4:
System.out.println("The Forth Top Medical University in Pakistan is: ");
System.out.println("Khyber Medical University Peshawar, Located in KPK!");
break;
case 5:
System.out.println("The Fifth Top Medical University in Pakistan is: ");
System.out.println("Liaquat University of Medical and Health Sciences Jamshoro, Located in Sindh Province!");
break;
default:
System.out.println("You Have Choosen Wrong Number!");
}
}
}
