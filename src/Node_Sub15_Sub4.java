


/* Node_Sub15_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub4 extends Node_Sub15 {
	public static Class124 aClass124_9793 = new Class124(255);
	public static int anInt9792;
	public static int anInt9794;
	public static int anInt9795;
	public static int anInt9797;
	public static int anInt9798 = -1;
	public static int anInt9800;
	public static int anInt9801;
	public static int[] anIntArray9802 = new int[500];
	public static int[][] anIntArrayArray9799;
	static {
		anIntArrayArray9799 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 },
				{ 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 },
				{ 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 },
				{ 12, 12, 12, 12 } };
		anInt9801 = 0;
	}

	public static void method2565(int i) {
		anIntArrayArray9799 = null;
		anIntArray9802 = null;
		if (i != 1973)
			anIntArrayArray9799 = null;
		aClass124_9793 = null;
	}

	public static final int[] method2566(int i, int i_0_) {
		anInt9794++;
		int[] is = new int[3];
		Node_Sub43.method2941(6, Class25.method308(i, false));
		is[0] = Class141.aCalendar1756.get(5);
		is[1] = Class141.aCalendar1756.get(i_0_);
		is[2] = Class141.aCalendar1756.get(1);
		return is;
	}

	public static final void method2567(IComponentDefinitions widget, int i, byte b, int i_1_,
			GraphicsToolkit graphicstoolkit) {
		anInt9792++;
		int i_2_ = 63;
		if (b == -96) {
			int i_3_ = 7;
			for (int i_4_ = 63; (i_4_ ^ 0xffffffff) <= -1; i_4_--) {
				LoadingBarStage.method1132(b ^ ~0x5f, true, false);
				int i_5_ = 0x7f & i_2_ | (i_4_ << 10 & 0xfc00 | (i_3_ & 0x7) << 7);
				int i_6_ = Class85.anIntArray1158[i_5_];
				Class160.method1727(false, (byte) 127, true);
				graphicstoolkit.aa(i, ((-i_4_ + 63) * widget.anInt4695 >> 6) + i_1_, widget.anInt4809,
						(widget.anInt4695 >> 6) - -1, i_6_, 0);
			}
		}
	}

	private long aLong9796 = -1L;

	private String aString9791 = null;

	Node_Sub15_Sub4() {
		/* empty */
	}

	@Override
	public final void method2554(int i, BufferedStream buffer) {
		anInt9795++;
		if (buffer.readUnsignedByte() != 255) {
			buffer.offset--;
			aLong9796 = buffer.readLong();
		}
		aString9791 = buffer.readString2();
		if (i != 29147)
			anInt9800 = 123;
	}

	@Override
	public final void method2556(ClanChat clanchat, int i) {
		clanchat.method497(aString9791, aLong9796, -42);
		if (i != 16)
			method2556(null, 9);
		anInt9797++;
	}
}
