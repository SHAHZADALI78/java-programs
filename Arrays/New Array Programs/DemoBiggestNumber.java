class DemoBiggestNumber{
public static void main(String [] args){
int Array[] = {10, 40, 20, 100, 50};
int max = Array[0];
for(int i = 1; i<Array.length; i++){
if(Array[i]>max){
max = Array[i];
}
}
System.out.println("The biggest num is: " + max);
}
}