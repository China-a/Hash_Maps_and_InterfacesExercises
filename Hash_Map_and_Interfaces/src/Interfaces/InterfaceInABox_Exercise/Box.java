package Interfaces.InterfaceInABox_Exercise;

import java.util.ArrayList;

public class Box implements Packable {


    private ArrayList<Packable> box;
    private Double capacity;

    public Box(Double capacity) {
        this.box = new ArrayList<Packable>();
        this.capacity = capacity;
    }

    public void addWeightOfItems(Packable item) {
        if(item.weight() + weight() <= this.capacity) {
            box.add(item);
        }
    }

    public Double weight() {
        double weight = 0;
        for (Packable item : box) {
            weight += item.weight();
        }
        return weight;
    }

        public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + weight() + " kg";
    }


}
