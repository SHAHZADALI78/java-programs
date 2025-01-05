class Laptop{
String name;
int price;
String generation;
String storage;

public void displayData(){
System.out.println("Name : "+name+ "      Price : "+price+ "      Generation : "+generation+ "      Storage : "+storage);

}

public void totalPrice(int price){
double tax = price*0.10;
double totalLaptopPrice = price + tax;
System.out.println("The Total Price Of Laptop Is: "+totalLaptopPrice);
}


public static void main(String [] args){
Laptop hp = new Laptop ();
hp.name = "HP Laptop";
hp.price = 60000;
hp.generation = "7th" ;
hp.storage = "128ssd";

Laptop lenovo = new Laptop ();
lenovo.name = "Lenovo Laptop";
lenovo.price = 75000;
lenovo.generation = "8th" ;
lenovo.storage = "256ssd";

Laptop dell = new Laptop ();
dell.name = "Dell Laptop ";
dell.price = 65000;
dell.generation = "7th" ;
dell.storage = "128ssd";

Laptop thinkPad = new Laptop ();
thinkPad.name = "ThinkPad Laptop ";
thinkPad.price = 70000;
thinkPad.generation = "8th" ;
thinkPad.storage = "256ssd";

Laptop macBook = new Laptop ();
macBook.name = "Mac Book Laptop";
macBook.price = 95000;
macBook.generation = "Latest";
macBook.storage = "512 ssd" ;

System.out.println(" ----------OBJECTS OF LAPTOP-----------");
System.out.println(hp.name);
System.out.println(hp.price);
System.out.println(hp.generation);
System.out.println(hp.storage);
hp.totalPrice(hp.price);
hp.displayData();
System.out.println(" ");

System.out.println(lenovo.name);
System.out.println(lenovo.price);
System.out.println(lenovo.generation);
System.out.println(lenovo.storage);
lenovo.totalPrice(lenovo.price);
lenovo.displayData();
System.out.println(" ");

System.out.println(dell.name);
System.out.println(dell.price);
System.out.println(dell.generation);
System.out.println(dell.storage);
dell.totalPrice(dell.price);
dell.displayData();
System.out.println(" ");

System.out.println(thinkPad.name);
System.out.println(thinkPad.price);
System.out.println(thinkPad.generation);
System.out.println(thinkPad.storage);
thinkPad.totalPrice(thinkPad.price);
thinkPad.displayData();
System.out.println(" ");

System.out.println(macBook.name);
System.out.println(macBook.price);
System.out.println(macBook.generation);
System.out.println(macBook.storage);
macBook.totalPrice(macBook.price);
macBook.displayData();
System.out.println(" ");
}
}


