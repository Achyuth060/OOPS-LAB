class ElectronicDevice {
    void powerOn() {
        System.out.println("Electronic device is powered on.");
    }
}

class Laptop extends ElectronicDevice {
    void powerOn() {
        System.out.println("Laptop is booting up.");
    }
}

public class MethodOverridingUnique2 {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.powerOn();

        Laptop myLaptop = new Laptop();
        myLaptop.powerOn();
    }
}
