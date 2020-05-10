package patterns.creational.abstractfactory.asuslaptop;

import patterns.creational.abstractfactory.StorageDevice;

public class SSD implements StorageDevice {
    @Override
    public void readData() {
        System.out.println("SSD reads data");
    }
}
