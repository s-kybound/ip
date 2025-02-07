package crusader.command;

import crusader.Storage;
import crusader.TaskList;

/**
 * Command used to show all tasks in the bot.
 */
public class ListCommand extends Command {
    public ListCommand() {
        // nothing
    }

    @Override
    public String execute(TaskList taskList, Storage storage) {
        return String.format(
                "Here are your tasks:\n%s",
                taskList.toString());
    }
}
