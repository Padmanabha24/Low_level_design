package concrete_factories;
import AbstractFactory.GUIFactory;
import BaseProduct.*;
import concrete_products.*;

public class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}
	
	 public CheckBox createCheckBox() {
	        return new WindowsCheckBox();
	    }
}
