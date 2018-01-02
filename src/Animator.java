



import jaggl.OpenGL;

class Animator {
	public static Class346 aClass346_252 = new Class346();
	public static int anInt232;
	public static int anInt235;
	public static int anInt236;
	public static int anInt238;
	public static int anInt239;
	public static int anInt240;
	public static int anInt242;
	public static int anInt244;
	public static int anInt245;
	public static int anInt246;
	public static int anInt248;
	public static int anInt249;
	public static int anInt250;
	public static int anInt251;
	public static int anInt254;
	public static int anInt256;
	public static int anInt257;
	public static int anInt258;
	public static int anInt260;
	public static int anInt261;
	public static int anInt262;
	public static int anInt264;
	public static int anInt265;
	public static int anInt266;
	public static int anInt267;
	public static int anInt268;
	public static int anInt269;
	public static int anInt271;
	public static int anInt272;

	public static final Class288 method224(byte b, Class237[] class237s, GLXToolkit glxtoolkit) {
		anInt265++;
		for (int i = 0; (i ^ 0xffffffff) > (class237s.length ^ 0xffffffff); i++)
			if (class237s[i] == null || (class237s[i].aLong2907 ^ 0xffffffffffffffffL) >= -1L)
				return null;
		if (b >= -86)
			return null;
		long l = OpenGL.glCreateProgramObjectARB();
		for (Class237 class237 : class237s)
			OpenGL.glAttachObjectARB(l, class237.aLong2907);
		OpenGL.glLinkProgramARB(l);
		OpenGL.glGetObjectParameterivARB(l, 35714, Class320_Sub19.anIntArray8392, 0);
		if (Class320_Sub19.anIntArray8392[0] == 0) {
			if (Class320_Sub19.anIntArray8392[0] == 0) {
				// System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(l, 35716, Class320_Sub19.anIntArray8392, 1);
			if (Class320_Sub19.anIntArray8392[1] > 1) {
				byte[] bs = new byte[Class320_Sub19.anIntArray8392[1]];
				OpenGL.glGetInfoLogARB(l, Class320_Sub19.anIntArray8392[1], Class320_Sub19.anIntArray8392, 0, bs, 0);
				// System.out.println(new String(bs));
			}
			if (Class320_Sub19.anIntArray8392[0] == 0) {
				for (Class237 class237 : class237s)
					OpenGL.glDetachObjectARB(l, class237.aLong2907);
				OpenGL.glDeleteObjectARB(l);
				return null;
			}
		}
		return new Class288(glxtoolkit, l, class237s);
	}

	public static final void method230(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
		anInt240++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 18, (long) i << 32 | i_10_);
		cachenode_sub2.method2288(0);
		cachenode_sub2.itemId = i_11_;
		cachenode_sub2.itemAmount = i_8_;
	}

	public static final Class256 method231(boolean bool, Mobile mobile) {
		anInt246++;
		Class256 class256;
		if (Class329.aClass256_4122 != null) {
			class256 = Class329.aClass256_4122;
			Class329.aClass256_4122 = Class329.aClass256_4122.aClass256_3238;
			class256.aClass256_3238 = null;
			RuntimeException_Sub1.anInt4922--;
		} else
			class256 = new Class256();
		class256.aMobile3239 = mobile;
		if (bool != false)
			method230(83, -97, -118, -83, -95);
		return class256;
	}

	public static void method233(int i) {
		aClass346_252 = null;
		if (i != 100)
			method236(true, 5);
	}

	public static final int method236(boolean bool, int i) {
		if (bool != false)
			aClass346_252 = null;
		anInt242++;
		return 0xff & i;
	}

	public static final void method239(DrawableModel drawablemodel, int i, int i_16_, int i_17_, Class171 class171,
			int i_18_) {
		anInt264++;
		if (i_18_ < -77 && drawablemodel != null)
			class171.method1793(drawablemodel.fa(), drawablemodel.HA(), i_16_, i_17_, drawablemodel.G(), -45,
					drawablemodel.na(), i, drawablemodel.EA(), drawablemodel.V(), drawablemodel.RA());
	}

