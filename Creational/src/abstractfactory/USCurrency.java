package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public class USCurrency implements Currency {
    @Override
    public String getCurrency() {
        return "Dollar";
    }
}
