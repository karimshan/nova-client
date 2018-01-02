
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Node_Sub42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class DeveloperConsole extends Node {

	public static OutgoingPacket aClass318_7523 = new OutgoingPacket(66, 3);
	public static OutgoingPacket aClass318_7526 = new OutgoingPacket(61, 8);
	public static int anInt7520;
	public static int anInt7524;
	public static int anInt7525;
	public static int anInt7527;

	public static final void displayConsoleSprites(GraphicsToolkit graphicstoolkit, int i) {
		anInt7525++;
		int i_1_ = 0;
		int height = 0;
		if (Class71.aBoolean967) {
			i_1_ = Class67.method733(-82);
			height = Class226.method2112(256);
		}
		graphicstoolkit.KA(i_1_, height, Class360.screenWidth - -i_1_, height + 350);
		int color = Utils.devConsoleColor.equals("alternating") ? getChangingColors() : Integer.decode(Utils.devConsoleColor);
		if (color > -1)
			graphicstoolkit.aa(i_1_, height, Class360.screenWidth, 350,
					color | Class298.anInt3740 << 24, 1);
		Class362.method4053(height, 350 + height, i_1_, (byte) -108, Class360.screenWidth + i_1_);
		int i_3_ = 350 / PlayerMasks.devConsoleSprite;
		if ((Class144_Sub4.anInt6848 ^ 0xffffffff) < -1) {
			int i_4_ = 346 - (PlayerMasks.devConsoleSprite + 4);
			int i_5_ = i_3_ * i_4_ / (-1 + i_3_ + Class144_Sub4.anInt6848);
			int i_6_ = 4;
			if (Class144_Sub4.anInt6848 > 1)
				i_6_ += (-Class118.anInt5406 + -1 + Class144_Sub4.anInt6848) * (i_4_ + -i_5_)
						/ (-1 + Class144_Sub4.anInt6848);
			graphicstoolkit.aa(-16 + (i_1_ - -Class360.screenWidth), height + i_6_, 12, i_5_,
					Class298.anInt3740 << 24 | color, 2);
			for (int i_7_ = Class118.anInt5406; Class118.anInt5406 - -i_3_ > i_7_; i_7_++) {
				if (Class144_Sub4.anInt6848 <= i_7_)
					break;
				String[] strings = Class106.method1120((byte) 46, Class210.messageLength[i_7_], '\010');
				int i_8_ = (Class360.screenWidth + -8 - 16) / strings.length;
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_9_++) {
					int i_10_ = i_9_ * i_8_ + 8;
					graphicstoolkit.KA(i_10_ + i_1_, height, -8 + (i_10_ + i_1_ - -i_8_), 350 + height);
					StandardSprite.aClass52_8945.method538(i_1_ + i_10_,
							-Class169_Sub3.aClass357_8820.anInt4442 + (-2 + height + (350 + -Class347.anInt4282)
									+ -((i_7_ + -Class118.anInt5406) * PlayerMasks.devConsoleSprite)),
							Class188_Sub2_Sub2.method1914(strings[i_9_], 42), -16777216, 1, -1);
				}
			}
		}
		CacheNode_Sub18.aClass52_9609.displayInterText(Class360.screenWidth + (i_1_ - 25), Utils.BUILD, -1,
				-16777216, height + 350 - 20);
		graphicstoolkit.KA(i_1_, height, Class360.screenWidth + i_1_, 350 + height);
		graphicstoolkit.method1242(height + 350 - Class347.anInt4282, -1, i_1_, false, Class360.screenWidth);
		Class262_Sub4.abstractFont.method538(i_1_ + 10,
				height - (-350 + Class262_Sub15_Sub1.aClass357_10524.anInt4442 + 1),
				"<col=" + Utils.DEV_CONSOLE_COMMAND_MESSAGE_COLOR + ">" + Utils.DEV_CONSOLE_COMMAND_MESSAGE
						+ "</col> " + Class188_Sub2_Sub2.method1914(Node_Sub10.aString7081, 51),
				-16777216, 1, -1);
		if (i >= -29)
			anInt7527 = -2;
		if (Class51.aBoolean5331) {
			int i_11_ = -1;
			if ((Class174.clientCycle % 30 ^ 0xffffffff) < -16)
				i_11_ = 16777215;
			graphicstoolkit.method1243(12, height + 350 - Class262_Sub15_Sub1.aClass357_10524.anInt4442 + -11, i_11_,
					Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6,
							"<col=" + Utils.DEV_CONSOLE_COMMAND_MESSAGE_COLOR + ">"
									+ Utils.DEV_CONSOLE_COMMAND_MESSAGE + "</col> " + Class188_Sub2_Sub2
											.method1914(Node_Sub10.aString7081, -118).substring(0, Class315.anInt4034))
							+ 10 + i_1_,
					2);
		}
	}

	public static void method2933(int i) {
		aClass318_7523 = null;
		if (i == -3239)
			aClass318_7526 = null;
	}

	public static final Class151[] method2934(int i) {
		if (i >= -6)
			anInt7527 = -24;
		anInt7524++;
		return new Class151[] { Class216.aClass151_2550, Node_Sub44.aClass151_7549, Node_Sub38_Sub33.aClass151_10439,
				ClanChat.aClass151_756, Class35.aClass151_535, Class345.aClass151_4267, Node_Sub8.aClass151_7066,
				Class194.aClass151_2372, Node_Sub39.aClass151_7493, Class150_Sub1.aClass151_8949,
				PlayerUpdateReference.aClass151_4080, Class50.aClass151_781, Node_Sub20.aClass151_7178,
				Class374.aClass151_4614 };
	}

	public static final boolean method2935(byte b, int i, int i_0_) {
		anInt7520++;
		if (i_0_ >= 1000 && (i ^ 0xffffffff) > -1001)
			return true;
		if (i_0_ < 1000 && (i ^ 0xffffffff) > -1001) {
			if (Node_Sub27.method2699(18, i))
				return true;
			if (Node_Sub27.method2699(18, i_0_))
				return false;
			return true;
		}
		if (i_0_ >= 1000 && (i ^ 0xffffffff) <= -1001)
			return true;
		if (b != 69)
			method2934(85);
		return false;
	}

	/**
	 * Prints a message on the console.
	 * @param b
	 * @param string
	 */
	public static final void printConsoleMessage(byte b, String string) {
		Node_Sub7.anInt7062++;
		if (Class210.messageLength == null)
			prepareDevConsole();
		Class247.aCalendar3144.setTime(new Date(Class313.method3650(false)));
		if (b != 43)
			Node_Sub7.anInt7063 = -16;
		String[] strings = Class106.method1120((byte) -113, string, '\n');
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_3_++) {
			for (int i_4_ = Class144_Sub4.anInt6848; i_4_ > 0; i_4_--)
				Class210.messageLength[i_4_] = Class210.messageLength[-1 + i_4_];
			DateFormat d = new SimpleDateFormat("MM/dd/yyyy - h:mm a");
			String date = d.format(new Date());
			Class210.messageLength[0] = "[" + date + "]: " + string;
			if (Class270_Sub1.aFileOutputStream8027 != null)
				try {
					Class270_Sub1.aFileOutputStream8027
							.write(Class320_Sub21.method3763(-128, Class210.messageLength[0] + "\n"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			if ((Class144_Sub4.anInt6848 ^ 0xffffffff) > (Class210.messageLength.length + -1 ^ 0xffffffff)) {
				Class144_Sub4.anInt6848++;
				if ((Class118.anInt5406 ^ 0xffffffff) < -1)
					Class118.anInt5406++;
			}
		}
	}
	
	/**
	 * Prepares the dev console for the first time.
	 * @param i
	 */
	public static final void prepareDevConsole() {
		PlayerMasks.devConsoleSprite = 2 + (Class169_Sub3.aClass357_8820.anInt4434 - 
			-Class169_Sub3.aClass357_8820.anInt4442);
		Class210.messageLength = new String[500];
		Class347.anInt4282 = Class262_Sub15_Sub1.aClass357_10524.anInt4442 + 
			Class262_Sub15_Sub1.aClass357_10524.anInt4434 - -2;
		for (int length = 0; length < Class210.messageLength.length; length++)
			Class210.messageLength[length] = "";
		DeveloperConsole.printConsoleMessage((byte) 43, Utils.DEV_CONSOLE_START_MESSAGE);
	}

	/**
	 * Prints a console message.
	 * @param s
	 */
	public static final void printConsoleMessage(String s) {
		printConsoleMessage((byte) 43, s);
	}

	protected int anInt7521;

	protected String aString7522;

	public DeveloperConsole() {
		/* empty */
	}

	DeveloperConsole(String string, int i) {
		anInt7521 = i;
		aString7522 = string;
	}
	
	private static boolean openedDevConsole = false;

	/**
	 * Opens the developer console.
	 */
	public static final void openDevConsole() {
		if (Class350.method3993((byte) 108)) {
			if (Class210.messageLength == null)
				prepareDevConsole();
			Class298.anInt3740 = 0;
			openedDevConsole = true;
		}
	}
	
	/**
	 * Has the player opened the dev console or not.
	 * @return
	 */
	public static final boolean hasOpenedDevConsole() {
		return openedDevConsole;
	}
	
	/**
	 * Closes the dev console.
	 */
	public static final void closeDevConsole() {
		openedDevConsole = false;
		Class320_Sub21.method3764(-122);
	}
	
	/**
	 * Changes the hue continuously
	 */
	public static float hue = 0.0f;
	
	/**
	 * Changing colors
	 * @return
	 */
	public static int getChangingColors() {
		hue += 0.0005;
		Color base = new Color(Color.HSBtoRGB(hue, 1.0f, 1.0f));
		Color color = new Color(base.getRed(), base.getGreen(), base.getBlue(), 125);
		return color.getRGB();
	}
	
}
