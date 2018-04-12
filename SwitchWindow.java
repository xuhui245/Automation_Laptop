/**
    * Copyright
    * All right reserved.
    * @author: Xuhui Jiang
    * date: 2017-3-8
    */

//Package used for switchWindow
package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class SwitchWindow {

	public void switchWindow(){
		try {
			new Robot().keyPress(KeyEvent.VK_ALT);
			new Robot().keyPress(KeyEvent.VK_TAB);
		    new Robot().keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			new Robot().keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			new Robot().keyRelease(KeyEvent.VK_TAB);
			new Robot().keyRelease(KeyEvent.VK_ALT);
			new Robot().keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		
	}
}