	private boolean aBoolean234 = false;
	private boolean aBoolean263 = false;
	private Class226 aClass226_241;
	protected Class226 aClass226_270;
	protected Class48 aClass48_233;

	private int anInt237;

	private int anInt243;

	protected int anInt247;

	private int anInt253 = 0;

	private int anInt255;

	protected int anInt259;

	Animator(boolean bool) {
		aBoolean234 = bool;
		aClass226_270 = new Class226();
		if (!aBoolean234)
			aClass226_241 = null;
		else
			aClass226_241 = new Class226();
	}

	void method222(int i, Class48 class48, byte b) {
		if (b < 3)
			method251(true);
		anInt269++;
	}

	public final int method223(int i) {
		anInt254++;
		return anInt237;
	}

	public final void method225(int i, DrawableModel drawablemodel, int i_1_) {
		anInt232++;
		if (aClass48_233 != null) {
			if (i != 0)
				method233(-17);
			if (method247(29340)) {
				drawablemodel.method625(aClass226_270.aCacheNode_Sub15_2683, anInt247,
						aClass48_233.anIntArray707[anInt259], aClass226_270.aCacheNode_Sub15_2687,
						aClass226_270.anInt2685, aClass226_270.anInt2688, i_1_, -114, aClass48_233.aBoolean691);
				if (aBoolean234 && aClass48_233.anIntArray712 != null && aClass226_241.aBoolean2689)
					drawablemodel.method625(aClass226_241.aCacheNode_Sub15_2683, anInt247,
							aClass48_233.anIntArray707[anInt259], aClass226_241.aCacheNode_Sub15_2687,
							aClass226_241.anInt2685, aClass226_241.anInt2688, i_1_, -100, aClass48_233.aBoolean691);
			}
		}
	}

	public final boolean method226(byte b, int i) {
		if (b > -57)
			anInt253 = -70;
		anInt250++;
		if (aClass48_233 == null | (i -= anInt237) <= 0)
			return false;
		return aClass48_233.aBoolean714 | anInt247 + i > aClass48_233.anIntArray707[anInt259];
	}

	public final void method227(int i, int i_2_) {
		anInt237 = i;
		anInt271++;
	}

	public final void method228(int i, int i_4_, byte b, int i_5_, boolean bool) {
		anInt244++;
		if ((method250((byte) -62) ^ 0xffffffff) != (i ^ 0xffffffff)) {
			if ((i ^ 0xffffffff) == 0)
				aClass48_233 = null;
			else {
				if (aClass48_233 == null || i != aClass48_233.anInt711)
					aClass48_233 = Class367.aClass37_4540.method395(i, (byte) -93);
				else if ((aClass48_233.anInt706 ^ 0xffffffff) == -1)
					return;
				anInt237 = i_4_;
				anInt253 = i_5_;
				anInt255 = 0;
				if (!bool) {
					anInt247 = 0;
					anInt259 = 0;
				} else {
					anInt259 = (int) (aClass48_233.anIntArray715.length * Math.random());
					anInt247 = (int) (Math.random() * aClass48_233.anIntArray707[anInt259]);
				}
				anInt243 = 1 + anInt259;
				if ((anInt243 ^ 0xffffffff) > -1
						|| anInt243 >= (aClass48_233.anIntArray715 == null ? 0 : aClass48_233.anIntArray715.length))
					anInt243 = -1;
				if (anInt237 == 0)
					method222(anInt259, aClass48_233, (byte) 10);
				aBoolean263 = false;
			}
			method244(-109);
		}
	}

	public final void method229(byte b, int i) {
		anInt259 = 0;
		anInt268++;
		anInt243 = aClass48_233.anIntArray715.length <= 1 ? -1 : 1;
		anInt247 = 0;
		aBoolean263 = false;
		anInt237 = i;
		anInt255 = 0;
		if (aClass48_233 != null) {
			method222(anInt259, aClass48_233, (byte) 82);
			method244(-115);
		}
	}

