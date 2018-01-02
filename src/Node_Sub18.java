


/* Node_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub18 extends Node {
	public static Index aClass302_7150;
	public static OutgoingPacket aClass318_7151 = new OutgoingPacket(1, -1);
	public static int anInt7152;
	public static int anInt7153;

	public static void method2605(byte b) {
		aClass302_7150 = null;
		if (b == -59)
			aClass318_7151 = null;
	}

	public static final void method2606(int i) {
		anInt7153++;
		Class10.aGLSprite172 = null;
		Class346.anInt4278 = -1;
		if (i != 126)
			method2605((byte) 62);
	}

	public static final int method2607(byte b, int i, int i_0_) {
		anInt7152++;
		if (b != 31)
			return -18;
		i = (i_0_ & 0x7f) * i >> 7;
		if (i >= 2) {
			if ((i ^ 0xffffffff) < -127)
				i = 126;
		} else
			i = 2;
		return i + (i_0_ & 0xff80);
	}

	protected String aString7149;

	public Node_Sub18() {
		/* empty */
	}

	Node_Sub18(String string) {
		aString7149 = string;
	}
}
