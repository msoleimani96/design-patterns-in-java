package creational.factory;

public class PersianLocalizerFactory extends LocalizerFactory {
    @Override
    public PersianLocalizer createLocalizer() {
        return new PersianLocalizer();
    }
}
