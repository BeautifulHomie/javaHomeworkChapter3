import javax.swing.JFrame;

public class CuteFaceViewer {

	public static void main(String[] args) {
		
		JFrame a=new JFrame("A Cute Face");
		a.getContentPane().add(new CuteFace());
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(365,400);
		a.setLocationRelativeTo(null);
		a.setVisible(true);

	}

}
