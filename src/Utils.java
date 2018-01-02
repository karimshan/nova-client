import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Properties;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.xml.bind.DatatypeConverter;

import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author K-Shan
 *
 */
public class Utils {
	
	/**
	 * The properties here.
	 */
	public static Properties PROPERTIES;
	public static final String PREF_PATH = "preferences.ini";
	
	// The path where screenshots are saved.
	public static final String SCREENSHOTS_PATH = System.getProperty("user.home") + "/Nova/screenshots/";

	/**
	 * Server related info
	 */
	public final static String BUILD = "Build: 667";
	public final static String QUIT_URL = "";
	public final static String SERVER_NAME = "Nova";
	public final static String WEBSITE = "";
	
	/**
	 * Information about quick login
	 */
	public static String quickLoginUsername = "";
	public static String quickLoginPassword = "";
	public static boolean autoLogin = false;
	// In order to re-display the text on login if the player logs out.
	public static boolean displayedQuickLogin = false;
	
	// The current theme of the UI
	public static String theme = "Nebula";

	// -1 is clear
	public static String devConsoleColor = "0x332277";
	public static final String[] DEV_CONSOLE_COLORS = { 
		"0x332277", "-1", "0xff0000", "0x00ff00", "0x0000ff", 
		"0xffff00", "0x00ffff", "0xDD1ABD", "0xffffff", "0x000000",
		"alternating" 
	};
	public static boolean snowClient = false;
	public static boolean showingFPS = false;
	// Whether to show overlay strings that look like the frames per second strings or not.
	public static boolean showStringOverlays = false;

	// True zoom ratio
	public static int zoomRatio = 320;
	public static boolean zoomEnabled = true;
	public static final int MAX_TRUE_ZOOM_IN_RATIO = 120;
	public static final int DEFAULT_TRUE_ZOOM_RATIO = 320;
	public static final int MAX_TRUE_ZOOM_OUT_RATIO = 420;
	
	// Enables or disables the loading screen when the client starts up.
	public static boolean showLoadingScreen = true;

	/**
	 * Other final modifiers
	 */
	public static final String JVM_ARGS = "-Xmx1024m";
	public static final int REVISION = 667;

	// The message that appears before typing in a command in the developer console. (Admins only)
	public static final String DEV_CONSOLE_COMMAND_MESSAGE = "Command:";
	public static final String DEV_CONSOLE_COMMAND_MESSAGE_COLOR = "00ff00";
	public static final String DEV_CONSOLE_START_MESSAGE = "Welcome to the Nova developer console.";

	// freezes the current frame
	public static final boolean FREEZE_FRAME = false;

	// If the player wants to zoom using mouse wheel or not.
	public static boolean zoomWithMouseWheel = true;
	
	// If the player can zoom with the pg up and down keys or not.
	public static boolean zoomWithPageKeys = false;

	// Below is if you want to zoom on both fixed and resizable
	// NO LONGER USING THIS
	public static final int ALT_ZOOM_RATIO = 600;
	public static final byte ALT_ZOOM_MULTIPLIER = 3;
	//private static boolean manualZoomEnabled = false;
	//private static final int MAX_MANUAL_ZOOM_IN_RATIO = -100;
	//private static final int DEFAULT_MANUAL_ZOOM_RATIO = 600;
	//private static final int MAX_MANUAL_ZOOM_OUT_RATIO = 1300;

	/**
	 * Clears the dev console.
	 */
	public static final void clearConsole() {
		Class118.anInt5406 = 0;
		Class144_Sub4.anInt6848 = 0;
	}

	/**
	 * 
	 * @param message
	 */
	public static final void printConsoleMessage(String message) {
		DeveloperConsole.printConsoleMessage(message);
	}

	/**
	 * Sends a client command to the server (Way to communicate back and forth)
	 * @param s
	 */
	public static void sendClientCommand(String s) {
		if(Player.get == null)
			return;
		Class331.anInt4137++;
		Commands.method1538(90, true, false, s);
	}
	
	/**
	 * Sends a game message to the player.
	 * @param s
	 */
	public static void sendGameMessage(String s) {
		if(Player.get != null)
			Class41.sendGameMessage(29459, s, 4);
	}
	
	/**
	 * 
	 * @param title
	 * @param message
	 */
	public static void showFrameMessage(String title, String message) {
		JOptionPane.showMessageDialog(null, message, title, 1); 
	}
	
