
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author K-Shan
 *
 */
public class QuickLoginSettingsFrame extends JFrame {

	private static final long serialVersionUID = 6571276672345840063L;
	
	private JPanel contentPane;
	NovaFrame parent;
	private JTextField username;
	private JPasswordField password;

	public QuickLoginSettingsFrame(NovaFrame parent) {
		super("Quick Login Settings");
		this.parent = parent;
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 210);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsername.setBounds(11, 28, 115, 33);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(11, 64, 115, 33);
		contentPane.add(lblPassword);
		
		username = new JTextField(Utils.quickLoginUsername);
		username.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				Utils.quickLoginUsername = username.getText();
			}
		});
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setBounds(126, 28, 236, 33);
		Utils.setTextFieldLimit(username, 14);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField(Utils.quickLoginPassword);
		password.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyReleased(KeyEvent arg0) {
				Utils.quickLoginPassword = password.getText();
			}
		});
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password.setColumns(10);
		password.setBounds(126, 70, 236, 33);
		Utils.setTextFieldLimit(password, 30);
		contentPane.add(password);
		
		JCheckBox autoLogin = new JCheckBox("Auto Login");
		autoLogin.setSelected(Utils.autoLogin);
		autoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utils.autoLogin = autoLogin.isSelected();
			}
		});
		autoLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		autoLogin.setBounds(118, 137, 135, 25);
		contentPane.add(autoLogin);
		
		JCheckBox chckbxshow = new JCheckBox("(Show)");
		chckbxshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password.setEchoChar(chckbxshow.isSelected() ? (char) 0 : '*');
			}
		});
		chckbxshow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxshow.setBounds(11, 95, 79, 25);
		contentPane.add(chckbxshow);
		setVisible(true);
	}
}
