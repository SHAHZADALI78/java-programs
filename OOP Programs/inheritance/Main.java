class Animal{

public void makeSound(){
System.out.println("Different Animals Make Different Sounds");
}
}
class Cat extends Animal{
public void makeSound(){
System.out.println("Cat Makes Sounds Meao");
}
}
class Main{
public static void main(String [] args){
Animal animal = new Animal();
animal.makeSound();
Cat cat = new Cat();
cat.makeSound();
} 
}


