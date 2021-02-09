import config.AppConfig;
import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User userOne = new User();
        userOne.setName("Bob");
        User userTwo = new User();
        userTwo.setName("Erick");
        userService.add(userOne);
        userService.add(userTwo);
        System.out.println(userService.listUsers());
    }
}
