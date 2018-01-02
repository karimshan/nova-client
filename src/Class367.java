


/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class367 {
	public static IncomingPacket aClass192_4534 = new IncomingPacket(139, -2);
	public static Class37 aClass37_4540;
	public static int anInt4532;
	public static int anInt4533;
	public static int anInt4535;
	public static int anInt4539;
	public static int anInt4541;

	public static void method4076(int i) {
		aClass37_4540 = null;
		int i_3_ = -60 % ((39 - i) / 55);
		aClass192_4534 = null;
	}

	protected int anInt4536 = 0;
	protected int anInt4537;
	protected int anInt4538 = 0;

	protected int anInt4542;

	public Class367() {
		anInt4537 = 2048;
		anInt4542 = 2048;
	}

	public final void method4074(BufferedStream buffer, int i) {
		anInt4535++;
		int i_0_ = -54 % ((i - 36) / 50);
		for (;;) {
			int i_1_ = buffer.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method4075(i_1_, buffer, (byte) -117);
		}
	}

	private final void method4075(int i, BufferedStream buffer, byte b) {
		if (i != 1) {
			if ((i ^ 0xffffffff) == -3)
				anInt4542 = buffer.readUnsignedShort();
			else if ((i ^ 0xffffffff) != -4) {
				if (i == 4)
					anInt4538 = buffer.readShort();
			} else
				anInt4537 = buffer.readUnsignedShort();
		} else
			anInt4536 = buffer.readUnsignedByte();
		int i_2_ = -79 / ((79 - b) / 38);
		anInt4532++;
	}
}
