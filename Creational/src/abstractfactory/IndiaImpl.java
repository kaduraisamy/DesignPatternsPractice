package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public class IndiaImpl extends AbstractCountry {
    @Override
    public TimeZone getTimeZone() {
        return new IndianTimeZone();
    }

    @Override
    public Currency getCurrency() {
        return new IndianCurrency();
    }
}
