package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public class DriverClass {
    public static void main(String[] args) {
       AbstractCountry abstractCountry=AbstractCountry.getCountry("INDIA");
        System.out.println(abstractCountry.getCurrency().getCurrency());
        System.out.println(abstractCountry.getTimeZone().getTimeZone());
        abstractCountry=AbstractCountry.getCountry("US");
        System.out.println(abstractCountry.getCurrency().getCurrency());
        System.out.println(abstractCountry.getTimeZone().getTimeZone());
        abstractCountry=AbstractCountry.getCountry("UK");
        System.out.println(abstractCountry.getCurrency().getCurrency());
        System.out.println(abstractCountry.getTimeZone().getTimeZone());


    }
}
