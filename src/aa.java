


/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class aa {
	
	public static boolean aBoolean104 = false;
	public static GLSprite aGLSprite102;
	public static int anInt100;
	public static int anInt101 = 0;
	public static int anInt103;

	public static void method158(int i) {
		if (i != 32)
			method159(79, (byte) 112, -107);
		aGLSprite102 = null;
	}

	public static final boolean method159(int i, byte b, int i_0_) {
		if (b != 105)
			aBoolean104 = true;
		anInt103++;
		if ((0x20 & i_0_) == 0)
			return false;
		return true;
	}

	public aa() {
		/* empty */
	}
}
