import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Date;

public class AvatarClock extends Avatar implements Runnable
{
	protected Thread mainThread;
	protected int delay;
	
	public void init(){
		mainThread = null;
		delay = 1000;
		}
		
	
	public void start(){
		if(mainThread==null){
			mainThread = new Thread(this);
			mainThread.start();
		}
	}
	
	public void paint(Graphics g)
	{
		Dimension d = this.getSize();
		super.paint(g);
		Date newTime = new Date();
		int second = newTime.getSeconds();
		paintClock(g);
		
		g.setColor(Color.white);
		g.fillOval(355,330,20,20);
		g.fillOval(480,330,20,20);
		
		g.setColor(Color.black);
		double buffer = Math.PI*second/30.0;
		int posX = (int) (355+10*Math.cos(buffer-Math.PI/2));
		int posY = (int) (335-10*Math.sin(buffer+Math.PI/2));
		g.fillOval(posX-2, posY-2, 20, 20);
		posX = (int) (480+10*Math.cos(buffer-Math.PI/2));
		posY = (int) (335-10*Math.sin(buffer+Math.PI/2));
		g.fillOval(posX-2, posY-2, 20, 20);
		
		for(int i=0 ;i<60 ;i++){
			
			double b = Math.PI*i/30.0;
			 posX = (int) (410+200*Math.cos(b-Math.PI/2));
			 posY = (int) (360-200*Math.sin(b+Math.PI/2));
			if(i==second) {
			g.setColor(Color.white);
			
			if((i%5)!=0){
				g.fillOval(posX-2, posY-2, 4, 4);
				g.setColor(Color.red);
				g.fillOval(posX-2, posY-2, 4, 4);
				
			} else{
				posX = (int) (410+200*Math.cos(buffer-Math.PI/2));
			    posY = (int) (360-200*Math.sin(buffer+Math.PI/2));
				
			    g.drawString(""+i, posX-2, posY-2);
			g.setColor(Color.red);
			    g.drawString(""+i, posX-2, posY-2);
			
		}
		}
	}
		
	}

	


	private void paintClock(Graphics g) {
		
		for(int i=0 ; i<60 ;i++){
			double buffer = Math.PI*i/30.0;
			
				int posX = (int) (410+200*Math.cos(buffer));
				int posY = (int) (360-200*Math.sin(buffer));
				g.setColor(Color.black);
				
				if((i%5)!=0){
				g.fillOval(posX-2, posY-2, 4, 4);
				
			} else{
				posX = (int) (410+200*Math.cos(buffer-Math.PI/2));
			    posY = (int) (360-200*Math.sin(buffer+Math.PI/2));
				g.drawString(""+i, posX-2, posY-2);
			
			}	
			
		}
	}


	public void run() {
		while(Thread.currentThread() == mainThread){
			
			repaint();
			try{
			Thread.currentThread();
			Thread.sleep(delay);
			}catch(InterruptedException e){}
	}
	
	

}
}