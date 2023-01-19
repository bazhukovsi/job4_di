package job.di.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private ConsoleInput consoleInput;

    public void askStr(String message) {
        consoleInput.askStr(message);
    }
}
