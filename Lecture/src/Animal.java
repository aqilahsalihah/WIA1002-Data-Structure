public abstract class Animal {
    public abstract String howToEat();

}

class Chicken extends Animal{

    @Override
    public String howToEat() {
        return "Fry it";
    }
}

class duck extends Animal{

    @Override
    public String howToEat() {
        return "Roast it";
    }
}