	public final void method232(int i, Animator animator_13_) {
		aClass48_233 = animator_13_.aClass48_233;
		aBoolean234 = animator_13_.aBoolean234;
		aBoolean263 = animator_13_.aBoolean263;
		if (i != 18634)
			method235(-122);
		anInt237 = animator_13_.anInt237;
		anInt255 = animator_13_.anInt255;
		anInt236++;
		anInt243 = animator_13_.anInt243;
		anInt259 = animator_13_.anInt259;
		anInt247 = animator_13_.anInt247;
		method244(-124);
	}

	public final void method234(int i, int i_14_, int i_15_) {
		if (i_15_ >= 97) {
			method228(i_14_, i, (byte) 109, 0, false);
			anInt267++;
		}
	}

	public final void method235(int i) {
		method229((byte) -127, i);
		anInt256++;
	}

	public final int method237(byte b) {
		anInt235++;
		if (b >= -125)
			method247(-46);
		if (method247(29340)) {
			int i = 0;
			if (method247(29340)) {
				i |= aClass226_270.anInt2691;
				if (aBoolean234 && aClass48_233.anIntArray712 != null)
					i |= aClass226_241.anInt2691;
			}
			return i;
		}
		return 0;
	}

	public final boolean method238(int i) {
		anInt257++;
		if (i > -10)
			method227(-2, -59);
		return aBoolean263;
	}

	public final void method240(boolean bool, int i, int i_19_) {
		anInt260++;
		if (i_19_ != 838828768)
			method240(true, 51, 15);
		method228(i, 0, (byte) -78, 0, bool);
	}

	public final void method241(DrawableModel drawablemodel, int i) {
		anInt238++;
		if (method247(29340)) {
			drawablemodel.method631(aClass226_270.anInt2685, i + 68, aClass226_270.aCacheNode_Sub15_2683);
			if (aBoolean234 && aClass48_233.anIntArray712 != null && aClass226_241.aBoolean2689)
				drawablemodel.method631(aClass226_241.anInt2685, 37, aClass226_241.aCacheNode_Sub15_2683);
		}
		if (i != 0)
			method222(-63, null, (byte) -38);
	}

	public final boolean method242(byte b) {
		if (b != -77)
			anInt255 = -105;
		anInt248++;
		if ((anInt237 ^ 0xffffffff) == -1)
			return false;
		return true;
	}

	public final Class48 method243(byte b) {
		anInt272++;
		if (b != -24)
			method226((byte) -69, -21);
		return aClass48_233;
	}

	private final void method244(int i) {
		if (i >= -107)
			anInt237 = 2;
		aClass226_270.method2115((byte) -116);
		anInt239++;
		if (aBoolean234)
			aClass226_241.method2115((byte) -110);
	}

	public final boolean method245(int i) {
		anInt266++;
		if (i >= -123)
			method247(-25);
		if (aClass48_233 == null)
			return false;
		return true;
	}

	public final void method246(int i, int i_20_, boolean bool, DrawableModel drawablemodel) {
		anInt262++;
		if (method247(29340)) {
			drawablemodel.method634(anInt247, aClass226_270.aCacheNode_Sub15_2683, aClass226_270.aCacheNode_Sub15_2687,
					aClass226_270.anInt2685, i_20_, null, (byte) -83, aClass48_233.anIntArray707[anInt259],
					aClass48_233.aBoolean691, aClass226_270.anInt2688, i);
			if (aBoolean234 && aClass48_233.anIntArray712 != null && aClass226_241.aBoolean2689)
				drawablemodel.method634(anInt247, aClass226_241.aCacheNode_Sub15_2683,
						aClass226_241.aCacheNode_Sub15_2687, aClass226_241.anInt2685, i_20_, null, (byte) -83,
						aClass48_233.anIntArray707[anInt259], aClass48_233.aBoolean691, aClass226_241.anInt2688, i);
		}
		if (bool != true)
			anInt259 = -48;
	}

