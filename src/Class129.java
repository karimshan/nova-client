



/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class129 {
	public static float aFloat1663;
	public static int anInt1664;
	public static int anInt1666;
	public static int anInt1667;
	public static int anInt1668;
	public static int[] anIntArray1669 = new int[4];
	public static short[] aShortArray1665;
	public static int[] VALID_GAME_SCENE_SIZES = { 104, 120, 136, 168 };
	static {
		aShortArray1665 = new short[256];
	}

	public static final Class357 method1553(int i, int i_0_, Index class302) {
		anInt1667++;
		byte[] bs = class302.method3518((byte) 118, i_0_);
		if (bs == null)
			return null;
		if (i != -1)
			return null;
		return new Class357(bs);
	}

	public static void method1555(int i) {
		anIntArray1669 = null;
		@SuppressWarnings("unused")
		int i_1_ = 104 % ((16 - i) / 42);
		VALID_GAME_SCENE_SIZES = null;
		aShortArray1665 = null;
	}

	public static final void method1556(boolean bool, String username, boolean bool_2_, boolean bool_3_, String password) {
		System.out.println("Method1556 in class129 invoked.");
		if (!bool_3_)
			Class336_Sub2.anInt8586 = -1;
		Node_Sub5.password = password;
		Class243.username = username;
		FixedAnimator.FACEBOOK_LOGIN = bool;
		Class296.aBoolean5428 = bool_3_;
		anInt1664++;
		if (!Class296.aBoolean5428 && (Class243.username.equals("") || Node_Sub5.password.equals("")))
			Animable_Sub2.method836(3, true);
		else {
			Class320_Sub23.aClass123_8432.aBoolean1580 = false;
			if (Class159.loginType != 1) {
				FileOnDisk.anInt1326 = 0;
				GameStub.anInt45 = -1;
				Class187.anInt2276 = -1;
			}
			Animable_Sub2.method836(-3, bool_2_);
			Node_Sub38_Sub8.anInt10163 = 1;
			Class262_Sub12.anInt7791 = 0;
			Class45.anInt5264 = 0;
		}
	}

	protected int anInt1662;

	Class129(String string, int i) {
		anInt1662 = i;
	}

	public final int method1554(boolean bool) {
		if (bool != false)
			VALID_GAME_SCENE_SIZES = null;
		anInt1666++;
		return anInt1662;
	}

	@Override
	public final String toString() {
		anInt1668++;
		throw new IllegalStateException();
	}
}
