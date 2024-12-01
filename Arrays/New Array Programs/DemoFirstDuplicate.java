class DemoFirstDuplicate{
public static void main (String [] args){
int Array [] = {1, 2, 3, 1, 4, 5};
for(int i = 0; i<Array.length; i++){
for(int j = i + 1; j<Array.length; j++){
if(Array[i] == Array[j]){
System.out.println("The First Duplicate Is: " + Array[i]);
}
}
}
}
}

