
/* Class270_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Client extends Class270 {
	
	public static OutgoingPacket aClass318_8037;
	public static int anInt8036;
	public static int[] anIntArray8039;
	public static Player[] LOCAL_PLAYERS = new Player[2048];

	static {
		aClass318_8037 = new OutgoingPacket(93, 1);
	}

	public static void method3305(int i) {
		anIntArray8039 = null;
		LOCAL_PLAYERS = null;
		if (i == 30188)
			aClass318_8037 = null;
	}

	abstract Class169_Sub1 method3304(boolean bool);
}
