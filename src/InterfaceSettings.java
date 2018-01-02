


/* Node_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class InterfaceSettings extends Node {
	public static Class135 aClass135_7421 = new Class135();
	public static IncomingPacket aClass192_7420 = new IncomingPacket(140, -2);
	public static int anInt7412;
	public static int anInt7414;
	public static int anInt7415;
	public static int anInt7416;
	public static int anInt7417;
	public static int anInt7419;

	public static void method2749(int i) {
		aClass135_7421 = null;
		aClass192_7420 = null;
		if (i != 1914561)
			method2749(-83);
	}

	protected int anInt7413;

	protected int settingsHash;

	InterfaceSettings(int i, int i_0_) {
		anInt7413 = i_0_;
		settingsHash = i;
	}

	public final int method2743(int i) {
		anInt7415++;
		if (i >= -20)
			anInt7413 = -17;
		return Animable_Sub4.method925(settingsHash, 34933);
	}

	public final boolean method2744(byte b) {
		anInt7416++;
		if (b < 70)
			return true;
		if ((0x1 & settingsHash >> 22) == 0)
			return false;
		return true;
	}

	public final int method2745(int i) {
		if (i > -70)
			aClass192_7420 = null;
		anInt7414++;
		return (0x1d36c1 & settingsHash) >> 18;
	}

	public final boolean method2746(int i) {
		if (i != 9336)
			method2743(115);
		anInt7419++;
		if ((0x1 & settingsHash ^ 0xffffffff) == -1)
			return false;
		return true;
	}

	public final boolean method2747(int i) {
		if (i != 1)
			settingsHash = -80;
		anInt7412++;
		if ((0x1 & settingsHash >> 21) == 0)
			return false;
		return true;
	}

	public final boolean method2748(byte b, int i) {
		if (b >= -33)
			return true;
		anInt7417++;
		if ((0x1 & settingsHash >> i + 1) == 0)
			return false;
		return true;
	}
}
