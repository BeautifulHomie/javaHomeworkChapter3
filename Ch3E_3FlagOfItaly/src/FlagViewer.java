import javax.swing.JFrame;

public class FlagViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setTitle("The Italian Flag");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlagComponent component = new 
		FlagComponent();
		frame.add(component);
		frame.setVisible(true);

	}

}
