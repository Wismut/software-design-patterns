package patterns.creational.abstractfactory.asuslaptop;

import patterns.creational.abstractfactory.GPU;

public class AMDGPU implements GPU {
    @Override
    public void drawGraphics() {
        System.out.println("AMD GPU draws graphics");
    }
}
