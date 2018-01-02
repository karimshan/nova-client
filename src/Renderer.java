


/* Renderer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Renderer {
	public static IncomingPacket SEND_INTERFACE = new IncomingPacket(5, 7);
	public static int anInt3657;
	public static int anInt3659;
	public static int anInt3663;

	public static final void method3446(int i, int i_0_) {
		if (i_0_ != 5)
			method3447(106);
		anInt3657++;
		Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.getNode(3512, i);
		if (node_sub3 != null) {
			node_sub3.aClass189_Sub1_6943.method1924((byte) 92);
			Class341.method3960(node_sub3.anInt6947, node_sub3.aBoolean6945, (byte) 115);
			node_sub3.method2160((byte) 83);
		}
	}

	public static void method3447(int i) {
		if (i < -73)
			SEND_INTERFACE = null;
	}

	public static final Model method3448(int i, int i_1_, int i_2_, Index class302) {
		anInt3659++;
		byte[] bs = class302.method3524(false, i_2_, i);
		if (bs == null)
			return null;
		if (i_1_ != 7)
			return null;
		return new Model(bs);
	}

	protected long aLong3661;
	protected int anInt3656;

	protected int anInt3658;

	protected String aString3660;

	protected String aString3664;

	Renderer(int i, String string, int i_3_, String string_4_, long l) {
		aString3664 = string;
		aLong3661 = l;
		anInt3658 = i_3_;
		aString3660 = string_4_;
		anInt3656 = i;
	}
}
