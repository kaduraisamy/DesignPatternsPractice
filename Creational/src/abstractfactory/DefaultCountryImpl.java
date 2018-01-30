package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public class DefaultCountryImpl extends AbstractCountry {
    @Override
    public TimeZone getTimeZone() {
        return new DefaultTimeZone();
    }

    @Override
    public Currency getCurrency() {
        return new DefaultCurrency();
    }
}
