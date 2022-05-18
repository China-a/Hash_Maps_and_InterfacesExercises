package Interfaces.TacoBox_Exercise;

import Interfaces.TacoBox_Exercise.TacoBox;

public class TripleTacoBox implements TacoBox {

    @Override
    public int tacosRemaining() {
        return this.taco;
    }

    @Override
    public void eat() {
    if(taco >= 1) {
        this.taco -= 1;
        }
    }

    private Integer taco;

    public TripleTacoBox() {

        this.taco = 3;
    }

}
