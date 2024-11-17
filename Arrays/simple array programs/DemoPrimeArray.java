class DemoPrimeArray{
public static void main(String [] args){
int num [] = new int[10];
int prime = 0;
num [0] = 1;
num [1] = 8;
num [2] = 5;
num [3] = 14;
num [4] = 6;
num [5] = 3;
num [6] = 7;
num [7] = 11;
num [8] = 15;
num [9] = 16;
for(int index =0; index< num.length;index++){
if(num[index]%2!=0){
prime = num[index];
System.out.println(prime);
}
}
}
}