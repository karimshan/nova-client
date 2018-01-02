



import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Node_Sub25_Sub2 extends Node_Sub25 {
	public static Class124 aClass124_9957 = new Class124(14);
	public static IncomingPacket CLAN_CHANNEL = new IncomingPacket(7, -2);
	public static Class54[] aClass54Array9959;
	public static int anInt9954;
	public static int anInt9955;
	public static int anInt9956;

	public static final boolean method2665(int i, byte b) {
		anInt9955++;
		if (b != -41)
			return false;
		if ((i ^ 0xffffffff) != -8 && (i ^ 0xffffffff) != -10)
			return false;
		return true;
	}

	public static void method2666(int i) {
		aClass54Array9959 = null;
		if (i != -2)
			CLAN_CHANNEL = null;
		aClass124_9957 = null;
		CLAN_CHANNEL = null;
	}

	Node_Sub25_Sub2(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	@Override
	public final void method2654(int i, OggPacket oggpacket) {
		anInt9954++;
	}

	@Override
	public final void method2656(int i) {
		anInt9956++;
		if (i != 100)
			method2656(-92);
	}
}
