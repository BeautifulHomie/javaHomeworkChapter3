import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class OlymipcRingsComponent extends JComponent{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		int xMid = getWidth() / 2;
		int yMid = getHeight() / 2;
		int radius = 30;
		int yTopRow = yMid - radius / 2;
		int yBotRow = yMid + radius / 2;
	
		OlympicRings ringIchi = new OlympicRings(xMid - radius * 3, yTopRow, radius, Color.BLUE);
		OlympicRings ringNi = new OlympicRings(xMid - radius, yTopRow, radius, Color.BLACK);
		OlympicRings ringSan = new OlympicRings(xMid + radius, yTopRow, radius, Color.RED);
		OlympicRings ringShi = new OlympicRings(xMid - radius * 2, yBotRow, radius, Color.YELLOW);
		OlympicRings ringGo = new OlympicRings(xMid, yBotRow, radius, Color.GREEN);
	
		ringIchi.draw(g2);
		ringNi.draw(g2);
		ringSan.draw(g2);
		ringShi.draw(g2);
		ringGo.draw(g2);
	}
}
