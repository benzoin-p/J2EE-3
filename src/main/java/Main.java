import Config.ConditionalConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test start!");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionalConfig.class);
    }
}
