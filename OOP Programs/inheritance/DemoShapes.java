class Shape{
public void getArea(){
System.out.println("Calculate The Area Of Rectangle");
}
}

class Rectangle extends Shape{
public void getArea(){
int Length = 10;
int Width = 5;
System.out.println("The Area Of Rectangle Is: " + (Length*Width));
}
}

class DemoShapes{
public static void main(String [] args){
Shape S = new Shape();
S.getArea();
Rectangle R = new Rectangle();
R.getArea();
}
}

