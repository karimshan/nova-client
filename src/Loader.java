

import java.applet.Applet;
import java.awt.BorderLayout;
import java.io.File;
import java.net.URL;
import java.util.Properties;
import java.util.Random;

import javax.swing.JPanel;

/**
 *
 * @author Multiple Authors
 *
 */
public class Loader extends Applet {
	
	/**
	 * @serialField
	 */
	private static final long serialVersionUID = -2583565644119993647L;

	public static final boolean DISABLE_USELESS_PACKETS = false;

	public static int PORT_ID = 43594;
	public static Properties properties = new Properties();
	public static final String SERVER_IP = "0.0.0.0";//"47.188.247.119";
	public static final int SUB_BUILD = 1;
	public static final String WEBSITE = "google.com";

	public static NovaFrame novaFrame;

	public static boolean deleteDirectory(File path) {
		if (path.exists()) {
			File[] files = path.listFiles();
			for (File file : files)
				if (file.isDirectory())
					deleteDirectory(file);
				else
					file.delete();
		}
		return (path.delete());
	}

	public static String generateString(Random rng, String characters, int length) {
		char[] text = new char[length];
		for (int i = 0; i < length; i++)
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		return new String(text);
	}

	public static String getWebClientCachePath() {
		return new StringBuilder(System.getProperty("user.home")).append("/Nova").toString();
	}

	public static void main(String[] strings) throws Exception {
		Utils.loadPreferences();
		Loader loader = new Loader();
		loader.doFrame();
		Utils.addTicks();
	}

	public static boolean newInterface(int id) {
		if (id > 1144)
			return true;
		switch (id) {
		case 320:
		case 751:
			return true;
		default:
			return false;
		}
	}

	public JPanel componentsPanel;

	public JPanel gamePanel = new JPanel();

	public void doFrame() {
		setParms();
		openFrame();
		drawClient();// TODO when making client public, change this back
	} // I love you that is all <3

	void drawClient() {
		try {
			GameStub.provideLoaderApplet(this);
			ConnectionDecoder clnt = new ConnectionDecoder();
			clnt.init();
			clnt.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public URL getCodeBase() {
		URL url;
		try {
			url = new URL("http://" + SERVER_IP);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return url;
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public String getParameter(String string) {
		return (String) properties.get(string);
	}

	@Override
	public void init() {
		loadApplet();
	}

	void loadApplet() {
		setParms();
		drawClient();
	}

	private void openFrame() {
		Utils.setDefaultTheme();
		// Before main stuff is loaded, let us choose port ID!
		/*new PortChooser();
		Ticks.load();
		Ticks.add(new Tick(.6) {
			public void run() {
				if(PortChooser.selected) {
					componentsPanel = new JPanel();
					componentsPanel.setLayout(new BorderLayout());
					componentsPanel.add(gamePanel, BorderLayout.CENTER);
					novaFrame = new NovaFrame(componentsPanel);
					novaFrame.setVisible(true);
					Ticks.load();
					drawClient();
					stop();
				}
			}
		});*/
		gamePanel.setLayout(new BorderLayout());
		gamePanel.add(this);
		componentsPanel = new JPanel();
		componentsPanel.setLayout(new BorderLayout());
		componentsPanel.add(gamePanel, BorderLayout.CENTER);
		novaFrame = new NovaFrame(componentsPanel);
		novaFrame.setVisible(true);
		Ticks.load();  // TODO un-comment all of this when making client public
	}

	void setParms() {
		properties.put("cabbase", "g.cab");
		properties.put("java_arguments", Utils.JVM_ARGS
				+ " -Xss2m -XshowSettings:properties -version -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		properties.put("colourid", "0");
		properties.put("worldid", "1");
		properties.put("lobbyid", "1");
		properties.put("lobbyaddress", SERVER_IP);
		properties.put("demoid", "0");
		properties.put("demoaddress", "");
		properties.put("modewhere", "0");
		properties.put("modewhat", "0");
		properties.put("lang", "0");
		properties.put("objecttag", "0");
		properties.put("js", "1");
		properties.put("game", "0");
		properties.put("affid", "0");
		properties.put("advert", "1");
		properties.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		properties.put("country", "0");
		properties.put("haveie6", "0");
		properties.put("havefirefox", "1");
		properties.put("cookieprefix", "");
		properties.put("cookiehost", SERVER_IP);
		properties.put("cachesubdirid", "0");
		properties.put("crashurl", "");
		properties.put("unsignedurl", "");
		properties.put("sitesettings_member", "1");
		properties.put("frombilling", "false");
		properties.put("sskey", "");
		properties.put("force64mb", "false");
		properties.put("worldflags", "8");
	}

}
