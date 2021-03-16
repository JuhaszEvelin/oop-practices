package zoo;

import java.util.ArrayList;

public class Simulation {

    public static void simulation() {
        Food[] foods = new Food[]{Food.MEAT, Food.VEGETABLE, Food.MEAT, Food.FRUIT, Food.MEAT};

        Animal[] animals = new Animal[]{
                new Wolf(3, "Akela"),
                new Bear(4, "Balu"),
                new Rabbit(2, "Tapsi"),
                new Bear(6, "Brumi"),
                new Hedgehog(4, "Durum")
        };

        for (Food f : foods) {
            int day = 1;
            System.out.println(day + ". DAY food: " + f);

            for (Animal a : animals) {
                a.feed(f);
                System.out.println(a.toString());
            }
            System.out.println("------------------------DAY END-----------------------");
            System.out.println();
           day++;
        }
    }
}
