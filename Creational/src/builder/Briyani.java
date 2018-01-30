package builder;

/**
 * Created by kartdura on 1/30/2018.
 */
public class Briyani {
    String veg="NA";
    String meat="NA";
    String egg="NA";

    public String getVeg() {
        return veg;
    }

    public void setVeg(String veg) {
        this.veg = veg;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "Briyani{" +
                "veg='" + veg + '\'' +
                ", meat='" + meat + '\'' +
                ", egg='" + egg + '\'' +
                '}';
    }
}
