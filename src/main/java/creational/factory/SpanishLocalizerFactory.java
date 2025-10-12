package creational.factory;

public class SpanishLocalizerFactory extends LocalizerFactory {
    @Override
    public SpanishLocalizer createLocalizer() {
        return new SpanishLocalizer();
    }
}
