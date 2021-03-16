package zoo;

public class Rabbit extends Animal{
    public Rabbit(int weight, String name) {
        super(weight, name);
        this.overWeight = 4;
    }
    @Override
    public void feed(Food food) {

        if (isAlive) {
            if (food.equals(Food.MEAT)) {
                this.weight -= 1;
            }
            if (food.equals(Food.VEGETABLE)) {
                this.weight += 2;
            }
            if (food.equals(Food.FRUIT)) {
                this.weight += 1;
            }
        }
        isAlive();
    }


}
