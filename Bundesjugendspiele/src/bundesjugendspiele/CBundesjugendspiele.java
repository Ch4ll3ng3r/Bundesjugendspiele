package bundesjugendspiele;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;

public class CBundesjugendspiele {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtVorname;
	private JTextField txtKlasse;
	private JTextField txtJahrgang;
	private JTextField txtLauf;
	private JTextField txtSprung;
	private JTextField txtWurf;
	private JTextField txtDisziplin;

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
		frame = new JFrame("Bundesjugendspiele");
		frame.setBounds(100, 100, 800, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		SwingUtilities.updateComponentTreeUI(frame);
		
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Wettkampfkarte");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWettkampfliste = new JLabel("Wettkampfliste");
		springLayout.putConstraint(SpringLayout.NORTH, lblWettkampfliste, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblWettkampfliste, 274, SpringLayout.EAST, lblNewLabel);
		lblWettkampfliste.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblWettkampfliste);
		
		JLabel lblName = new JLabel("Name");
		springLayout.putConstraint(SpringLayout.WEST, lblName, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(lblName);
		
		JLabel lblVorname = new JLabel("Vorname");
		springLayout.putConstraint(SpringLayout.WEST, lblVorname, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(lblVorname);
		
		txtName = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtName, 41, SpringLayout.EAST, lblName);
		springLayout.putConstraint(SpringLayout.EAST, txtName, -559, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblName, 3, SpringLayout.NORTH, txtName);
		springLayout.putConstraint(SpringLayout.NORTH, txtName, 10, SpringLayout.SOUTH, lblNewLabel);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtVorname = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblVorname, 3, SpringLayout.NORTH, txtVorname);
		springLayout.putConstraint(SpringLayout.NORTH, txtVorname, 6, SpringLayout.SOUTH, txtName);
		springLayout.putConstraint(SpringLayout.WEST, txtVorname, 0, SpringLayout.WEST, txtName);
		springLayout.putConstraint(SpringLayout.EAST, txtVorname, 0, SpringLayout.EAST, txtName);
		frame.getContentPane().add(txtVorname);
		txtVorname.setColumns(10);
		
		JLabel lblKlasse = new JLabel("Klasse");
		springLayout.putConstraint(SpringLayout.WEST, lblKlasse, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(lblKlasse);
		
		txtKlasse = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblKlasse, 3, SpringLayout.NORTH, txtKlasse);
		springLayout.putConstraint(SpringLayout.NORTH, txtKlasse, 6, SpringLayout.SOUTH, txtVorname);
		springLayout.putConstraint(SpringLayout.WEST, txtKlasse, 0, SpringLayout.WEST, txtName);
		springLayout.putConstraint(SpringLayout.EAST, txtKlasse, 0, SpringLayout.EAST, txtName);
		frame.getContentPane().add(txtKlasse);
		txtKlasse.setColumns(10);
		
