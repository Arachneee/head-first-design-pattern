package pattern.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("아무일도 일어나지 않았다.");
    }
}
