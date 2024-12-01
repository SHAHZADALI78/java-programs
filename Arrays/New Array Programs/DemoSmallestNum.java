class DemoSmallestNum{
public static void main(String [] args){
int Array [] = {50, 20, 30, 10 ,70};
int min = Array[0];
for(int i = 1; i<Array.length; i++){
if(Array[i]<min){
min = Array[i];
}
}
System.out.println("The Minimum Number In Array Is: "+min);
}
}