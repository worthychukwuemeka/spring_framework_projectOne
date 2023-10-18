package main.java;

public class Main {
    public static void main(String[] args) {
        /*CPU coreI5 = new CPU(3.5f, "CoreI5");
        System.out.println(coreI5);*/
        Computer hp250 = new Computer(15,
                new CPU(1.5f, "core2DOU"),
                new RAM(4, "DDOU")
        );

        System.out.println(hp250);
    }
}