import javax.swing.JFrame;

public class MoreCarsViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(400, 500);
		frame.setTitle("More Cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarComponent componentCar = new CarComponent();
		frame.add(componentCar);
		frame.setVisible(true);

	}

}
