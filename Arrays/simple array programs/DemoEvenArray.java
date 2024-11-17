class DemoEvenArray{
public static void main(String [] args){
int array [] = new int[9];
int even = 0;
array[0] = 1;
array[1] = 3;
array[2] = 4;
array[3] = 2;
array[4] = 7;
array[5] = 6;
array[6] = 9;
array[7] = 8;
array[8] = 10;
for(int index = 0; index<array.length; index++){
if(array[index] % 2 == 0){
even = array[index];
System.out.println(even);
}
//System.out.println(even);
}
}
}