package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public class USImpl  extends AbstractCountry {
    @Override
    public TimeZone getTimeZone() {
        return new USTimeZone();
    }

    @Override
    public Currency getCurrency() {
        return new USCurrency();
    }
}