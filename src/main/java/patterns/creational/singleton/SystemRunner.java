package patterns.creational.singleton;

public class SystemRunner {
    public static void main(String[] args) {
        System.out.println("Set active cores count to 2");
        ProcessorInfo.getInstance().setActiveCoreCount(2);
        System.out.println("Active cores count: " + ProcessorInfo.getInstance().getActiveCoreCount());
        System.out.println("Set processor temperature to 40");
        ProcessorInfo.getInstance().setTemperature(40);
        System.out.println("Processor temperature: " + ProcessorInfo.getInstance().getTemperature());
    }
}
