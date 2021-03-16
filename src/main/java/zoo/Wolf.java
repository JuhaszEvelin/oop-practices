package zoo;

public class Wolf extends Animal {
    public Wolf(int weight, String name) {
        super(weight, name);
        this.overWeight = 6;
    }

    @Override
    public void feed(Food food) {

        if (isAlive) {
            if (food.equals(Food.MEAT)) {
                this.weight += 3;
            }
            if (food.equals(Food.VEGETABLE) &&
                    food.equals(Food.FRUIT)) {
                this.weight -= 1;
            }

        }
        isAlive();

    }
}
