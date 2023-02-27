import Anonymous.AnonInner;
import MotherBoard.*;
import PC.*;

public class Main {
    public static void main(String[] args) {

        CPU pc = new CPU();
        pc.callInnerClas();
        CPU pc2 = new CPU();
        CPU.innerProcesor procesor = pc2.new innerProcesor("AMD",250);
        System.out.println("Procesor : " + procesor.getProcesor());
        CPU.innerRAM ram = pc2.new innerRAM("DATA",3500);
        System.out.println("RAM" + ram.getRAM());

        MotherBoard.USB usb;
        usb = new MotherBoard.USB();
        System.out.println("Port USB  " + usb.getPortUSB());

        MotherBoard motherBoard = new MotherBoard("Asus ROG", "asus");
        System.out.println("MotherBoard info " + motherBoard.getMotherBoard());
        System.out.println("USB info " + motherBoard.callUSB());

        AnonInner anonInner = new AnonInner();
        System.out.println(" " +  anonInner.admission(5));


    }
}