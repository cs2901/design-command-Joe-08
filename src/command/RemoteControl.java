package command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> CommandList = new ArrayList<Command>();

    public void getCommand(Command command) {
        CommandList.add(command);
    }

    public void useCommand() {
        for (Command c : CommandList) {
            c.execute();
        }
        CommandList.clear();
    }
}
