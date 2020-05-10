package patterns.creational.abstractfactory;

public interface LaptopFactory {
    CPU getCPU();

    GPU getGPU();

    StorageDevice getStorageDevice();
}
