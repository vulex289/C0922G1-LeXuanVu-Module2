package ss7_abstractclass_interface.pratice.animal;

import ss7_abstractclass_interface.pratice.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "éccccc";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
