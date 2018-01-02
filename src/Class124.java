


/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class124 {
	public static IncomingPacket TRAY_ICON_MESSAGE = new IncomingPacket(79, -2);
	public static int anInt1603;
	public static int anInt1604;

	public static final void method1525(int i) {
		anInt1604++;
		if (Class252.loadingBar != null) {
			Class243.aClass340_3069 = new Class340();
			Class243.aClass340_3069.method3954(Class252.loadingBar.anInt1383,
					Class252.loadingBar.aClass22_1379.getMessage(Class35.language), Class252.loadingBar, -93,
					Class43.aLong663);
			Class132.aThread1677 = new Thread(Class243.aClass340_3069, "");
			if (i <= 31)
				TRAY_ICON_MESSAGE = null;
			Class132.aThread1677.start();
		}
	}

	public static void method1526(boolean bool) {
		if (bool == true)
			TRAY_ICON_MESSAGE = null;
	}

	protected int anInt1602;

	Class124(int i) {
		anInt1602 = i;
	}

	@Override
	public final String toString() {
		anInt1603++;
		throw new IllegalStateException();
	}
}
