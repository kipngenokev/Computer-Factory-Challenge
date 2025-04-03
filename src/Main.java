public class Main{
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell");
        Monitor theMonitor = new Monitor("27Inch Beast","Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",
                4,6,"v2.44");

        PersonalComputer thePc = new PersonalComputer("2208","Dell",
                theMonitor,theMotherboard,theCase);

//        thePc.getMonitor().drawPixelAt(10,10,"yellow");
//        thePc.getMotherboard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();
        thePc.powerUp();
    }
}