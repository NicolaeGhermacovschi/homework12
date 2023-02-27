package MotherBoard;

public class MotherBoard {
    private String name;
    private String producer;

    public MotherBoard(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }
    public static class USB {
        private int portUSB = 5;

        public USB() {
        }

        public int getPortUSB() {
            return portUSB;
        }
    }

    public int callUSB(){
        USB usb = new USB();
        return usb.portUSB;
    }

    public  String getMotherBoard(){
        return name + " " + producer;
    }
}
