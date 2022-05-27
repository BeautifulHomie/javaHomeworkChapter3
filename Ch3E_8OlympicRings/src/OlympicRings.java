import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class OlympicRings {
	
	private double x;
	private double y;
	private double radius;
	private Color color;
	public OlympicRings(double anX, double aY, double aRadius, Color aColor)
	{
		x = anX;
		y = aY;
		radius = aRadius;
		color = aColor;
	}
	
	public void draw(Graphics2D g2)
	{
		g2.setColor(color);
		Ellipse2D.Double e = new Ellipse2D.Double(x, y, 2 * radius, 2 * radius);
		g2.draw(e);
	}
}
