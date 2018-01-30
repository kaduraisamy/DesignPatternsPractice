package abstractfactory;

/**
 * Created by kartdura on 1/30/2018.
 */
public class DefaultTimeZone implements TimeZone {
    @Override
    public String getTimeZone() {
        return "GMT";
    }
}
