import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CarComponent extends JComponent {
	public void paintComponent(Graphics g)
	
	{
	Graphics2D g2 = (Graphics2D) g;
	
	Car carIchi = new Car(0, 0);
	int x = getWidth() - 60;
	int y = getHeight() - 30;
	Car carNi = new Car(x, y);
	
	carIchi.draw(g2);
	carNi.draw(g2);
	}
}
