


/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class294 {
	public static Index aClass302_3690;
	public static OutgoingPacket aClass318_3685 = new OutgoingPacket(86, 7);
	public static Class379 aClass379_3689 = new Class379();
	public static int anInt3686;
	public static int anInt3687 = 2;
	public static int anInt3688;

	public static void method3465(byte b) {
		if (b != 116)
			method3467(-103, -96, 110, -100);
		aClass302_3690 = null;
		aClass379_3689 = null;
		aClass318_3685 = null;
	}

	public static final boolean method3466(int i, int i_0_, int i_1_) {
		anInt3688++;
		if (i_0_ != -1)
			method3467(-37, -57, 35, -14);
		if ((0x8000 & i ^ 0xffffffff) == -1)
			return false;
		return true;
	}

	public static final void method3467(int i, int i_2_, int i_3_, int i_4_) {
		anInt3686++;
		if (i_2_ >= 107) {
			CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 11, i_4_);
			cachenode_sub2.method2288(0);
			cachenode_sub2.itemId = i;
			cachenode_sub2.itemAmount = i_3_;
		}
	}
}
