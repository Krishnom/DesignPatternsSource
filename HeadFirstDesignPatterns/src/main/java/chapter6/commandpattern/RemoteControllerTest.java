package chapter6.commandpattern;

public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(new LightOnCommand(new Light()));
        simpleRemoteControl.buttonPressed();

        simpleRemoteControl.setCommand(new GarrageOpenCommand(new Garage()));
        simpleRemoteControl.buttonPressed();
    }
}
