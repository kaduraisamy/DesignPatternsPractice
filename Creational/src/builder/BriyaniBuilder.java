package builder;

/**
 * Created by kartdura on 1/30/2018.
 */
public abstract class BriyaniBuilder {
    Briyani briyani;
    Briyani getBriyani(){
        return briyani;
    }
    void createBriyani(){
        briyani= new Briyani();
    }
    void buildBriyani(){
        createBriyani();
    }
    abstract void addEgg();
    abstract void addMeat();
    abstract void addVeg();
}
