package builder;

/**
 * Created by kartdura on 1/30/2018.
 */
public class DriverClass {
    public static void main(String[] args) {
        BriyaniBuilder vegBriyaniBuilder= new VegBriyaniBuilder();
        DriverBriyaniBuild driverBriyaniBuild= new DriverBriyaniBuild();
        driverBriyaniBuild.setBriyaniBuilder(vegBriyaniBuilder);
        driverBriyaniBuild.createBriyani();
        System.out.println(driverBriyaniBuild.getBriyani());
    }
}
