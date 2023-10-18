package main.java;

public class RAM {
    int capacity;
    String type;

    @Override
    public String toString () {
        return super.toString();
    }

    public RAM(float capacity, String type) {
        this.capacity = (int) capacity;
        this.type = type;
    }
}
