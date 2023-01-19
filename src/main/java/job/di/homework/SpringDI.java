package job.di.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("job.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.askStr("Введите ваш возраст: ");
    }
}
