package patterns.creational.abstractfactory.lenovolaptop;

import patterns.creational.abstractfactory.CPU;
import patterns.creational.abstractfactory.GPU;
import patterns.creational.abstractfactory.LaptopFactory;
import patterns.creational.abstractfactory.StorageDevice;

public class LenovoLaptopFactory implements LaptopFactory {
    @Override
    public CPU getCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU getGPU() {
        return new NvidiaGPU();
    }

    @Override
    public StorageDevice getStorageDevice() {
        return new HDD();
    }
}
