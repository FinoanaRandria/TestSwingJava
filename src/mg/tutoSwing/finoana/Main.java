package mg.tutoSwing.finoana;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		  //pour optimiser la fennetre sur thread
         SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				   new Frame("test Swing");
				
			}
		});
	}

}
