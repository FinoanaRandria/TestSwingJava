package mg.tutoSwing.finoana;

import javax.swing.JFrame;

public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
     
	
	  public Frame( String title) {
		  setTitle(title);//title
		  setSize(1280,720); //width height
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//des que l on quite l app  le programme se ferme 
          setResizable(true);  //true or false resize
          setLocationRelativeTo(null);// position au millieu de l ecran au demarage
          setVisible(true);  // pour affichier la fenetre 
	  }
}
