package bundesjugendspiele;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CBundesjugendspiele {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CBundesjugendspiele window = new CBundesjugendspiele();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CBundesjugendspiele() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Bundewsjugendspiele");
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