	public final boolean method247(int i) {
		if (i != 29340)
			return true;
		anInt245++;
		if (aClass48_233 == null)
			return false;
		boolean bool = aClass48_233.anIntArray715 == null ? false
				: aClass226_270.method2110(Class367.aClass37_4540, (byte) -93, aClass48_233, anInt243, anInt259,
						aClass48_233.anIntArray715);
		if (bool && aBoolean234 && aClass48_233.anIntArray712 != null)
			aClass226_241.method2110(Class367.aClass37_4540, (byte) -123, aClass48_233, anInt243, anInt259,
					aClass48_233.anIntArray712);
		return bool;
	}

	public final boolean method248(int i, int i_21_) {
		anInt249++;
		if (i >= -83)
			method250((byte) 67);
		if (aClass48_233 == null || i_21_ == 0)
			return false;
		if (anInt237 > 0) {
			if (anInt237 >= i_21_) {
				anInt237 -= i_21_;
				return false;
			}
			i_21_ -= anInt237;
			anInt237 = 0;
			method222(anInt259, aClass48_233, (byte) 87);
		}
		i_21_ += anInt247;
		boolean bool = Class320_Sub12.aBoolean8325 | aClass48_233.aBoolean714;
		if (i_21_ > 100 && (aClass48_233.anInt696 ^ 0xffffffff) < -1) {
			int i_22_;
			for (i_22_ = aClass48_233.anIntArray715.length - aClass48_233.anInt696; anInt259 < i_22_; anInt259++) {
				if (i_21_ <= aClass48_233.anIntArray707[anInt259])
					break;
				i_21_ -= aClass48_233.anIntArray707[anInt259];
			}
			if ((i_22_ ^ 0xffffffff) >= (anInt259 ^ 0xffffffff)) {
				int i_23_ = 0;
				for (int i_24_ = i_22_; i_24_ < aClass48_233.anIntArray715.length; i_24_++)
					i_23_ += aClass48_233.anIntArray707[i_24_];
				if (anInt253 == 0)
					anInt255 += i_21_ / i_23_;
				i_21_ %= i_23_;
			}
			anInt243 = 1 + anInt259;
			bool = true;
			if ((anInt243 ^ 0xffffffff) <= (aClass48_233.anIntArray715.length ^ 0xffffffff)) {
				anInt243 -= aClass48_233.anInt696;
				if ((anInt243 ^ 0xffffffff) > -1
						|| (aClass48_233.anIntArray715.length ^ 0xffffffff) >= (anInt243 ^ 0xffffffff))
					anInt243 = -1;
			}
		}
		if (aClass48_233.anIntArray707 != null)
			while (aClass48_233.anIntArray707[anInt259] < i_21_) {
				i_21_ -= aClass48_233.anIntArray707[anInt259++];
				bool = true;
				if (aClass48_233.anIntArray715.length <= anInt259) {
					if ((aClass48_233.anInt696 ^ 0xffffffff) != 0 && anInt253 != 2) {
						anInt259 -= aClass48_233.anInt696;
						if (anInt253 == 0)
							anInt255++;
					}
					if (anInt255 >= aClass48_233.anInt708 || anInt259 < 0
							|| anInt259 >= aClass48_233.anIntArray715.length) {
						aBoolean263 = true;
						break;
					}
				}
				method222(anInt259, aClass48_233, (byte) 102);
				anInt243 = anInt259 + 1;
				if ((anInt243 ^ 0xffffffff) <= (aClass48_233.anIntArray715.length ^ 0xffffffff)) {
					anInt243 -= aClass48_233.anInt696;
					if (anInt243 < 0 || anInt243 >= aClass48_233.anIntArray715.length)
						anInt243 = -1;
				}
			}
		anInt247 = i_21_;
		if (bool)
			method244(-108);
		return bool;
	}

	public final void method249(boolean bool, int i) {
		anInt251++;
		if (bool != true)
			method240(true, -1, 58);
		method228(i, 0, (byte) 60, 0, false);
	}

	public final int method250(byte b) {
		anInt261++;
		if (aClass48_233 != null)
			return aClass48_233.anInt711;
		return -1;
	}

	public final void method251(boolean bool) {
		anInt258++;
		anInt255 = 0;
		if (bool != true)
			anInt237 = 98;
	}
}
