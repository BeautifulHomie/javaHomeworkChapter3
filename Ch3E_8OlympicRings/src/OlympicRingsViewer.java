import javax.swing.JFrame;

public class OlympicRingsViewer {

	public static void main(String[] args) {
		
		JFrame theFrame = new JFrame();
		theFrame.setSize(300, 400);
		theFrame.setTitle("These Are The Olympic Rings");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OlymipcRingsComponent component = new 
		OlymipcRingsComponent();
		theFrame.add(component);
		theFrame.setVisible(true);
	}
}
