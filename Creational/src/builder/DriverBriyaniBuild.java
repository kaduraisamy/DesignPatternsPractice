package builder;

/**
 * Created by kartdura on 1/30/2018.
 */
public class DriverBriyaniBuild {

    BriyaniBuilder briyaniBuilder;

    public Briyani getBriyani() {
        return briyaniBuilder.getBriyani();
    }

    public void setBriyaniBuilder(BriyaniBuilder briyaniBuilder) {
        this.briyaniBuilder = briyaniBuilder;
    }

    void createBriyani(){
        briyaniBuilder.buildBriyani();
        briyaniBuilder.addEgg();
        briyaniBuilder.addMeat();
        briyaniBuilder.addVeg();

    }
}
