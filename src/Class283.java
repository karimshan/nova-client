


/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class283 {
	public static int anInt3589;
	public static int anInt3590 = 0;
	public static int anInt3591 = 0;

	public static final int method3389(int i, boolean bool, byte b, int i_0_) {
		anInt3589++;
		Node_Sub16 node_sub16 = ToolTips.method3472(i_0_, (byte) 18, bool);
		if (node_sub16 == null)
			return 0;
		if (i < 0 || (node_sub16.anIntArray7138.length ^ 0xffffffff) >= (i ^ 0xffffffff))
			return 0;
		if (b <= 60)
			return -79;
		return node_sub16.anIntArray7138[i];
	}
}
