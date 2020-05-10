package patterns.creational.abstractfactory.lenovolaptop;

import patterns.creational.abstractfactory.CPU;

public class IntelCPU implements CPU {
    @Override
    public void calculateData() {
        System.out.println("Intel CPU calculates data");
    }
}
