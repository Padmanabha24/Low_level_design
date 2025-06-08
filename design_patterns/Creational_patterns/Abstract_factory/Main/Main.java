package Main;
import AbstractFactory.GUIFactory;
import ClientCode.Applications;
import concrete_factories.*;

public class Main {
	public static void main(String[] args) {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        Applications app = new Applications(factory);
        app.renderUI();
    }
}
