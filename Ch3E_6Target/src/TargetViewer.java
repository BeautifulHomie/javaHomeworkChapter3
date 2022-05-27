import javax.swing.JFrame;

public class TargetViewer {

	public static void main(String[] args) {
		
		JFrame theFrame = new JFrame();
		
		theFrame.setSize(800,800);
		theFrame.setTitle("This Is The Target");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TargetComponent component = new TargetComponent();
		theFrame.add(component);   
		theFrame.setVisible(true);
	}   
}