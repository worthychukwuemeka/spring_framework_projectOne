package main.java;

public class Computer {
    int screenSize;
    CPU myCPU;
    RAM myRAM;

    @Override
    public String toString () {
        return "Computer{" +
                "screenSize=" + screenSize +
                "myCPU=" + myCPU +
                "myRAM='" + myRAM + '\'' +
                '}';
    }

    public Computer(int screenSize, CPU myCPU, RAM myRAM) {
        this.screenSize = screenSize;
        this.myCPU = myCPU;
        this.myRAM = myRAM;
    }
}
