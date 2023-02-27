package PC;

public class CPU {
    private String name;
     public class innerProcesor{
        private String name;
        private int price;
        public innerProcesor() {
        }

        public innerProcesor(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getProcesor(){
            return name + " " + price;
        }
    }

    public class innerRAM{
        private  String name;
        private int frequency;

        public innerRAM() {
        }

        public innerRAM(String name, int frequency) {
            this.name = name;
            this.frequency = frequency;
        }

        public String getRAM(){
            return name + " " + frequency;
        }
    }
    public void callInnerClas(){
        innerProcesor innerProcesor = new innerProcesor("intel", 300);
        System.out.println("Info about procesor " + innerProcesor.getProcesor());

        innerRAM innerRAM = new innerRAM("Kingston", 3200);
        System.out.println("Info about RAM  " + innerRAM.getRAM());
    }

}






























