package patterns.creational.abstractfactory.asuslaptop;

import patterns.creational.abstractfactory.CPU;

public class AMDCPU implements CPU {
    @Override
    public void calculateData() {
        System.out.println("AMD CPU calculates data");
    }
}
