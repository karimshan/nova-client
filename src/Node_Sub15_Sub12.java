


/* Node_Sub15_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub12 extends Node_Sub15 {
	public static int anInt9861;
	public static int anInt9863;
	public static int anInt9864;
	public static int anInt9866;
	public static String aString9867;

	public static final int method2582(int i, int i_0_) {
		anInt9866++;
		if (i == 16711935)
			return -1;
		if (i_0_ != -1)
			method2583(null, (byte) -21);
		return Class96.method1075(-71, i);
	}

	public static final int method2583(String string, byte b) {
		if (b < 50)
			return -93;
		anInt9864++;
		return 2 + string.length();
	}

	public static void method2584(byte b) {
		@SuppressWarnings("unused")
		int i = -16 % ((b - -67) / 56);
		aString9867 = null;
	}

	private int anInt9865;

	private String aString9862;

	Node_Sub15_Sub12() {
		/* empty */
	}

	@Override
	public final void method2554(int i, BufferedStream buffer) {
		anInt9863++;
		anInt9865 = buffer.readInt();
		if (i != 29147)
			aString9862 = null;
		aString9862 = buffer.readString();
	}

	@Override
	public final void method2556(ClanChat clanchat, int i) {
		if (i != 16)
			anInt9865 = -104;
		clanchat.method492(aString9862, anInt9865, true);
		anInt9861++;
	}
}
