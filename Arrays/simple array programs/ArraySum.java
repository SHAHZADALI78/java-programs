class ArraySum{
public static void main(String [] args){
int array [] = new int[5];
int sum = 0;
array[0] = 2;
array[1] = 4;
array[2] = 6;
array[3] = 8;
array[4] = 10;
for(int index = 0; index < array.length; index++){
sum = sum+array[index];
System.out.println(array[index]);
}
System.out.println(sum);
}
}
