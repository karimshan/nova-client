



/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class187 {
	public static IncomingPacket SPRITE_ON_INTERFACE;
	public static OutgoingPacket aClass318_2277;
	public static long aLong2275 = 1L;
	public static int anInt2267;
	public static int anInt2268;
	public static int anInt2270;
	public static int anInt2271;
	public static int anInt2272;
	public static int anInt2273;
	public static int anInt2274;
	public static int anInt2276;
	static {
		SPRITE_ON_INTERFACE = new IncomingPacket(2, 6);
		anInt2276 = -1;
		aClass318_2277 = new OutgoingPacket(23, 1);
	}

	public static final void method1876(int i, long l) {
		if (i == -1) {
			anInt2272++;
			Class141.aCalendar1754.setTime(new Date(l));
		}
	}

	public static final int method1879(int i) {
		int i_0_ = -1;
		for (int i_1_ = 0; i_1_ < Class290.anInt3655 - 1; i_1_++)
			if (i < Node_Sub38_Sub25.anIntArray10358[i_1_] + Client.anIntArray8039[i_1_]) {
				i_0_ = i_1_;
				break;
			}
		if (i_0_ == -1)
			i_0_ = Class290.anInt3655 - 1;
		return i_0_;
	}

	public static void method1880(byte b) {
		SPRITE_ON_INTERFACE = null;
		if (b > -126)
			method1882(-3, -66);
		aClass318_2277 = null;
	}

	public static final boolean method1882(int i, int i_4_) {
		if (i > 0)
			return true;
		anInt2274++;
		if (i_4_ != 2 && i_4_ != 3)
			return false;
		return true;
	}

	private boolean aBoolean2266;

	private boolean aBoolean2269;

	private int anInt2263;

	private int anInt2264;

	Class187(boolean bool, int i, int i_2_, boolean bool_3_) {
		aBoolean2269 = bool;
		anInt2263 = i_2_;
		aBoolean2266 = bool_3_;
		anInt2264 = i;
	}

	public final int method1877(byte b) {
		if (b != 71)
			return 27;
		anInt2271++;
		return anInt2264;
	}

	public final boolean method1878(byte b) {
		if (b != 60)
			return false;
		anInt2268++;
		return aBoolean2266;
	}

	public final int method1881(byte b) {
		if (b != 25)
			return 8;
		anInt2273++;
		return anInt2263;
	}

	public final boolean method1883(int i) {
		anInt2270++;
		if (i <= 26)
			aBoolean2266 = false;
		return aBoolean2269;
	}
}
