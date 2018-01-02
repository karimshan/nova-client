


/* CacheNode_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub2 extends CacheNode {
	public static Class329 aClass329_9436 = new Class329("LOCAL", "", "local", 4);
	public static Class357 aClass357_9438;
	public static int anInt9430;
	public static int anInt9431;
	public static int anInt9433;
	public static int anInt9435;
	public static int anInt9437;

	public static void method2286(int i) {
		aClass357_9438 = null;
		if (i != -9303)
			aClass357_9438 = null;
		aClass329_9436 = null;
	}

	protected int anInt9429;
	protected int itemAmount;
	protected int itemId;

	protected String text;

	CacheNode_Sub2(int i, long l) {
		aLong2797 = l | (long) i << 56;
	}

	public final long method2287(int i) {
		if (i != 13)
			return -50L;
		anInt9433++;
		return aLong7037 & 0x7fffffffffffffffL;
	}

	public final void method2288(int i) {
		aLong7037 |= ~0x7fffffffffffffffL;
		anInt9430++;
		if (method2287(13) == i)
			Class72.aClass158_974.method1719(true, this);
	}

	public final int method2289(int i) {
		anInt9437++;
		if (i != 255)
			text = null;
		return (int) (0xffL & aLong2797 >>> 56);
	}

	public final long method2290(int i) {
		anInt9431++;
		if (i <= 79)
			method2288(40);
		return 0xffffffffffffffL & aLong2797;
	}

	public final void method2291(byte b) {
		if (b != 121)
			itemId = 69;
		aLong7037 = Class313.method3650(false) + 500L | aLong7037 & ~0x7fffffffffffffffL;
		anInt9435++;
		Node_Sub5.aClass158_7027.method1719(true, this);
	}
}
