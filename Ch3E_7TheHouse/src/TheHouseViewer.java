import javax.swing.JFrame;

public class TheHouseViewer {

	public static void main(String[] args) {
		
		JFrame theFrame = new JFrame();
		theFrame.setSize(300, 300);
		theFrame.setTitle("Check This House");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HouseComponent component = new HouseComponent();
		theFrame.add(component);
		theFrame.setVisible(true);
		
	}
}
