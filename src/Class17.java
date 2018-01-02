


/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17 {
	public static float aFloat275;
	public static int anInt276;
	public static int anInt280;
	public static int anInt281;
	public static int anInt282;
	public static int[] anIntArray277;

	public static void method259(int i) {
		@SuppressWarnings("unused")
		int i_0_ = 65 % ((i - 55) / 41);
		anIntArray277 = null;
	}

	public static final void method260(int i) {
		Class78.method780(Class174.clientCycle, i ^ i, Class93.graphicsToolkit);
		anInt280++;
		if ((Class320_Sub15.WINDOWS_PANE_ID ^ 0xffffffff) != 0)
			Class290_Sub1.method3424(-23620, Class320_Sub15.WINDOWS_PANE_ID);
		for (int i_1_ = 0; Node_Sub11.anInt7105 > i_1_; i_1_++) {
			if (Login.aBooleanArray2387[i_1_])
				Class320_Sub21.aBooleanArray8403[i_1_] = true;
			Class190.aBooleanArray2326[i_1_] = Login.aBooleanArray2387[i_1_];
			Login.aBooleanArray2387[i_1_] = false;
		}
		Node_Sub12.anInt5453 = Class174.clientCycle;
		if ((Class320_Sub15.WINDOWS_PANE_ID ^ 0xffffffff) != 0) {
			Node_Sub11.anInt7105 = 0;
			Exception_Sub1.method141(i ^ ~0x297d);
		}
		Class93.graphicsToolkit.la();
		MouseHandler.method1061(Class93.graphicsToolkit, false);
		int i_2_ = Node_Sub52.method2972(false);
		if (i_2_ == -1)
			i_2_ = Class239.anInt2928;
		if ((i_2_ ^ 0xffffffff) == 0)
			i_2_ = Animable_Sub4_Sub1.anInt10687;
		Class60.method594(6, i_2_);
		Node_Sub9_Sub1.anInt9637 = 0;
	}

	public static final int method261(boolean bool, int i, int i_3_, int i_4_) {
		i_4_ &= 0x3;
		if (bool != false)
			return 109;
		anInt281++;
		if (i_4_ == 0)
			return i;
		if ((i_4_ ^ 0xffffffff) == -2)
			return i_3_;
		if ((i_4_ ^ 0xffffffff) == -3)
			return -i + 4095;
		return -i_3_ + 4095;
	}

	protected int anInt273;

	protected int anInt274;

	protected int anInt278;

	protected int anInt279;

	Class17(int i, int i_6_, int i_7_, int i_8_) {
		anInt278 = i_8_;
		anInt279 = i;
		anInt273 = i_6_;
		anInt274 = i_7_;
	}

	public final Class17 method262(int i, int i_5_) {
		if (i != -2)
			return null;
		anInt276++;
		return new Class17(anInt279, i_5_, anInt274, anInt278);
	}
}
