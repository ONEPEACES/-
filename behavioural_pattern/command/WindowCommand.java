package behavioural_pattern.command;

public class WindowCommand extends Command {
    private WindowHandler windowHandler;

    public WindowCommand() {
        this.windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.display();
    }
}
