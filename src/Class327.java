


/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class327 implements Interface16 {
	public static boolean aBoolean5347;
	public static int anInt5349;
	public static int anInt5350;
	public static int anInt5351;
	public static int anInt5352;
	public static int anInt5353;
	public static int anInt5355;
	public static int anInt5358;
	public static int anInt5360;
	public static int[] anIntArray5348 = new int[13];
	static {
		aBoolean5347 = false;
	}

	public static final Class377_Sub1 method3823(int i, int i_0_) {
		anInt5353++;
		if (i != 100)
			method3824(true);
		if (!Mobile.aBoolean9118 || (Mobile_Sub4.anInt10972 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)
				|| Node_Sub9_Sub5.anInt9757 < i_0_)
			return null;
		return Class56.aClass377_Sub1Array841[-Mobile_Sub4.anInt10972 + i_0_];
	}

	public static void method3824(boolean bool) {
		if (bool != true)
			method3823(90, -76);
		anIntArray5348 = null;
	}

	private boolean aBoolean5359;

	private Class55 aClass55_5354;

	private GraphicsToolkit aGraphicsToolkit5356;

	private Interface10[] anInterface10Array5357;

	Class327(Class55 class55, Class373 class373) {
		aClass55_5354 = class55;
		anInterface10Array5357 = new Interface10[aClass55_5354.anInterface7Array825.length];
		for (int i = 0; anInterface10Array5357.length > i; i++)
			anInterface10Array5357[i] = class373.method4105(122, aClass55_5354.anInterface7Array825[i]);
	}

	@Override
	public final int method58(int i) {
		anInt5351++;
		int i_2_ = 0;
		Interface10[] interface10s = anInterface10Array5357;
		if (i != 27285)
			anInterface10Array5357 = null;
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (interface10s.length ^ 0xffffffff); i_3_++) {
			Interface10 interface10 = interface10s[i_3_];
			if (interface10 == null || interface10.method25(421))
				i_2_++;
		}
		return i_2_ * 100 / anInterface10Array5357.length;
	}

	@Override
	public final void method59(int i) {
		if (i != 6312)
			anInterface10Array5357 = null;
		anInt5350++;
	}

	@Override
	public final int method60(int i) {
		anInt5349++;
		if (i < 25)
			anIntArray5348 = null;
		return aClass55_5354.anInt832;
	}

	@Override
	public final boolean method61(boolean bool, long l) {
		anInt5358++;
		if (bool != false)
			aBoolean5359 = false;
		if ((Class313.method3650(false) ^ 0xffffffffffffffffL) > (aClass55_5354.anInt831 + l ^ 0xffffffffffffffffL))
			return false;
		return true;
	}

	@Override
	public final void method62(int i) {
		if (aGraphicsToolkit5356 != Class93.graphicsToolkit) {
			aGraphicsToolkit5356 = Class93.graphicsToolkit;
			aBoolean5359 = true;
		}
		anInt5355++;
		aGraphicsToolkit5356.GA(0);
		if (i == 1939) {
			Interface10[] interface10s = anInterface10Array5357;
			for (int i_1_ = 0; (interface10s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				Interface10 interface10 = interface10s[i_1_];
				if (interface10 != null)
					interface10.method26(i + -1840);
			}
		}
	}

	@Override
	public final void method63(boolean bool, byte b) {
		anInt5352++;
		bool = true;
		Interface10[] interface10s = anInterface10Array5357;
		for (Interface10 interface10 : interface10s) {
			if (interface10 != null)
				interface10.method27(bool || aBoolean5359, 109);
		}
		aBoolean5359 = false;
		if (b >= -61)
			method61(true, -87L);
	}
}
