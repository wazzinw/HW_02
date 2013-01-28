import java.awt.Color;

import java.awt.Graphics;
import java.applet.Applet;


public class Avatar extends Applet
{
	public void paint (Graphics g){
		
		
		//Face
		Color c = new Color(225,184,153);
		g.drawOval(300, 200, 251, 340);
		g.setColor(c);
		
		g.fillOval(300, 200, 250, 340);
		
		//Ears
		g.setColor(Color.black);
		g.drawArc(277, 320, 60, 80, 90, 180);
		g.drawArc(516, 320, 60, 80, 270, 180);
		g.setColor(c);
		g.fillArc(277, 320, 60, 80, 90, 180);
		g.fillArc(516, 320, 60, 80, 270, 180);
		g.setColor(Color.BLACK);
		g.drawString("BOAT", 560, 550);
		
		//NOSE
		g.drawArc(395, 360, 40, 60, 120, 180);
		
		//eyes
		g.setColor(Color.WHITE);
		g.fillOval(330, 320, 60, 40);
		g.fillOval(460, 320, 60, 40);
		g.setColor(Color.BLACK);
		
		//pupils
		g.fillOval(355,330,20,20);
		g.fillOval(480,330,20,20);
		
		//eyebrows
		g.drawArc(325, 310, 70, 20, 0,140);
		g.drawArc(455, 310, 70, 20, 0,140);
		
		//Mouth
		Color a = new Color(120,4,0);
		g.setColor(a);
		g.fillArc (375, 420, 100, 80, 180, 180);
		
		//Hair
		g.setColor(Color.black);
		g.fillArc(260,195,270,150,0,180);
		
	
	}

	

	}


