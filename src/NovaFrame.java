
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author K-Shan
 *
 */
public class NovaFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = -2198234225586491936L;

	private ZoomSettingsFrame settings;
	private QuickLoginSettingsFrame quickLoginSettings;
	private JMenu mnThemes;
	private JMenu devConsoleColor;

	public NovaFrame(JPanel componentsPanel) {
		super("Nova");
		Utils.setDefaultTheme();
		setIcon();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 50, 809, 625);
		setMinimumSize(new Dimension(100, 100));
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				Utils.savePreferences();
			}
			
		});
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu settingsMenu = new JMenu("Settings");
		menuBar.add(settingsMenu);
		
		JMenuItem mntmZoom = new JMenuItem("Edit Zoom");
		mntmZoom.setActionCommand("zoom");
		mntmZoom.addActionListener(this);
		settingsMenu.add(mntmZoom);
		
		JMenuItem mntmSnow = new JMenuItem("Toggle Snow");
		mntmSnow.setActionCommand("snow");
		mntmSnow.addActionListener(this);
		settingsMenu.add(mntmSnow);
		
		JMenuItem mntmShowFps = new JMenuItem("Toggle FPS");
		mntmShowFps.setActionCommand("fps");
		mntmShowFps.addActionListener(this);
		settingsMenu.add(mntmShowFps);
		
		JMenuItem quickLoginMenuItem = new JMenuItem("Quick Login");
		settingsMenu.add(quickLoginMenuItem);
		quickLoginMenuItem.setActionCommand("quick_login");
		quickLoginMenuItem.addActionListener(this);
		
		JMenuItem mntmRestartClient = new JMenuItem("Restart Client");
		settingsMenu.add(mntmRestartClient);
		mntmRestartClient.setActionCommand("restart_client");
		mntmRestartClient.addActionListener(this);
		
		JMenuItem mntmShowLoadingScreen = new JMenuItem("Show Loading Screen");
		mntmShowLoadingScreen.setActionCommand("show_loading_screen");
		mntmShowLoadingScreen.addActionListener(this);
		settingsMenu.add(mntmShowLoadingScreen);
		
		devConsoleColor = new JMenu("Dev Console Color");
		//devConsoleColor.setVisible(false);
		settingsMenu.add(devConsoleColor);
		JMenuItem[] devConsoleColors = { 
			new JMenuItem("Default"),
			new JMenuItem("Clear"),
			new JMenuItem("Red"),
			new JMenuItem("Green"),
			new JMenuItem("Blue"),
			new JMenuItem("Yellow"),
			new JMenuItem("Cyan"),
			new JMenuItem("Purple"),
			new JMenuItem("White"),
			new JMenuItem("Black"),
			new JMenuItem("Alternating")
		};
		int colorIndex = 0;
		for(JMenuItem jmi : devConsoleColors) {
			devConsoleColor.add(jmi);
			jmi.setActionCommand("Color_"+colorIndex);
			jmi.addActionListener(this);
			colorIndex++;
		}
		
		JMenu mnSites = new JMenu("Sites");
		menuBar.add(mnSites);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mnSites.add(mntmHome);
		
		JMenuItem mntmForums = new JMenuItem("Forums");
		mnSites.add(mntmForums);
		
		JMenuItem mntmVote = new JMenuItem("Vote");
		mnSites.add(mntmVote);
		
		JMenuItem mntmMembership = new JMenuItem("Membership");
		mnSites.add(mntmMembership);
		
		JMenuItem mntmHiscores = new JMenuItem("HiScores");
		mnSites.add(mntmHiscores);
		
		JMenuItem mntmAdventureLogs = new JMenuItem("Adventurer's Logs");
		mnSites.add(mntmAdventureLogs);
		
		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);
		
		JMenuItem mntmItemList = new JMenuItem("Item List");
		mntmItemList.setActionCommand("item_list");
		mntmItemList.addActionListener(this);
		mnTools.add(mntmItemList);
		
		/*JMenuItem mntmNpcDropList = new JMenuItem("NPC Drop List");
		mnTools.add(mntmNpcDropList);*/ // Already enabled server side.
		
		mnThemes = new JMenu("Themes");
		menuBar.add(mnThemes);
		JMenuItem[] themes = {
			new JMenuItem("Raven"),
			new JMenuItem("Nebula"),
			new JMenuItem("Business"),
			new JMenuItem("Business Blue Steel"), 
			new JMenuItem("Business Black Steel"),
			new JMenuItem("Raven Graphite"),
			new JMenuItem("Challenger Deep"), 
			new JMenuItem("Magma"), 
			new JMenuItem("Emerald Dusk"),
			new JMenuItem("Mist Aqua"),
			new JMenuItem("Green Magic"),
			new JMenuItem("Finding Nemo"),
			new JMenuItem("Mango"),
			new JMenuItem("Autumn"),
			new JMenuItem("Office Blue 2007")
		};
		int themeIndex = 0;
		for(JMenuItem jmi : themes) {
			mnThemes.add(jmi);
			jmi.setActionCommand("Theme_"+themeIndex+"");
			jmi.addActionListener(this);
			themeIndex++;
		}
		JButton btnScreenshot = new JButton("Screenshot");
		btnScreenshot.setActionCommand("screenshot");
		btnScreenshot.addActionListener(this);
		menuBar.add(btnScreenshot);
		
		getContentPane().add(componentsPanel, "Center");
		componentsPanel.addMouseWheelListener(getMWL());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Sets the theme from the JMenu mnThemes
		for(int i = 0; i < mnThemes.getItemCount(); i++)
			if(e.getActionCommand().equals("Theme_"+i+""))
				Utils.setTheme(mnThemes.getItem(i));
		// Sets the dev console color
		for(int i = 0; i < devConsoleColor.getItemCount(); i++)
			if(e.getActionCommand().equals("Color_"+i+"")) {
				DeveloperConsole.hue = 0.0f;
				Utils.devConsoleColor = Utils.DEV_CONSOLE_COLORS[i];
			}
		switch(e.getActionCommand()) {
			case "snow":
				toggleSnow();
				break;
			case "fps":
				toggleFPS();
				break;
			case "zoom":
				openZoomSettings();
				break;
			case "quick_login":
				openQuickLoginSettings();
				break;
			case "restart_client":
				Utils.restartApplication(null);
				break;
			case "item_list":
				//showItemList();
				Utils.showFrameMessage("Simple Message", "This will be completed soon. Remind Shan!");
				break;
			case "screenshot":
				Screenshot.takeScreenshot();
				break;
			case "show_loading_screen":
				showLoadingScreen();
				break;
		}
		
	}
	
	/**
	 * Sets the icon image.
	 */
	public void setIcon() {
		try {
			URL localURL = new URL("http://i.imgur.com/sRA8ljo.png");
			BufferedImage localBufferedImage = ImageIO.read(localURL);
			setIconImage(localBufferedImage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public MouseWheelListener getMWL() {
		return mWL;
	}

	private MouseWheelListener mWL = new MouseWheelListener() {

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int notches = e.getWheelRotation();
			if (Utils.zoomWithMouseWheel) {
				if (Utils.zoomEnabled) {
					/*if (Utils.manualZoomRatio != Utils.DEFAULT_MANUAL_ZOOM_RATIO) {
						Utils.manualZoomRatio = Utils.DEFAULT_MANUAL_ZOOM_RATIO;
					}*/
					if (notches < 0) { // scroll up with mouse wheel
						if (Utils.zoomRatio <= Utils.MAX_TRUE_ZOOM_IN_RATIO) {
							Utils.zoomRatio = Utils.MAX_TRUE_ZOOM_IN_RATIO;
						} else {
							Utils.zoomRatio -= 10;
						}
					} else if (Utils.zoomRatio >= Utils.MAX_TRUE_ZOOM_OUT_RATIO) {
						Utils.zoomRatio = Utils.MAX_TRUE_ZOOM_OUT_RATIO;
					} else {
						Utils.zoomRatio += 10;
					}
				} /*else if (notches < 0) { // scroll up with mouse wheel
					if (Utils.manualZoomRatio <= Utils.MAX_MANUAL_ZOOM_IN_RATIO)
						Utils.manualZoomRatio = Utils.MAX_MANUAL_ZOOM_IN_RATIO;
					else
						Utils.manualZoomRatio -= 50;
				} else if (Utils.manualZoomRatio >= Utils.MAX_MANUAL_ZOOM_OUT_RATIO) {
					Utils.manualZoomRatio = Utils.MAX_MANUAL_ZOOM_OUT_RATIO;
				} else {
					Utils.manualZoomRatio += 50;
				}*/
			}
		}

	};
	
	/**
	 * Toggles snow.
	 */
	private void toggleSnow() {
		if (Player.get == null) {
			Utils.showFrameMessage("Advice", "Make sure you're logged in before toggling this.");
			return;
		}
		Utils.snowClient = Utils.snowClient ? false : true;
		Class243.method3061(7);
		Node_Sub38_Sub39.aClass302_10500.method3523((byte) -46);
		Node_Sub38_Sub39.aClass302_10500.method3521((byte) -18);
		Node_Sub54.aClass338_7671.method3908(-32478);
		Class304.aClass215_3834.method2071(7);
		Node_Sub18.method2606(126);
		Utils.sendGameMessage("Snow being displayed? "+Utils.snowClient);
	}
	
	/**
	 * Toggles the frames per second.
	 */
	private void toggleFPS() {
		Utils.showingFPS = !Utils.showingFPS;
		Utils.sendGameMessage("FPS showing? "+Utils.showingFPS);
	}
	
	/**
	 * Changes the client's loading screen.
	 */
	private void showLoadingScreen() {
		Utils.showLoadingScreen = !Utils.showLoadingScreen;
		Utils.sendGameMessage("You will "+(Utils.showLoadingScreen ? "now" 
			: "NOT")+" see the loading screen. Restart the client for changes to take effect.");
	}

	/**
	 * Opens the zoom settings.
	 */
	private void openZoomSettings() {
		if (settings == null)
			settings = new ZoomSettingsFrame(this);
		else {
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					settings.setVisible(true);
					settings.toFront();
					settings.repaint();
				}
			});
		}
	}
	
	/*private void showItemList() {
		JFrame itemFrame = new JFrame("List of Items");
		itemFrame.setVisible(true);
		JList<ItemDefinitions> itemsList;
		DefaultListModel<ItemDefinitions> itemsListModel;
		itemsListModel = new DefaultListModel<ItemDefinitions>();
		itemsList = new JList<ItemDefinitions>(itemsListModel);
		itemsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		itemsList.setLayoutOrientation(JList.VERTICAL);
		itemsList.setVisibleRowCount(-1);
		JScrollPane itemListscrollPane = new JScrollPane(itemsList);
		itemListscrollPane.setBounds(15, 15, 335, 490);
		itemFrame.add(itemListscrollPane);
		for (int id = 0; id < CacheUtils.getItemsSize(); id++)
			addItemListModel(ItemDefinition.get(Cache.INSTANCE, id));
	}*/ // This is not complete
	
	/**
	 * Opens the quick login settings
	 */
	private void openQuickLoginSettings() {
		if (quickLoginSettings == null)
			quickLoginSettings = new QuickLoginSettingsFrame(this);
		else {
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					quickLoginSettings.setVisible(true);
					quickLoginSettings.toFront();
					quickLoginSettings.repaint();
				}
			});
		}
	}

}
