package Interfaces.TacoBox_Exercise;

public class CustomTacoBox implements TacoBox {
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (this.tacos >= 1) {
            this.tacos -= 1;
        }
    }

    private Integer tacos;

    public CustomTacoBox(Integer tacos) {
       this.tacos = tacos;
    }
}
