package pattern.command;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    @Override
    public void undo() {
        garageDoor.down();
    }

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
