class DemoElementsOfSum{
public static void main(String [] args){
int Array [] = {2, 13, 5, 1, 6};
int Target = 11;
for(int i = 0; i<Array.length; i++){
for( int j = i +1; j<Array.length; j++){
if(Array[i] + Array[j] == Target){
System.out.println("Target Is Sum Of: " + Array[i]+ " and " + Array[j]);
}
}
}
}
}
