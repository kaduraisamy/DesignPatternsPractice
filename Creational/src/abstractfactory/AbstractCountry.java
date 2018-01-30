package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public abstract class AbstractCountry {
    public static AbstractCountry getCountry(String name){
        AbstractCountry country;
        switch (name){
            case "INDIA":
                country= new IndiaImpl();
                break;
            case "US":
                country= new USImpl();
                break;
            default :
                country= new DefaultCountryImpl();
                break;
        }
        return country;
    }
    public  abstract TimeZone getTimeZone();
    public abstract  Currency getCurrency();
}