		txtJahrgang = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtJahrgang, 6, SpringLayout.SOUTH, txtKlasse);
		springLayout.putConstraint(SpringLayout.WEST, txtJahrgang, 0, SpringLayout.WEST, txtName);
		springLayout.putConstraint(SpringLayout.EAST, txtJahrgang, 0, SpringLayout.EAST, txtName);
		frame.getContentPane().add(txtJahrgang);
		txtJahrgang.setColumns(10);
		
		JLabel lblJahrgang = new JLabel("Jahrgang");
		springLayout.putConstraint(SpringLayout.NORTH, lblJahrgang, 3, SpringLayout.NORTH, txtJahrgang);
		springLayout.putConstraint(SpringLayout.WEST, lblJahrgang, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(lblJahrgang);
		
		JLabel lblLauf = new JLabel("Lauf");
		springLayout.putConstraint(SpringLayout.NORTH, lblLauf, 32, SpringLayout.SOUTH, lblJahrgang);
		springLayout.putConstraint(SpringLayout.WEST, lblLauf, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(lblLauf);
		
		txtLauf = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtLauf, 26, SpringLayout.SOUTH, txtJahrgang);
		springLayout.putConstraint(SpringLayout.WEST, txtLauf, 0, SpringLayout.WEST, txtName);
		springLayout.putConstraint(SpringLayout.EAST, txtLauf, 0, SpringLayout.EAST, txtName);
		frame.getContentPane().add(txtLauf);
		txtLauf.setColumns(10);
		
		JLabel lblSprung = new JLabel("Sprung");
		springLayout.putConstraint(SpringLayout.WEST, lblSprung, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(lblSprung);
		
		txtSprung = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblSprung, 3, SpringLayout.NORTH, txtSprung);
		springLayout.putConstraint(SpringLayout.NORTH, txtSprung, 6, SpringLayout.SOUTH, txtLauf);
		springLayout.putConstraint(SpringLayout.WEST, txtSprung, 0, SpringLayout.WEST, txtName);
		springLayout.putConstraint(SpringLayout.EAST, txtSprung, 0, SpringLayout.EAST, txtName);
		frame.getContentPane().add(txtSprung);
		txtSprung.setColumns(10);
		
		JLabel lblWurf = new JLabel("Wurf");
		springLayout.putConstraint(SpringLayout.WEST, lblWurf, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(lblWurf);
		
		txtWurf = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblWurf, 3, SpringLayout.NORTH, txtWurf);
		springLayout.putConstraint(SpringLayout.NORTH, txtWurf, 6, SpringLayout.SOUTH, txtSprung);
		springLayout.putConstraint(SpringLayout.WEST, txtWurf, 0, SpringLayout.WEST, txtName);
		springLayout.putConstraint(SpringLayout.EAST, txtWurf, 0, SpringLayout.EAST, txtName);
		frame.getContentPane().add(txtWurf);
		txtWurf.setColumns(10);
		
		JButton btnHinzufuegen = new JButton("Neue Karte einf\u00FCgen");
		springLayout.putConstraint(SpringLayout.NORTH, btnHinzufuegen, 36, SpringLayout.SOUTH, txtWurf);
		springLayout.putConstraint(SpringLayout.WEST, btnHinzufuegen, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnHinzufuegen, 72, SpringLayout.SOUTH, txtWurf);
		springLayout.putConstraint(SpringLayout.EAST, btnHinzufuegen, 0, SpringLayout.EAST, txtName);
		frame.getContentPane().add(btnHinzufuegen);
		
		JLabel lblDisziplin = new JLabel("Disziplin");
		springLayout.putConstraint(SpringLayout.NORTH, lblDisziplin, 11, SpringLayout.NORTH, btnHinzufuegen);
		springLayout.putConstraint(SpringLayout.WEST, lblDisziplin, 7, SpringLayout.EAST, btnHinzufuegen);
		frame.getContentPane().add(lblDisziplin);
		
		txtDisziplin = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtDisziplin, 8, SpringLayout.NORTH, btnHinzufuegen);
		springLayout.putConstraint(SpringLayout.WEST, txtDisziplin, 6, SpringLayout.EAST, lblDisziplin);
		frame.getContentPane().add(txtDisziplin);
		txtDisziplin.setColumns(10);
		
		JList list = new JList();
		springLayout.putConstraint(SpringLayout.EAST, txtDisziplin, -64, SpringLayout.WEST, list);
		springLayout.putConstraint(SpringLayout.NORTH, list, 6, SpringLayout.SOUTH, lblWettkampfliste);
		springLayout.putConstraint(SpringLayout.WEST, list, 0, SpringLayout.WEST, lblWettkampfliste);
		springLayout.putConstraint(SpringLayout.SOUTH, list, 351, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, list, -70, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(list);
		
		JButton btnFindebesten = new JButton("Finde Besten");
		springLayout.putConstraint(SpringLayout.WEST, btnFindebesten, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnFindebesten, 0, SpringLayout.SOUTH, list);
		frame.getContentPane().add(btnFindebesten);
		
		JButton btnSortiere = new JButton("Sortiere");
		springLayout.putConstraint(SpringLayout.NORTH, btnSortiere, 0, SpringLayout.NORTH, btnFindebesten);
		springLayout.putConstraint(SpringLayout.WEST, btnSortiere, 6, SpringLayout.EAST, btnFindebesten);
		frame.getContentPane().add(btnSortiere);
		
		JButton btnBeenden = new JButton("Beenden");
		springLayout.putConstraint(SpringLayout.NORTH, btnBeenden, 0, SpringLayout.NORTH, btnFindebesten);
		springLayout.putConstraint(SpringLayout.EAST, btnBeenden, 0, SpringLayout.EAST, txtDisziplin);
		frame.getContentPane().add(btnBeenden);
	}
}
