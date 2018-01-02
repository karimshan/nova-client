import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PortChooser extends JFrame {

	/**
	 * @serialField
	 */
	private static final long serialVersionUID = 710235439489099790L;
	
	/**
	 * Where the options are
	 */
	private JPanel contentPane;
	
	// fuck
	public static boolean selected = false;

	/**
	 * Create the frame.
	 */
	public PortChooser() {
		setTitle("Choose which client");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				Loader.PORT_ID = 43594; // Default to MSI if no choice is made
				selected = true;
				dispose();
			}
			
		});
		setBounds(100, 100, 564, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPort = new JButton("Port 43594 - DEFAULT MSI LAPTOP");
		btnPort.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPort.setBounds(31, 47, 475, 52);
		contentPane.add(btnPort);
		btnPort.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Loader.PORT_ID = 43594;
				selected = true;
				dispose();
			}
			
		});
		
		JButton btnPort_1 = new JButton("Port 43595 - Samsung Laptop");
		btnPort_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPort_1.setBounds(31, 123, 475, 52);
		contentPane.add(btnPort_1);
		btnPort_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Loader.PORT_ID = 43595;
				selected = true;
				dispose();
			}
			
		});
		
		JButton btnPort_2 = new JButton("Port 43596 - Surface Book");
		btnPort_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPort_2.setBounds(31, 208, 475, 52);
		contentPane.add(btnPort_2);
		btnPort_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Loader.PORT_ID = 43596;
				selected = true;
				dispose();
			}
			
		});
	}
}
