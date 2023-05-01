package mg.tutoSwing.finoana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{
  
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g) {
		 // g.setColor(Color.white);
		  // g.fillRect(0, 0, getWidth(), getHeight());
		   
		   Font font = new Font("Arial", Font.BOLD, 40);//definir la font  et la taille de la font 
		    
		   
		   g.setFont(font);
		   g.setColor(Color.ORANGE);
		   g.drawString("Hello world!", 50, 50);
		   
		   try {
			   Image image = ImageIO.read(new File("resources/apple.png"));
			   g.drawImage(image,100,100,null);
		   }catch (IOException e) {
			   e.printStackTrace(); 
		   }
		
	} 
	
}
