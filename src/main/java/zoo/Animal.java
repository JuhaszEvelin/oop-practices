package zoo;

public abstract class Animal {
//nem eszik meg, ekkor fogynak; elfogyasztják, de nem szeretik, ekkor a súlyuk nem változik; szeretik, ekkor a súlyuk gyarapszik.
// Egy állat éhen pusztulhat, ha a súly nullára csökken, illetve elhízásban is kimúlhat, ha túlsúlyossá válik. A túlsúlyosság határa állatfajtánként eltérő.

    protected int weight;
    protected boolean isAlive;
    protected int overWeight;
    protected String name;

    public Animal(int weight, String name) {
        this.weight = weight;
        this.isAlive = true;
        this.name = name;
    }

    public abstract void feed(Food food);

    public void isAlive() {
        this.isAlive = (this.weight <= this.overWeight && this.weight > 0) ? true : false;
    }

    @Override
    public String toString() {
        return name +
                " weight = " + weight +
                " ( overWeight = " + overWeight + " ) -> " +
                (isAlive ? "ALIVE" : "DEAD");
    }
}
