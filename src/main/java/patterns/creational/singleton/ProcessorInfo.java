package patterns.creational.singleton;

public class ProcessorInfo {
    private static ProcessorInfo instance;
    private int temperature;
    private int activeCoreCount;

    private ProcessorInfo() {

    }

    public static synchronized ProcessorInfo getInstance() {
        if (instance == null) {
            instance = new ProcessorInfo();
        }
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getActiveCoreCount() {
        return activeCoreCount;
    }

    public void setActiveCoreCount(int activeCoreCount) {
        this.activeCoreCount = activeCoreCount;
    }
}
