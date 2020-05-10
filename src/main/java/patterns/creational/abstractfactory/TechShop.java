package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.asuslaptop.AsusLaptopFactory;
import patterns.creational.abstractfactory.lenovolaptop.LenovoLaptopFactory;

public class TechShop {
    public static void main(String[] args) {
        System.out.println("Lenovo laptop is created and works");
        createAndWorkWithLenovoLaptop();
        System.out.println();
        System.out.println("Asus laptop is created and works");
        createAndWorkWithAsusLaptop();
    }

    private static void createAndWorkWithLenovoLaptop() {
        LaptopFactory lenovoLaptopFactory = new LenovoLaptopFactory();
        CPU lenovoCPU = lenovoLaptopFactory.getCPU();
        GPU lenovoGPU = lenovoLaptopFactory.getGPU();
        StorageDevice lenovoStorageDevice = lenovoLaptopFactory.getStorageDevice();
        lenovoStorageDevice.readData();
        lenovoCPU.calculateData();
        lenovoGPU.drawGraphics();
    }

    private static void createAndWorkWithAsusLaptop() {
        LaptopFactory asusLaptopFactory = new AsusLaptopFactory();
        CPU asusCPU = asusLaptopFactory.getCPU();
        GPU asusGPU = asusLaptopFactory.getGPU();
        StorageDevice asusStorageDevice = asusLaptopFactory.getStorageDevice();
        asusStorageDevice.readData();
        asusCPU.calculateData();
        asusGPU.drawGraphics();
    }
}
