package javaPractice.ch05.first;

import java.awt.Toolkit;

public class BeepPrintRunnable implements Runnable{
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}
}


