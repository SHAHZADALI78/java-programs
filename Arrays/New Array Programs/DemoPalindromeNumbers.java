class DemoPalindromeNumbers{
public static void main(String[] args){
int myArray[] = {121, 115, 131, 211, 313, 351, 404, 51};
for (int i = 0; i < myArray.length; i++){
int rev = 0; 
int num = myArray[i]; 
int orgn_num = num;        
while (num != 0){
rev = rev * 10 + num % 10;
num = num / 10;
}
if (orgn_num == rev){
System.out.println("The Number " + orgn_num + " is a Palindrome.");
} 
}
}
}
