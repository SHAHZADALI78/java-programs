class Animal {
public void move(){
System.out.println("The animal is moving.");
}
}

class Cheetah extends Animal{
public void move() {
System.out.println("Cheetah Is Running Fast!");
}
}
class TestAnimal{
public static void main(String[] args) {
Animal animal = new Animal();
animal.move();
Cheetah cheetah = new Cheetah();
cheetah.move();
}
}
