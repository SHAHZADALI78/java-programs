class FibonacciSeriesA{
public static void main(String [] args){
int number = 20;
int num1 = 0;
int num2 = 1;
int i = 1; 
while(i<=number){ 
i++;
System.out.print(num1+"   ");
int nextnum = num1 + num2;
num1 = num2;
num2 = nextnum;
}
}
}