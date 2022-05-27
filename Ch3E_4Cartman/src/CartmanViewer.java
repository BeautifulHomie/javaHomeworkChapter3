import javax.swing.JFrame;

public class CartmanViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(250,350);
		frame.setTitle("It's Cartman");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cartman theCartman = new Cartman();
		frame.add(theCartman);
		frame.setVisible(true);

	}

}
