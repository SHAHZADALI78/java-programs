class DemoShape{
public void getPerimeter() {
System.out.println("Perimeter calculation ");
}
public void getArea() {
System.out.println("Area calculation.");
}
}
class Circle extends DemoShape {
private int radius;
public Circle(int radius) {
this.radius = radius;
}
public void getPerimeter() {
double perimeter = 2 * Math.PI * radius;
System.out.println("The Perimeter Of Circle Is: " + perimeter);
}
public void getArea() {
double area = Math.PI * radius * radius;
System.out.println("The Area Of Circle Is: " + area);
    }
}

class ShapeDemo {
public static void main(String[] args) {
Circle circle = new Circle(4);
circle.getPerimeter();
circle.getArea();
DemoShape shape = new DemoShape();
shape.getPerimeter();  
shape.getArea();  
}
}





