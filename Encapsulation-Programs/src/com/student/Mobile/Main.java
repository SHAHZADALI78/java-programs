package Mobile;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********Mobile Information**********");
        Mobile mobile = new Mobile();
        mobile.setBrand("Apple");
        mobile.setModelName("pro max");
        mobile.setColor("Silver");
        mobile.setPrice(140000);
        mobile.displayInfo();
        System.out.println();


        Mobile mobile2 = new Mobile();
        mobile2.setBrand("Vivo");
        mobile2.setModelName("S1");
        mobile2.setColor("Blue");
        mobile2.setPrice(34000);
        mobile2.displayInfo();
        System.out.println();

        Mobile mobile3 = new Mobile();
        mobile3.setBrand("Samsung");
        mobile3.setModelName("S24");
        mobile3.setColor("Black");
        mobile3.setPrice(440000);
        mobile3.displayInfo();
        System.out.println();
    }
}
