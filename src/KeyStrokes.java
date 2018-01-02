


/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class KeyStrokes {

	public static float aFloat3666 = 0.0F;
	public static int anInt3668;
	public static int[] anIntArray3665;
	public static short aShort3667;

	static {
		anIntArray3665 = null;
		aShort3667 = (short) 1;
	}

	public static void method3451(int i) {
		if (i != 1)
			method3451(-10);
		anIntArray3665 = null;
	}

	public KeyStrokes() {
		/* empty */
	}

	public abstract boolean isKeyHeld(int i, int i_0_);

	public abstract Interface21 method3449(int i);

	public abstract void method3452(byte b);

	public abstract void method3453(byte b);
}
