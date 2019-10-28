package main;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Chair> chairs = new ArrayList<Chair>();

    public boolean addChair(Chair chair) {
        return this.chairs.add(chair);
    }

    public void listChairs() {
        int counter = 1;
        for (Chair c : chairs) {
            System.out.println("Chair " + counter + ": " + c);
            counter++;
        }
    }
}


