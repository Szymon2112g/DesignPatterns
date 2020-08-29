package Behavioral.Command;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();

        Command switchOn = light::turnOn; // new SwitchOnCommand(lamp) // functional interface
        Command switchOff = light::turnOff; // new SwitchOffCommand(lamp)

        Switch mySwitch = new Switch();
        mySwitch.register("on", switchOn);
        mySwitch.register("off", switchOff);

        mySwitch.execute("on");
        mySwitch.execute("off");

    }
}
