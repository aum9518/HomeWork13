public class Computer {
    Display display;
    String model;
    String color;
    HardDiskSsd ssd;
    RAM ram;
    String graphicsCard;
    USBport usbPort;
    Keyword keyword;
    String brand;

    public Computer(Display display, String model, String color, HardDiskSsd ssd, RAM ram, String graphicsCard, USBport usbPort, Keyword keyword, String brand) {
        this.display = display;
        this.model = model;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.usbPort = usbPort;
        this.keyword = keyword;
        this.brand = brand;
    }


}
