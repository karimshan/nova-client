


/* Class339_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class339_Sub8 extends Class339 {
	public static int anInt8731;
	public static int anInt8732;
	public static int anInt8733;
	public static int anInt8734;
	public static int anInt8735;
	public static int anInt8736;
	public static int anInt8737;
	public static int anInt8738;
	public static int anInt8739 = 0;
	public static int anInt8740;
	public static int anInt8741;

	public static final void method3944(int i, int i_0_) {
		if (i != 12000)
			method3946(24, -117, -69, null, true, 121);
		anInt8740++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(i ^ 0x2ee3, 3, i_0_);
		cachenode_sub2.method2291((byte) 121);
	}

	public static final int method3945(boolean bool, int i) {
		anInt8734++;
		int i_1_;
		if (i > 12000) {
			i_1_ = 4;
			Class262_Sub15.method3188(18896);
		} else if ((i ^ 0xffffffff) >= -5001) {
			if ((i ^ 0xffffffff) < -2001) {
				Class194_Sub1.method1965((byte) -119);
				i_1_ = 2;
			} else {
				i_1_ = 1;
				Node_Sub36.method2752(true, true);
			}
		} else {
			Class69.method736(32159);
			i_1_ = 3;
		}
		if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(bool) != 2) {
			Class213.aNode_Sub27_2512.method2690(110, 2, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
			GlobalMessage.method300(2, !bool, false);
		}
		Node_Sub38_Sub31.displayMode(1);
		return i_1_;
	}

	public static final void method3946(int i, int i_3_, int i_4_, Index class302, boolean bool, int i_5_) {
		anInt8732++;
		if (i_5_ != 23732)
			anInt8739 = 44;
		Class104.method1114(0L, bool, 95, i, i_3_, i_4_, class302);
	}

	Class339_Sub8(GLToolkit gltoolkit) {
		super(gltoolkit);
	}

	@Override
	public final void method3917(Class169 class169, int i, int i_2_) {
		anInt8731++;
		aGLToolkit4202.method1444(i_2_ + 28287, class169);
		aGLToolkit4202.method1434((byte) -78, i);
		if (i_2_ != -28289)
			anInt8739 = -121;
	}

	@Override
	public final void method3918(int i) {
		if (i != 20937)
			anInt8739 = 62;
		aGLToolkit4202.method1483(false, 1028);
		anInt8737++;
	}

	@Override
	public final void method3919(int i, int i_6_, int i_7_) {
		anInt8738++;
		if (i != -13437)
			method3944(-109, 50);
	}

	@Override
	public final void method3920(int i, boolean bool) {
		anInt8736++;
		if (i != -1)
			anInt8733 = -22;
	}

	@Override
	public final boolean method3922(byte b) {
		anInt8735++;
		if (b > -44)
			method3944(26, 71);
		return true;
	}

	@Override
	public final void method3923(boolean bool, int i) {
		aGLToolkit4202.method1483(true, 1028);
		if (i == 0)
			anInt8741++;
	}
}
