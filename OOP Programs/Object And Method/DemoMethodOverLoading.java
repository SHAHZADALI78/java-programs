class DemoMethodOverLoading{

public long add (long a, long b){
return a + b;
}

public long add( int a, int b, int c){
return a+ b + c;
}
public long add(long  a, int b){
return a+ b;
}

public static void main(String [] args){

DemoMethodOverLoading addition = new DemoMethodOverLoading();
System.out.println("Addition Of Ist Method: "+addition.add(8,7));
System.out.println("Addition Of 2nd Method: "+addition.add(6,7,8));
System.out.println("Addition Of 3rd Method: "+addition.add(6,12));
}
}