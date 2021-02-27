package chapter6.commandpattern;

public class GarrageOpenCommand implements Command {
    Garage garage;

    public GarrageOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.open();
    }
}
