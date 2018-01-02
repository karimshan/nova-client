


/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LoadingBarStage {
	public static LoadingBarStage ONE_PERCENT = new LoadingBarStage(0, GlobalMessage.CHECKING_FOR_UPDATES, GlobalMessage.CHECKING_FOR_UPDATES, 0, 1);
	public static LoadingBarStage TWO_PERCENT = new LoadingBarStage(1, GlobalMessage.CHECKING_FOR_UPDATES, 2);
	public static LoadingBarStage THREE_PERCENT = new LoadingBarStage(2, GlobalMessage.CHECKING_FOR_UPDATES, GlobalMessage.CHECKING_FOR_UPDATES, 2, 3);
	public static LoadingBarStage STAGE_THREE = new LoadingBarStage(3, GlobalMessage.CHECKING_FOR_UPDATES, 3);
	public static LoadingBarStage STAGE_FOUR = new LoadingBarStage(4, GlobalMessage.CHECKING_FOR_UPDATES, GlobalMessage.CHECKING_FOR_UPDATES, 3, 4);
	public static LoadingBarStage STAGE_FIVE = new LoadingBarStage(5, GlobalMessage.CHECKING_FOR_UPDATES, 4);
	public static LoadingBarStage aClass110_1397 = new LoadingBarStage(6, GlobalMessage.CHECKING_FOR_UPDATES, 4);
	public static LoadingBarStage aClass110_1398 = new LoadingBarStage(7, GlobalMessage.CHECKING_FOR_UPDATES, GlobalMessage.CHECKING_FOR_UPDATES, 4, 5);
	public static LoadingBarStage aClass110_1399 = new LoadingBarStage(8, GlobalMessage.CHECKING_FOR_UPDATES, GlobalMessage.CHECKING_FOR_UPDATES, 5, 98, true, true);
	public static LoadingBarStage aClass110_1400 = new LoadingBarStage(9, GlobalMessage.CHECKING_FOR_UPDATES, 99);
	public static LoadingBarStage aClass110_1401 = new LoadingBarStage(10, GlobalMessage.CHECKING_FOR_UPDATES, 100);
	public static LoadingBarStage aClass110_1402 = new LoadingBarStage(11, GlobalMessage.FETCHING_UPDATES, GlobalMessage.FETCHING_UPDATES, 0, 92, true, true);
	public static LoadingBarStage aClass110_1403 = new LoadingBarStage(12, GlobalMessage.FETCHING_UPDATES, GlobalMessage.FETCHING_UPDATES, 92, 92);
	private static LoadingBarStage aClass110_1404 = new LoadingBarStage(13, GlobalMessage.FETCHING_UPDATES, GlobalMessage.FETCHING_UPDATES, 92, 93);
	public static LoadingBarStage aClass110_1405 = new LoadingBarStage(14, GlobalMessage.FETCHING_UPDATES, GlobalMessage.FETCHING_UPDATES, 94, 95);
	public static LoadingBarStage aClass110_1406 = new LoadingBarStage(15, GlobalMessage.FETCHING_UPDATES, GlobalMessage.FETCHING_UPDATES, 96, 97);
	public static LoadingBarStage aClass110_1407 = new LoadingBarStage(16, GlobalMessage.FETCHING_UPDATES, 97);
	public static LoadingBarStage aClass110_1408 = new LoadingBarStage(17, GlobalMessage.FETCHING_UPDATES, 97);
	public static LoadingBarStage aClass110_1409 = new LoadingBarStage(18, GlobalMessage.FETCHING_UPDATES, 100);
	public static LoadingBarStage aClass110_1410 = new LoadingBarStage(19, GlobalMessage.FETCHING_UPDATES, 100);
	public static LoadingBarStage aClass110_1411 = new LoadingBarStage(20, GlobalMessage.FETCHING_UPDATES, 100);
	/* synthetic */static Class<?> aClass1413;
	public static int anInt1377;
	public static int anInt1380;
	public static int anInt1381;
	public static int anInt1385;
	public static int anInt1386;
	public static int anInt1388;
	public static int anInt1391;
	public static int anInt1412 = 0;

	public static final void method1129(byte b, int i) {
		if (b <= 62)
			method1129((byte) -96, -70);
		anInt1391++;
		Class105.aClass61_5202.method598(i, -11819);
	}

	public static final void method1131(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		anInt1381++;
		if ((i_7_ ^ 0xffffffff) <= -1 && (i_4_ ^ 0xffffffff) <= -1 && -1 + Node_Sub54.GAME_SCENE_WDITH > i_7_
				&& (Class377_Sub1.GAME_SCENE_HEIGHT - 1 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
			if (Class175.aClass261ArrayArrayArray2099 == null)
				return;
			if ((i_10_ ^ 0xffffffff) == -1) {
				Interface19 interface19 = (Interface19) Node_Sub38_Sub12.method2830(i, i_7_, i_4_);
				Interface19 interface19_11_ = (Interface19) Class328.method3827(i, i_7_, i_4_);
				if (interface19 != null && i_5_ != 2)
					if (!(interface19 instanceof Animable_Sub2_Sub1))
						Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, 58, interface19.getObjectId(-32136));
					else
						((Animable_Sub2_Sub1) interface19).aClass310_10632.method3591(i_6_, 30994);
				if (interface19_11_ != null)
					if (!(interface19_11_ instanceof Animable_Sub2_Sub1))
						Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, 99,
								interface19_11_.getObjectId(-32136));
					else
						((Animable_Sub2_Sub1) interface19_11_).aClass310_10632.method3591(i_6_, i_9_ ^ ~0x7911);
			} else if ((i_10_ ^ 0xffffffff) != -2) {
				if ((i_10_ ^ 0xffffffff) != -3) {
					if ((i_10_ ^ 0xffffffff) == -4) {
						Interface19 interface19 = (Interface19) Class270_Sub1_Sub1.method3303(i, i_7_, i_4_);
						if (interface19 != null)
							if (interface19 instanceof Animable_Sub1_Sub2)
								((Animable_Sub1_Sub2) interface19).aClass310_10652.method3591(i_6_, 30994);
							else
								Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, i_9_ + 67,
										interface19.getObjectId(-32136));
					}
				} else {
					Interface19 interface19 = (Interface19) Class262_Sub20.method3203(i, i_7_, i_4_,
							aClass1413 != null ? aClass1413 : (aClass1413 = method1136("Interface19")));
					if (interface19 != null) {
						if ((i_5_ ^ 0xffffffff) == -12)
							i_5_ = 10;
						if (!(interface19 instanceof Mobile_Sub3))
							Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, i_9_ + -120,
									interface19.getObjectId(-32136));
						else
							((Mobile_Sub3) interface19).aClass310_10777.method3591(i_6_, 30994);
					}
				}
			} else {
				Interface19 interface19 = (Interface19) CacheNode_Sub8.method2320(i, i_7_, i_4_);
				if (interface19 != null)
					if (interface19 instanceof Animable_Sub4_Sub2)
						((Animable_Sub4_Sub2) interface19).aClass310_10794.method3591(i_6_, 30994);
					else {
						int i_12_ = interface19.getObjectId(-32136);
						if (i_5_ != 4 && (i_5_ ^ 0xffffffff) != -6) {
							if ((i_5_ ^ 0xffffffff) == -7)
								Class128.method1544(i_4_, 4, i_8_ + 4, i_7_, i_6_, i_10_, i, -128, i_12_);
							else if (i_5_ == 7)
								Class128.method1544(i_4_, 4, (0x3 & i_8_ + 2) - -4, i_7_, i_6_, i_10_, i, i_9_ ^ 0x79,
										i_12_);
							else if (i_5_ == 8) {
								Class128.method1544(i_4_, 4, 4 + i_8_, i_7_, i_6_, i_10_, i, i_9_ + -123, i_12_);
								Class128.method1544(i_4_, 4, (2 + i_8_ & 0x3) + 4, i_7_, i_6_, i_10_, i, -125, i_12_);
							}
						} else
							Class128.method1544(i_4_, 4, i_8_, i_7_, i_6_, i_10_, i, -125, i_12_);
					}
			}
		}
		if (i_9_ != -4)
			aClass110_1399 = null;
	}

	public static final void method1132(int i, boolean bool, boolean bool_13_) {
		if (i == 0) {
			anInt1388++;
			if (bool_13_) {
				Class233.anInt2783++;
				Class262_Sub11.method3176(i + 1);
			}
			if (bool) {
				Class108.anInt5283++;
				Class246.method3073(113);
			}
		}
	}

	public static final LoadingBarStage[] setStage(byte b) {
		anInt1386++;
		@SuppressWarnings("unused")
		int i = 87 % ((b - 5) / 47);
		return new LoadingBarStage[] { ONE_PERCENT, TWO_PERCENT, THREE_PERCENT, STAGE_THREE, STAGE_FOUR,
				STAGE_FIVE, aClass110_1397, aClass110_1398, aClass110_1399, aClass110_1400, aClass110_1401,
				aClass110_1402, aClass110_1403, aClass110_1404, aClass110_1405, aClass110_1406, aClass110_1407,
				aClass110_1408, aClass110_1409, aClass110_1410, aClass110_1411 };
	}

	public static void method1134(int i) {
		ONE_PERCENT = null;
		STAGE_FIVE = null;
		aClass110_1411 = null;
		TWO_PERCENT = null;
		STAGE_FOUR = null;
		STAGE_THREE = null;
		THREE_PERCENT = null;
		aClass110_1404 = null;
		aClass110_1401 = null;
		aClass110_1403 = null;
		aClass110_1409 = null;
		aClass110_1397 = null;
		aClass110_1402 = null;
		aClass110_1400 = null;
		aClass110_1398 = null;
		aClass110_1410 = null;
		aClass110_1406 = null;
		aClass110_1405 = null;
		aClass110_1408 = null;
		aClass110_1399 = null;
		aClass110_1407 = null;
		if (i != 97)
			aClass110_1401 = null;
	}

	public static final boolean method1135(int i, int i_18_, boolean bool) {
		anInt1380++;
		if (!Class320_Sub4.method3693(75, i, i_18_))
			return false;
		if (bool != false)
			return false;
		if ((0xb000 & i) != 0 | CacheNode_Sub3.method2296(i_18_, (byte) -79, i)
				| Class320_Sub7.method3711((byte) 86, i, i_18_))
			return true;
		return (Class73.method749((byte) -65, i, i_18_) | Class214.method2060(i, i_18_, 116)) & (0x37 & i_18_) == 0;
	}

	/* synthetic */static Class<?> method1136(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}

	protected boolean aBoolean1387;

	protected boolean aBoolean1393;

	protected GlobalMessage aClass22_1379;

	protected GlobalMessage aClass22_1389;

	private int anInt1378;

	protected int anInt1382;

	protected int anInt1383;

	private LoadingBarStage(int i, GlobalMessage class22, GlobalMessage class22_1_, int i_2_, int i_3_) {
		this(i, class22, class22_1_, i_2_, i_3_, true, false);
	}

	private LoadingBarStage(int i, GlobalMessage class22, GlobalMessage class22_14_, int i_15_, int i_16_, boolean bool,
			boolean bool_17_) {
		anInt1383 = i_15_;
		aBoolean1387 = bool;
		anInt1382 = i_16_;
		aBoolean1393 = bool_17_;
		aClass22_1389 = class22_14_;
		aClass22_1379 = class22;
		anInt1378 = i;
	}

	private LoadingBarStage(int i, GlobalMessage class22, int i_0_) {
		this(i, class22, class22, i_0_, i_0_, true, false);
	}

	public final int method1130(int i) {
		anInt1377++;
		if (i != -3)
			return -111;
		return anInt1378;
	}

	@Override
	public final String toString() {
		anInt1385++;
		throw new IllegalStateException();
	}
}
