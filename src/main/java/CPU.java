package main.java;

public class CPU {
    private final double speed;
    private final String type;

    public CPU(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    @Override
    public String toString () {
        return "CPU{" + "speed=" + speed + "type='" + type + '\'' + '}';
    }
}
