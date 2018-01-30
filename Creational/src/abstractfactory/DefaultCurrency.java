package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public class DefaultCurrency implements Currency {
    @Override
    public String getCurrency() {
        return "Default Currency";
    }
}
