import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car {
	
	private int xLeft;
	private int yTop;
	
	public Car(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	public void draw(Graphics2D g2)
	{
		Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
		Ellipse2D.Double backTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
	
		// The bottom of the front windshield
		Point2D.Double windshield = new Point2D.Double(xLeft + 10, yTop + 10);
	
		// The top of the roof
		Point2D.Double roof = new Point2D.Double(xLeft + 20, yTop);
	
		// The rear of the roof
		Point2D.Double backWindshield = new Point2D.Double(xLeft + 40, yTop);
	
		// The bottom of the rear windshield
		Point2D.Double bottomWinshield = new Point2D.Double(xLeft + 50, yTop + 10);
		
		Line2D.Double frontWindshield = new Line2D.Double(windshield, roof);
		Line2D.Double roofTop = new Line2D.Double(roof, backWindshield);
		Line2D.Double rearWindshield = new Line2D.Double(backWindshield, bottomWinshield);
	
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(backTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
	}

}
