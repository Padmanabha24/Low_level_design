package ClientCode;
import AbstractFactory.GUIFactory;
import BaseProduct.*;
import concrete_products.*;

public class Applications {
private Button button;
private CheckBox checkBox;

public Applications(GUIFactory Factory) {
	button = Factory.createButton();
	checkBox = Factory.createCheckBox();
}

public void renderUI() {
    button.display();
    checkBox.display();
}
}
