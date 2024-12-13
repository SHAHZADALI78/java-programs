class DemoMissingNumber{
public static void main(String [] args){
int myArray1 [] = {2, 4, 6, 8, 10};
int myArray2 [] = {2, 4, 6, 10};
int sum = 0;
for(int i =0; i<myArray1.length; i++){
sum = sum + myArray1[i];
}
for(int j = 0; j<myArray2.length; j++){
sum = sum - myArray2[j];
}
System.out.println("The Missing Number is: " + sum);
}
}


