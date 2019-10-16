package main;

public class Chair {
    private int capacity;
    private int temp;

    public Chair(int capacity, int temp) {
        this.capacity = capacity;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "weight capacity=" + capacity + " porridge temp=" + temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
