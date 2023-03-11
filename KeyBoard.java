package Robots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import Actions.mouse_Demo;

public class KeyBoard extends mouse_Demo {
	
	
	private static void Keyboard1() throws AWTException {   
       Robot r= new Robot();  //AWT is abstract window tool kit
      r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
      
	}
	
	
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		mouse();
		sweet();
		actions();
		Keyboard1();
		
		
	}

}
