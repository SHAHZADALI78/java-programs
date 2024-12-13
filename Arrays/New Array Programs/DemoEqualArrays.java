class DemoEqualArrays{
public static void main(String [] args){
int myArray1 [] = {1, 2, 3, 4, 5};
int myArray2 [] = {1, 2, 3, 4, 5};
boolean found = false;
for(int i = 0; i<myArray1.length; i++){
for(int j = 0; j<myArray2.length; j++){
if(myArray1 == myArray2){
found = true;
break;
}
}
}
if(found){
System.out.println("myArray1 is Equal To myArray2" );
}
else{
System.out.println("myArray1 is Not Equal To myArray2" );
}
}
}




