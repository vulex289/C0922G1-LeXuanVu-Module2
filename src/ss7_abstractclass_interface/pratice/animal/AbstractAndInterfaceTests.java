package ss7_abstractclass_interface.pratice.animal;

import ss7_abstractclass_interface.pratice.edible.Edible;
import ss7_abstractclass_interface.pratice.fruit.Apple;
import ss7_abstractclass_interface.pratice.fruit.Fruit;
import ss7_abstractclass_interface.pratice.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i=0;i<animals.length; i++) {
            if (animals[i] instanceof Chicken) {
                Chicken chicken1=(Chicken)animals[i] ;
                System.out.println(chicken1.howToEat());
        }
    }
        Fruit[] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for(Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
