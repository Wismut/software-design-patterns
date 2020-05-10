package patterns.creational.abstractfactory.asuslaptop;

import patterns.creational.abstractfactory.CPU;
import patterns.creational.abstractfactory.GPU;
import patterns.creational.abstractfactory.LaptopFactory;
import patterns.creational.abstractfactory.StorageDevice;

public class AsusLaptopFactory implements LaptopFactory {
    @Override
    public CPU getCPU() {
        return new AMDCPU();
    }

    @Override
    public GPU getGPU() {
        return new AMDGPU();
    }

    @Override
    public StorageDevice getStorageDevice() {
        return new SSD();
    }
}
