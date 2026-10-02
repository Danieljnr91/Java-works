class Processor{
    private String model;
    private double clockSpeed;

    Processor(String model,double clockSpeed){
        this.clockSpeed=clockSpeed;
        this.model=model;
    }

    void printSpecs(){
        System.out.println("CPU Model: "+model+" ClockSpeed: "+clockSpeed+"GHz");
    }
}

class Ram{
    private String memoryType;
    private int sizeGB;

    Ram(String memoryType,int sizeGB){
        this.memoryType=memoryType;
        this.sizeGB=sizeGB;
    }

    void printSpecs(){
        System.out.println("Memory Capacity: "+sizeGB+"GB"+" Memory Type: "+memoryType);
    }
}

class Computer{
    private Processor processor;
    private Ram ram;
    private String brand;

    Computer(Processor processor, Ram ram,String brand){
        this.processor=processor;
        this.ram=ram;
        this.brand=brand;
    }

    void displaySystemInfo(){
        System.out.println("Brand: "+brand);
        processor.printSpecs();
        ram.printSpecs();
    }


}

public class Machine{
    public static void main(String[] args){
        Ram ram = new Ram("DDR5",32);
        Processor processor = new Processor("Intel Core i7 11th gen",2.60);
        Computer computer = new Computer(processor,ram,"Lenovo Legion");

        computer.displaySystemInfo();
    }
}