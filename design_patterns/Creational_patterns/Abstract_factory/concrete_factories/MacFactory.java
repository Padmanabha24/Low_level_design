package concrete_factories;
import AbstractFactory.GUIFactory;
import BaseProduct.*;
import concrete_products.*;

public class MacFactory implements GUIFactory {
	public Button createButton() {
		return new MacButtons();
	}
	
	 public CheckBox createCheckBox() {
	        return new MacCheckBox();
	    }

}
