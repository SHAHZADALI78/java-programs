class Vehicle{
public void drive(){
System.out.println("Different Vehicles Have Diffent Shapes");
}
}

class Car{
public void drive(){
System.out.println("Driver Needs A Mechanic To Repair The Car ");
}
}

class MainVehicle{
public static void main(String [] args){
Vehicle vehicles = new Vehicle();
vehicles.drive();
Car car = new Car();
car.drive();
}
}