	/**
	 * 
	 * @param url
	 */
	public static void openURL(String url) {
		String osName = System.getProperty("os.name");
		try {
			if (osName.startsWith("Windows")) {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			} else {
				String[] browsers = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
				String browser = null;
				for (int count = 0; (count < browsers.length) && (browser == null); count++)
					if (Runtime.getRuntime().exec(new String[] { "which", browsers[count] }).waitFor() == 0)
						browser = browsers[count];
				Runtime.getRuntime().exec(new String[] { browser, url });
			}
		} catch (Exception e) {
			System.err.println("Unable to open URL!");
		}
	}
	
	/**
	 * Sets a limit to the amount of jtextfield characters
	 * @param jtf
	 */
	public static void setTextFieldLimit(JTextField jtf, int limit) {
		jtf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if(jtf.getText().length() > limit
					&& !(e.getKeyChar() == KeyEvent.VK_DELETE || e.getKeyChar() == KeyEvent.VK_BACK_SPACE))
					e.consume();
			}
			
		});
	}
	
	/**
	 * Saves the player's preferences.
	 */
	public static final void savePreferences() {
		try {
			PROPERTIES.load(new FileInputStream(PREF_PATH));
			PROPERTIES.setProperty("dev_console_color", devConsoleColor);
			PROPERTIES.setProperty("show_snow", ""+snowClient);
			PROPERTIES.setProperty("show_fps", ""+showingFPS);
			PROPERTIES.setProperty("zoom_ratio", ""+zoomRatio);
			PROPERTIES.setProperty("enable_zoom", ""+zoomEnabled);
			PROPERTIES.setProperty("zoom_using_mouse", ""+zoomWithMouseWheel);
			PROPERTIES.setProperty("zoom_using_page_keys", ""+zoomWithPageKeys);
			PROPERTIES.setProperty("quick_login_username", quickLoginUsername);
			PROPERTIES.setProperty("quick_login_password", quickLoginPassword);
			PROPERTIES.setProperty("auto_login", ""+autoLogin);
			PROPERTIES.setProperty("theme", theme);
			PROPERTIES.setProperty("show_loading_screen", ""+showLoadingScreen);
			PROPERTIES.setProperty("show_string_overlays", ""+showStringOverlays);
			PROPERTIES.store(new FileOutputStream(PREF_PATH), "Client Preferences");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * loads player preferences.
	 */
	public static final void loadPreferences() {
		// Load properties here
		PROPERTIES = new Properties();
		try {
			File f = new File(PREF_PATH);
			if(!f.exists()) {
				f.createNewFile();
				savePreferences();
			}
			PROPERTIES.load(new FileInputStream(PREF_PATH));
			devConsoleColor = PROPERTIES.getProperty("dev_console_color");
			snowClient = Boolean.parseBoolean(PROPERTIES.getProperty("show_snow"));
			showingFPS = Boolean.parseBoolean(PROPERTIES.getProperty("show_fps"));
			zoomRatio = Integer.parseInt(PROPERTIES.getProperty("zoom_ratio"));
			zoomEnabled = Boolean.parseBoolean((String) PROPERTIES.getProperty("enable_zoom"));
			zoomWithMouseWheel = Boolean.parseBoolean((String) PROPERTIES.getProperty("zoom_using_mouse"));
			zoomWithPageKeys = Boolean.parseBoolean((String) PROPERTIES.getProperty("zoom_using_page_keys"));
			quickLoginUsername = PROPERTIES.getProperty("quick_login_username");
			quickLoginPassword = PROPERTIES.getProperty("quick_login_password");
			autoLogin = Boolean.parseBoolean((String) PROPERTIES.getProperty("auto_login"));
			theme = PROPERTIES.getProperty("theme");
			showLoadingScreen = Boolean.parseBoolean((String) PROPERTIES.getProperty("show_loading_screen"));
			showStringOverlays = Boolean.parseBoolean((String) PROPERTIES.getProperty("show_string_overlays"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Theme related
	
	/**
	 * Sets the default theme for the client.
	 */
	public static void setDefaultTheme() {
		try {
			// This is useful - gives more options when choosing a file.
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("org.jvnet.substance.skin.Substance"+Utils.theme.replace(" ", "")+"LookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			JPopupMenu.setDefaultLightWeightPopupEnabled(false);
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param component
	 */
	public static void setTheme(JMenuItem component) {
		Utils.theme = component.getText();
		final String theme = component.getText().replace(" ", "");
		try {
			SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin." + theme + "Skin");
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
		} catch (Exception e) {
			System.err.println("Substance error: " + e.getMessage());
		}
	}
	
	/**
	 * Restarts the client automatically.
	 *
	 * @param runBeforeRestart
	 * @throws IOException
	 */
	public static void restartApplication(Runnable runBeforeRestart) {
		try {
			savePreferences();
			// java binary
			String java = System.getProperty("java.home") + "/bin/java";
			// vm arguments
			List<String> vmArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
			StringBuffer vmArgsOneLine = new StringBuffer();
			for (String arg : vmArguments)
				// if it's the agent argument : we ignore it otherwise the
				// address of the old application and the new one will be in
				// conflict
				if (!arg.contains("-agentlib")) {
					vmArgsOneLine.append(arg);
					vmArgsOneLine.append(" ");
				}
			// init the command to execute, add the vm args
			final StringBuffer cmd = new StringBuffer("\"" + java + "\" " + vmArgsOneLine);

			// program main and program arguments
			String[] mainCommand = System.getProperty("sun.java.command").split(" ");
			// program main is a jar
			if (mainCommand[0].endsWith(".jar"))
				// if it's a jar, add -jar mainJar
				cmd.append("-jar " + new File(mainCommand[0]).getPath());
			else
				// else it's a .class, add the classpath and mainClass
				cmd.append("-cp \"" + System.getProperty("java.class.path") + "\" " + mainCommand[0]);
			// finally add program arguments
			for (int i = 1; i < mainCommand.length; i++) {
				cmd.append(" ");
				cmd.append(mainCommand[i]);
			}
			System.out.println((cmd.toString()));
			// execute the command in a shutdown hook, to be sure that all the
			// resources have been disposed before restarting the application
			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					try {
						Runtime.getRuntime().exec(cmd.toString());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			// execute some custom code before restarting
			if (runBeforeRestart != null)
				runBeforeRestart.run();
			// exit
			System.exit(0);
		} catch (Exception e) {
			// something went wrong
			System.out.println("Error while trying to restart the application: " + e.getMessage());
		}
	}
	
	// Some additional useful info
	
	/**
	 * 
	 * @param bytes
	 * @return
	 */
	public static final String bytesToHex(byte[] bytes) {
		return DatatypeConverter.printHexBinary(bytes);
	}
	
	/**
	 * 
	 * @param hex
	 * @return
	 */
	public static final byte[] hexToBytes(String hex) {
		return DatatypeConverter.parseHexBinary(hex);
	}
	
	/**
	 * 
	 * @param hexCode
	 * @return
	 */
	public static int hexToDecimal(String hexCode) {
        String digits = "0123456789ABCDEF";
        hexCode = hexCode.toUpperCase();
        int val = 0;
        for (int i = 0; i < hexCode.length(); i++) {
            char c = hexCode.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }


    /**
     * decimal has to be non-negative
     * @param decimal
     * @return
     */
    public static String decimalToHex(int decimal) {
        String digits = "0123456789ABCDEF";
        if (decimal == 0) return "0";
        String hex = "";
        while (decimal > 0) {
            int digit = decimal % 16;  // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            decimal = decimal / 16;
        }
        return hex;
    }

    /**
     * Runs the global Game Ticks.
     */
	public static void addTicks() {
		Ticks.submit(new GlobalTick());
	}
	
	/**
	 * Sends a string at x and y position of the applet with larger words
	 * @param x
	 * @param y
	 * @param text
	 */
	public static void sendStringOverlay(int x, int y, String text) {
		sendStringOverlay(x, y, text, true);
	}
	
	/**
	 * Sends a string at x and y position of the applet
	 * @param x
	 * @param y
	 * @param text
	 * @param largeText
	 */
	public static void sendStringOverlay(int x, int y, String text, boolean largeText) {
		if(largeText)
			StandardSprite.aClass52_8945.sendStringOverlay(x, y, text);
		else
			CacheNode_Sub18.aClass52_9609.displayInterText(x, text, -256, -1, y);
	}

	/**
	 * This will send string overlays on the screen.
	 */
	public static void sendStringOverlays() {
		sendStringOverlay(140, 50, "<col=ff0000>"+Player.get.displayName+"</col>: (50,000/50,000)", false);
		sendStringOverlay(128, 70, "<col=00ff00>Nex</col>: (30,000/30,000)", false);
	}
	
	/**
	 * Draws a tool tip box. (When you right click an NPC and get the "options")
	 * @param title
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param titleOffsetX
	 * @param titleOffsetY
	 */
	public static void drawBox(String title, int x, int y, int width, int height, int titleOffsetX, int titleOffsetY) {
		Class50.drawToolTipBox(width, height, title, Class93.graphicsToolkit, y, x, titleOffsetY, titleOffsetX);
	}
	
	/**
	 * Draws a tool tip box. (When you right click an NPC and get the "options")
	 * @param title
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param titleOffsetX
	 */
	public static void drawBox(String title, int x, int y, int width, int height, int titleOffsetX) {
		drawBox(title, x, y, width, height, titleOffsetX, 18);
	}

}
