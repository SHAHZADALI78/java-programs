package com.Student.Mobile;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Samsung Mobile*****");
        Mobile samsung = new Samsung();
        samsung.call();
        samsung.battery();
        System.out.println();

        System.out.println("*****Oppo Mobile*****");
        Mobile oppo = new Oppo();
        oppo.call();
        oppo.battery();
        System.out.println();

        System.out.println("*****Vivo Mobile*****");
        Mobile vivo = new Vivo();
        vivo.call();
        vivo.battery();
        System.out.println();

        System.out.println("*****Infinix Mobile*****");
        Mobile infinix = new Infinix();
        infinix.call();
        infinix.battery();
        System.out.println();

    }
}
