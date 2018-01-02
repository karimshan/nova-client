


/* Node_Sub15_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub13 extends Node_Sub15 {
	public static IncomingPacket aClass192_9873;
	public static Class197 aClass197_9871;
	public static int anInt9868;
	public static int anInt9869;
	public static int anInt9870 = 0;
	public static int anInt9872;
	public static int anInt9874 = 0;
	static {
		aClass192_9873 = new IncomingPacket(117, 5);
	}

	public static void method2585(int i) {
		aClass192_9873 = null;
		if (i == 0)
			aClass197_9871 = null;
	}

	public static final Class129[] method2586(int i) {
		if (i != -11746)
			anInt9870 = -68;
		anInt9868++;
		return new Class129[] { ClientBackground.aClass129_6901, Node_Sub41.aClass129_7515, IncomingPacketHolder.aClass129_1564 };
	}

	private int anInt9875 = -1;

	Node_Sub15_Sub13() {
		/* empty */
	}

	@Override
	public final void method2554(int i, BufferedStream buffer) {
		if (i == 29147) {
			anInt9875 = buffer.readUnsignedShort();
			anInt9869++;
		}
	}

	@Override
	public final void method2556(ClanChat clanchat, int i) {
		if (i == 16) {
			anInt9872++;
			clanchat.method502(anInt9875, (byte) 23);
		}
	}
}
