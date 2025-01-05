class DemoOverLoading{

public int add (int a, int b){
return a +b;
}
public short add( short a, short b){
return a+ b;
}
public short add(short a, int b){
return a+ b;
}
public double add (float a, int b){
return a +b;
}
public float add (float a, float b){
return a +b;
}

public static void main(String [] args){

DemoMethodOverLoading addition = new DemoMethodOverLoading();
System.out.println("Addition Of Ist Method: "+addition.add(8,7));
System.out.println("Addition Of 2nd Method: "+addition.add(6,7));
System.out.println("Addition Of 3rd Method: "+addition.add(2,9));
System.out.println("Addition Of 4rd Method: "+addition.add(12,12));
System.out.println("Addition Of 5rd Method: "+addition.add(6,6));

}
}
