package zoo;

public class Bear extends Animal {
    public Bear(int weight, String name) {
        super(weight, name);
        this.overWeight = 10;
    }

    @Override
    public void feed(Food food) {

        if (isAlive) {
            if (food.equals(Food.MEAT) ||
                    food.equals(Food.FRUIT)) {
                this.weight += 1;
            }
            if (food.equals(Food.VEGETABLE)) {
                this.weight -= 1;

            }
            isAlive();

        }
    }
}
