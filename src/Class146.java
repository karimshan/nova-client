


/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class146 {
	public static boolean aBoolean1814;
	public static boolean aBoolean1816 = false;
	public static Class10 aClass10_1815;
	public static IncomingPacket aClass192_1810 = new IncomingPacket(143, -2);
	public static CS2Definition aClass32_1812;
	public static int anInt1800;
	public static int anInt1805;
	public static int anInt1806;
	public static int anInt1817;
	public static int anInt1818;
	public static short[][] aShortArrayArray1802;
	public static SignLink aSignLink1813;

	public static void method1643(boolean bool) {
		aShortArrayArray1802 = null;
		aClass32_1812 = null;
		if (bool == false) {
			aClass10_1815 = null;
			aSignLink1813 = null;
			aClass192_1810 = null;
		}
	}

	public static final float method1646(byte b, float f) {
		anInt1805++;
		if (b > -88)
			method1646((byte) 56, 0.12968303F);
		return ((6.0F * f - 15.0F) * f + 10.0F) * (f * (f * f));
	}

	protected boolean aBoolean1819;
	private Class312 aClass312_1801;
	private int anInt1803 = -1;
	private int anInt1804 = 0;
	private int anInt1807;
	private int anInt1811;

	private int[][] anIntArrayArray1809;

	private GameMessage[] aNode_Sub50Array1808;

	Class146(int i, int i_4_, int i_5_) {
		aClass312_1801 = new Class312();
		aBoolean1819 = false;
		anInt1811 = i;
		anInt1807 = i_4_;
		aNode_Sub50Array1808 = new GameMessage[anInt1807];
		anIntArrayArray1809 = new int[anInt1811][i_5_];
	}

	public final int[][] method1642(byte b) {
		@SuppressWarnings("unused")
		int i = 70 % ((b - 38) / 38);
		anInt1818++;
		if ((anInt1811 ^ 0xffffffff) != (anInt1807 ^ 0xffffffff))
			throw new RuntimeException("Can only retrieve a full image cache");
		for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (anInt1811 ^ 0xffffffff); i_0_++)
			aNode_Sub50Array1808[i_0_] = Class218.aNode_Sub50_2568;
		return anIntArrayArray1809;
	}

	public final void method1644(int i) {
		for (int i_1_ = 0; anInt1811 > i_1_; i_1_++)
			anIntArrayArray1809[i_1_] = null;
		anInt1806++;
		if (i > -113)
			method1642((byte) -112);
		aNode_Sub50Array1808 = null;
		anIntArrayArray1809 = null;
		aClass312_1801.method3614(-601);
		aClass312_1801 = null;
	}

	public final int[] method1645(int i, int i_2_) {
		if (i != 27356)
			method1643(false);
		anInt1800++;
		if ((anInt1811 ^ 0xffffffff) != (anInt1807 ^ 0xffffffff)) {
			if ((anInt1811 ^ 0xffffffff) != -2) {
				GameMessage node_sub50 = aNode_Sub50Array1808[i_2_];
				if (node_sub50 != null)
					aBoolean1819 = false;
				else {
					aBoolean1819 = true;
					if (anInt1804 >= anInt1811) {
						GameMessage node_sub50_3_ = (GameMessage) aClass312_1801.method3622((byte) -60);
						node_sub50 = new GameMessage(i_2_, node_sub50_3_.anInt7626);
						aNode_Sub50Array1808[node_sub50_3_.anInt7624] = null;
						node_sub50_3_.method2160((byte) 75);
					} else {
						node_sub50 = new GameMessage(i_2_, anInt1804);
						anInt1804++;
					}
					aNode_Sub50Array1808[i_2_] = node_sub50;
				}
				aClass312_1801.method3611(node_sub50, i ^ ~0x6aa5);
				return anIntArrayArray1809[node_sub50.anInt7626];
			}
			aBoolean1819 = (anInt1803 ^ 0xffffffff) != (i_2_ ^ 0xffffffff);
			anInt1803 = i_2_;
			return anIntArrayArray1809[0];
		}
		aBoolean1819 = aNode_Sub50Array1808[i_2_] == null;
		aNode_Sub50Array1808[i_2_] = Class218.aNode_Sub50_2568;
		return anIntArrayArray1809[i_2_];
	}
}
