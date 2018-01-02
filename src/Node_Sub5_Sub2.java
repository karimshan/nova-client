


/* Node_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub5_Sub2 extends Node_Sub5 {
	public static Class49[] aClass49Array9413 = null;
	public static int anInt9409;
	public static int anInt9410;
	public static int anInt9412 = 0;
	public static int anInt9416;
	public static int anInt9417;
	public static int anInt9418;

	public static void method2274(byte b) {
		if (b > -126)
			anInt9412 = -102;
		aClass49Array9413 = null;
	}

	protected long aLong9415;
	protected int anInt9408;
	protected int anInt9411;
	protected int anInt9414;

	protected int anInt9419;

	Node_Sub5_Sub2() {
		/* empty */
	}

	@Override
	public final int method2267(boolean bool) {
		anInt9410++;
		if (bool != true)
			return -21;
		return anInt9419;
	}

	@Override
	public final int method2270(int i) {
		if (i != 2)
			method2274((byte) -63);
		anInt9416++;
		return anInt9411;
	}

	@Override
	public final int method2271(byte b) {
		anInt9418++;
		if (b != -111)
			method2272(77);
		return anInt9414;
	}

	@Override
	public final int method2272(int i) {
		anInt9409++;
		if (i != 5)
			return -83;
		return anInt9408;
	}

	@Override
	public final long method2273(byte b) {
		if (b != -69)
			method2271((byte) 45);
		anInt9417++;
		return aLong9415;
	}
}
