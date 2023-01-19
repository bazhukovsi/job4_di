package job.di.homework;

import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private ConsoleInput consoleInput;

    public StartUI(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public void askStr(String message) {
        consoleInput.askStr(message);
    }
}
