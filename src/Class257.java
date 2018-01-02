


/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class257 {
	public static IncomingPacket aClass192_3245 = new IncomingPacket(49, 1);
	public static float aFloat3243 = 1024.0F;
	public static int anInt3242;
	public static int anInt3244 = 503;
	public static int anInt3246;
	public static int anInt3247;

	public static final void method3121(int i, boolean bool, int i_0_) {
		anInt3242++;
		Class320_Sub22.anInt8416++;
		Node_Sub13 node_sub13 = PacketDecoder.sendOutgoingOPCode(-386, Node_Sub36_Sub1.aClass318_10031,
				Class218.aClass123_2566.isaacCipher);
		if (bool != true)
			method3121(106, true, 87);
		node_sub13.packet.writeIntV2(i_0_);
		node_sub13.packet.writeShortLE128(i);
		Class218.aClass123_2566.sendPacket(127, node_sub13);
	}

	public static final void method3122(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt3247++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 4, i_4_);
		cachenode_sub2.method2288(0);
		cachenode_sub2.anInt9429 = i_3_;
		@SuppressWarnings("unused")
		int i_6_ = -117 % ((i_5_ - -32) / 41);
		cachenode_sub2.itemId = i_2_;
		cachenode_sub2.itemAmount = i;
	}

	public static void method3123(boolean bool) {
		if (bool != true)
			anInt3244 = -110;
		aClass192_3245 = null;
	}

	Class257(int i, int i_1_) {
		/* empty */
	}

	@Override
	public final String toString() {
		anInt3246++;
		throw new IllegalStateException();
	}
}
