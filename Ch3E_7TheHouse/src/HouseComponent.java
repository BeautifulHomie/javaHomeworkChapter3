import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;

public class HouseComponent extends JComponent{
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		TheHouse house = new TheHouse(50, 200);
		house.draw(g2);
	}
}
