package patterns.creational.abstractfactory.lenovolaptop;

import patterns.creational.abstractfactory.GPU;

public class NvidiaGPU implements GPU {
    @Override
    public void drawGraphics() {
        System.out.println("Nvidia GPU draws graphics");
    }
}
