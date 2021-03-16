package zoo;

public class Hedgehog extends Animal {
    public Hedgehog(int weight, String name) {
        super(weight, name);
        this.overWeight = 5;
    }

    @Override
    public void feed(Food food) {


        if (isAlive) {
            if (food.equals(Food.MEAT)) {
                this.weight -= 1;
            }

            if (food.equals(Food.FRUIT)) {
                this.weight += 2;
            }
        }
        isAlive();

    }
}
