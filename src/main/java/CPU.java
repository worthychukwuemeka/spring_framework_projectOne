package main.java;

public class CPU {
    float speed;
    String type;


    @Override
    public String toString () {
        return "CPU{" +
                "speed=" + speed +
                "type='" + type + '\'' +
                '}';
    }
    public CPU(float speed, String type) {
        this.speed = speed;
        this.type = type;
    }
}
