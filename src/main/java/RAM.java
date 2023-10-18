package main.java;

public class RAM {
    double capacity;
    String type;
    
     public RAM(double capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString () {
        return "Capacity:"+capacity+"\ntype"+type;
    }

   
}
