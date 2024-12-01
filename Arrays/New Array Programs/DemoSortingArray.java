class DemoSortingArray{
public static void main(String [] args){
int Array [] = {30, 20 ,50, 10 ,60};
System.out.print("Assending Sort Of Array Is: ");
for(int i = 0; i<Array.length; i++){
for(int j = i + 1; j<Array.length; j++){
int temp = 0;
if(Array[i]>Array[j]){
temp = Array[i];
Array[i] = Array[j];
Array[j] = temp;
}
}
System.out.print(Array[i]+" ");
}
}
}

