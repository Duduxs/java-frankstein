package main.java.basics.generics;

public class Main {
    public static void main(String[] args) {
        var sw = new StringWrapper("Olá");
        System.out.println(sw.getElement());

        var gw = new GenericWrapper<Float>(1F);
        System.out.println(gw.getElement());
        var sw2 = new GenericWrapper<String>("Hey");
        System.out.println(sw2.getElement());

    }
}