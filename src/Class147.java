

/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class147 {
	public static boolean[] aBooleanArray1820;
	public static float aFloat1824;
	public static int anInt1822;
	public static int anInt1823;
	public static Object[] anObjectArray1821;

	public static void method1648(boolean bool) {
		aBooleanArray1820 = null;
		if (bool != true)
			aBooleanArray1820 = null;
		anObjectArray1821 = null;
	}

	public static final boolean method1649(int i, int i_1_, int i_2_) {
		anInt1823++;
		if (i >= -87)
			return false;
		if ((i_2_ & 0x800 ^ 0xffffffff) == -1 || (0x37 & i_1_ ^ 0xffffffff) == -1)
			return false;
		return true;
	}
}
