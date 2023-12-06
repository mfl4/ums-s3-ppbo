package experiment;

public interface LampActivity {
    public static final int LIGHT_ON = 1;
    public static final int LIGHT_OFF = 0;

    public abstract void turnOffLight();

    public abstract void turnOnLight();
}
