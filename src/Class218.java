


/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class218 {
	public static IncomingPacketHolder aClass123_2560 = new IncomingPacketHolder();
	public static IncomingPacketHolder aClass123_2566 = new IncomingPacketHolder();
	public static IncomingPacketHolder[] aClass123Array2567 = { aClass123_2566, aClass123_2560 };
	public static Index aClass302_2563;
	public static OutgoingPacket aClass318_2570 = new OutgoingPacket(55, 7);
	public static int anInt2558;
	public static int anInt2564;
	public static int anInt2565;
	public static int anInt2569;
	public static GameMessage aNode_Sub50_2568 = new GameMessage(0, 0);

	public static void method2076(byte b) {
		@SuppressWarnings("unused")
		int i = 34 / ((22 - b) / 54);
		aClass123Array2567 = null;
		aClass302_2563 = null;
		aClass318_2570 = null;
		aNode_Sub50_2568 = null;
		aClass123_2560 = null;
		aClass123_2566 = null;
	}

	public static final void method2077(d var_d, Index class302, boolean bool) {
		anInt2565++;
		Class376.aD4661 = var_d;
		Class188_Sub2_Sub2.aClass302_9361 = class302;
		if (bool != false)
			aClass302_2563 = null;
	}

	protected Class218 aClass218_2561;
	protected Class336 aClass336_2562;
	protected int anInt2554;
	protected int anInt2555;
	protected int anInt2556;

	protected int anInt2557;

	protected int anInt2559;

	Class218(int i, int i_0_) {
		anInt2555 = i;
		anInt2554 = i_0_;
	}

	public final Class249 method2075(byte b) {
		if (b != -57)
			method2077(null, null, false);
		anInt2564++;
		return Class320_Sub1.method3680(1, anInt2555);
	}

	public final Class218 method2078(boolean bool, int i) {
		if (bool != false)
			aNode_Sub50_2568 = null;
		anInt2558++;
		return new Class218(anInt2555, i);
	}
}
