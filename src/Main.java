public class Main {
    public static void main(String[] args) {
        Keyword keyword = new Keyword("supported","Non supported");
        USBport usBport = new USBport("Type-C",1234567890);
        RAM ram = new RAM("M1","Apple");
        HardDiskSsd hardDiskSsd = new HardDiskSsd(256,"no dividing");
        Display display = new Display("13.3 inch","Apple","254 pixels per inch");
        Computer computer = new Computer(display,"Macbook pro","silver",hardDiskSsd,ram,"14-Core GPU",usBport,keyword,"Apple");

        System.out.println("Brand: "+computer.brand+"\nModel: "+computer.model+"\nDisplay dioganal : "+computer.display.dioganal+"" +
                "\nDisplay produced by: "+computer.display.produced+"\nDisplay matrix type: "+computer.display.matrixType+
                "\nColor: "+computer.color+"\nSSD memory : "+computer.ssd.memory+"\nSSD divided into: "+computer.ssd.dividedInto+
                "\nRAM memory: "+computer.ram.memory+"\nRAM produced by: "+computer.ram.produced+"\nGraphic card: "+computer.graphicsCard+
                "\nUSB port: "+computer.usbPort.portTtype+"\nUSB id port: "+computer.usbPort.idPort+"\nKeyword backlight: "+computer.keyword.backlight+"\n" +
                "Keyword additional numbers: "+computer.keyword.additionalNumber);
    }


}