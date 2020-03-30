import Controller.MainController;
import View.View;


public class Main {
    public static void main(String[] args) {
        View view = new View();
        MainController mainController = new MainController(view);
        mainController.run();
    }
}
