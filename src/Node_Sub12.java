


/* Node_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub12 extends Node implements Interface21 {
	public static boolean aBoolean5456 = false;
	public static float aFloat5450;
	public static int anInt5448;
	public static int anInt5449;
	public static int anInt5451;
	public static int anInt5452;
	public static int anInt5453 = -2;
	public static int anInt5455;
	public static int anInt5457;
	public static int anInt5460;
	public static int anInt5464;
	public static int[] anIntArray5459 = new int[1];
	static {
		aFloat5450 = 0.0F;
		anInt5464 = 1;
	}

	public static void method2544(int i) {
		if (i != 121)
			method2545(105, 43);
		anIntArray5459 = null;
	}

	public static final int method2545(int i, int i_0_) {
		anInt5457++;
		i = (0x55555555 & i >>> 1) + (0x55555555 & i);
		i = (i_0_ & i) - -((~0x33333331 & i) >>> 2);
		i = 0xf0f0f0f & i - -(i >>> 4);
		i += i >>> 8;
		i += i >>> 16;
		return i & 0xff;
	}

	public char aChar5458;
	public long aLong5461;

	public int anInt5454;
	public int anInt5462;
	public int anInt5463;

	public Node_Sub12() {
		/* empty */
	}

	@Override
	public final int method75(int i) {
		if (i != -29764)
			anIntArray5459 = null;
		anInt5448++;
		return anInt5454;
	}

	@Override
	public final long method76(int i) {
		anInt5452++;
		if (i != -31100)
			anInt5455 = 60;
		return aLong5461;
	}

	@Override
	public final char method77(int i) {
		anInt5451++;
		if (i != -24069)
			method79(true);
		return aChar5458;
	}

	@Override
	public final int method78(int i) {
		@SuppressWarnings("unused")
		int i_1_ = -17 % ((6 - i) / 62);
		anInt5449++;
		return anInt5462;
	}

	@Override
	public final int method79(boolean bool) {
		anInt5460++;
		if (bool != false)
			return 68;
		return anInt5463;
	}
}
