package crusader.command;

import crusader.exception.CrusaderException;
import crusader.task.Task;
import crusader.TaskList;
import crusader.Ui;

/**
 * Command used to mark or unmark tasks as done or not in the bot
 */
public class MarkCommand extends Command {
    private final int index;
    private final boolean isMark;
    public MarkCommand(int index, boolean isMark) {
        this.index = index;
        this.isMark = isMark;
    }

    @Override
    public void execute(Ui ui, TaskList taskList) throws CrusaderException {
        Task changedTask = this.isMark ? taskList.markTask(index) : taskList.unmarkTask(index);
        ui.say(String.format(
                "%s:\n%s\n",
                this.isMark ? "I have marked the following task as done" : "I have unmarked this task",
                changedTask.toString()));
    }
}
