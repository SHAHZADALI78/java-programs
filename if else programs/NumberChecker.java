import java.util.Scanner;
class NumberChecker{
public static void main (String [] args){
System.out.println("enter any number");
Scanner s = new Scanner(System.in);
int num=s.nextInt();
if(num>0){
System.out.println("THE NUMBER IS POSITIVE:"+num);
}
else if(num<0){
System.out.println("THE NUMBER IS NEGATIVE INTEGER:"+num);
}
else{
System.out.println("ZERO");
}
}
}


