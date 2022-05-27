import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

	public class FlagComponent extends JComponent{

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		Flag flagOfItaly = new Flag(100, 100, 90);
		flagOfItaly.draw(g2);

		g.drawLine(130, 100, 160, 100);
		g.drawLine(130, 160, 160, 160);
	}
}
