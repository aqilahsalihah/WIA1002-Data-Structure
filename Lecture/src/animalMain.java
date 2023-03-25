public class animalMain {
        public static void main(String[] args) {
            Animal animal = new Chicken();
            eat(animal);
            eat(animal);


            animal = new duck();
            eat(animal);
        }

        public static void eat (Animal animal){
            System.out.println(animal.howToEat());
        }

}
