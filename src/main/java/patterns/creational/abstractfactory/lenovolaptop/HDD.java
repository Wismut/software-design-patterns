package patterns.creational.abstractfactory.lenovolaptop;

import patterns.creational.abstractfactory.StorageDevice;

public class HDD implements StorageDevice {
    @Override
    public void readData() {
        System.out.println("HDD reads data");
    }
}
