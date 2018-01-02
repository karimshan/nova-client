
/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IncomingPacket {

	public static int anInt2354;
	public static int anInt2356;
	public static int anInt2358;

	public static void method1952(int i) {

	}

	public static final void method1954(byte b) {
		anInt2358++;
		int i = 0;
		for (int i_2_ = 0; (Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++)
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff); i_3_++) {
				if (Node_Sub38_Sub19.method2849(-47, i_3_, Class175.aClass261ArrayArrayArray2099, i, i_2_, true))
					i++;
				if (i >= 512)
					return;
			}
	}

	protected int anInt2355;

	private int anInt2357;

	IncomingPacket(int opcode, int opcodeSize) {
		anInt2357 = opcode;
		anInt2355 = opcodeSize;
	}

	public final int method1953(int i) {
		anInt2356++;
		if (i <= 17)
			return 7;
		return anInt2357;
	}

	@Override
	public final String toString() {
		anInt2354++;
		return "";
	}
}
