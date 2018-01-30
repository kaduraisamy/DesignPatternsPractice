package builder;

/**
 * Created by kartdura on 1/30/2018.
 */
public class MeatBriyaniBuilder extends BriyaniBuilder {
    @Override
    void addEgg() {
        briyani.setEgg("Egg");
    }

    @Override
    void addMeat() {
        briyani.setMeat("Meat");
    }

    @Override
    void addVeg() {

    }
}
