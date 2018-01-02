


/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class186 {
	public static boolean aBoolean2255 = false;
	public static boolean aBoolean2259 = false;
	public static Class112 aClass112_2256;
	public static Class239 aClass239_2249;
	public static Class61 aClass61_2247;
	public static int anInt2246;
	public static int anInt2248;
	public static int anInt2250;
	public static int anInt2252;
	public static int anInt2253;
	public static int anInt2254;
	public static int anInt2261;
	public static IComponentDefinitions aWidget2257 = null;
	static {
		aClass61_2247 = new Class61(32);
	}

	public static final void method1870(byte b, Actor actor) {
		anInt2253++;
		Animator animator = actor.anAnimator10876;
		if ((Class174.clientCycle ^ 0xffffffff) == (actor.toSecondTileTicketDelay ^ 0xffffffff)
				|| !animator.method245(-124) || animator.method226((byte) -105, 1)) {
			int i = -actor.toFirstTileTicketDelay + actor.toSecondTileTicketDelay;
			int i_0_ = -actor.toFirstTileTicketDelay + Class174.clientCycle;
			int i_1_ = actor.toFirstTileX * 512 - -(256 * actor.getSize((byte) 124));
			int i_2_ = 512 * actor.toFirstTileY - -(actor.getSize((byte) 89) * 256);
			int i_3_ = 512 * actor.toSecondTileX - -(actor.getSize((byte) 107) * 256);
			int i_4_ = actor.toSecondTileY * 512 - -(actor.getSize((byte) 115) * 256);
			actor.anInt5934 = (i_3_ * i_0_ + i_1_ * (i - i_0_)) / i;
			actor.anInt5940 = (i_0_ * i_4_ + i_2_ * (-i_0_ + i)) / i;
		}
		actor.anInt10901 = 0;
		if (actor.forceMovementDirection == 0)
			actor.method849(8192, -97, false);
		if (actor.forceMovementDirection == 1)
			actor.method849(12288, -83, false);
		if ((actor.forceMovementDirection ^ 0xffffffff) == -3)
			actor.method849(0, -117, false);
		if (b <= 16)
			method1870((byte) -110, null);
		if ((actor.forceMovementDirection ^ 0xffffffff) == -4)
			actor.method849(4096, -120, false);
	}

	public static void method1874(byte b) {
		aWidget2257 = null;
		aClass61_2247 = null;
		aClass239_2249 = null;
		if (b < -14)
			aClass112_2256 = null;
	}

	private Index aClass302_2251;

	protected Index aClass302_2260;

	protected Class61 aClass61_2258 = new Class61(20);

	private Class61 aClass61_2262 = new Class61(64);

	Class186(Class353 class353, int i, Index class302, Index class302_7_) {
		aClass302_2251 = class302;
		aClass302_2260 = class302_7_;
		aClass302_2251.method3537(-2, 46);
	}

	public final void method1871(int i) {
		synchronized (aClass61_2262) {
			if (i < 108)
				method1873(80, 69);
			aClass61_2262.method608(false);
		}
		anInt2252++;
		synchronized (aClass61_2258) {
			aClass61_2258.method608(false);
		}
	}

	public final void method1872(int i) {
		synchronized (aClass61_2262) {
			if (i != 512)
				aClass302_2251 = null;
			aClass61_2262.method602((byte) -119);
		}
		anInt2248++;
		synchronized (aClass61_2258) {
			aClass61_2258.method602((byte) -120);
		}
	}

	public final void method1873(int i, int i_5_) {
		anInt2254++;
		synchronized (aClass61_2262) {
			aClass61_2262.method598(i_5_, -11819);
		}
		if (i >= -68)
			aClass302_2251 = null;
		synchronized (aClass61_2258) {
			aClass61_2258.method598(i_5_, -11819);
		}
	}

	public final Class255 method1875(int i, int i_6_) {
		anInt2246++;
		Class255 class255;
		synchronized (aClass61_2262) {
			class255 = (Class255) aClass61_2262.method607(i, 0);
		}
		if (class255 != null)
			return class255;
		byte[] bs;
		synchronized (aClass302_2251) {
			bs = aClass302_2251.method3524(false, i, 46);
		}
		class255 = new Class255();
		class255.aClass186_3217 = this;
		if (bs != null)
			class255.method3118(false, new BufferedStream(bs));
		synchronized (aClass61_2262) {
			if (i_6_ != 1)
				method1870((byte) 127, null);
			aClass61_2262.method601(class255, i_6_ + 25565, i);
		}
		return class255;
	}
}
