


/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class10 {
	public static Class124 aClass124_169 = new Class124(13);
	public static IncomingPacket aClass192_175 = new IncomingPacket(51, 0);
	public static Class96 aClass96_176;
	public static GLSprite aGLSprite172;
	public static GLSprite aGLSprite173;
	public static int anInt168;
	public static int anInt170;
	public static int anInt171;
	public static int anInt174;

	public static final int method187(String string, int i, boolean bool) {
		anInt171++;
		if (bool != true)
			aGLSprite173 = null;
		return Class145.method1638(21642, string, i, true);
	}

	public static final int method188(byte b, int i, int i_0_, byte[] bs) {
		if (b != -58)
			return 33;
		anInt170++;
		int i_1_ = -1;
		for (int i_2_ = i_0_; i > i_2_; i_2_++)
			i_1_ = i_1_ >>> 8 ^ Class363.anIntArray4505[0xff & (i_1_ ^ bs[i_2_])];
		i_1_ ^= 0xffffffff;
		return i_1_;
	}

	public static final void method189(BufferedStream buffer, int i) {
		if (i < 1)
			method188((byte) -113, -117, 99, null);
		anInt168++;
		for (;;) {
			int i_3_ = buffer.readUnsignedByte();
			int i_4_ = i_3_;
			if ((i_4_ ^ 0xffffffff) != -1) {
				if ((i_4_ ^ 0xffffffff) == -256)
					break;
			} else {
				Class259.anInt3254 = buffer.readUnsignedShort();
				Class270_Sub1.anInt8034 = buffer.readUnsignedShort();
			}
		}
	}

	@SuppressWarnings("unused")
	public static void method190(int i) {
		aGLSprite172 = null;
		aClass96_176 = null;
		aClass192_175 = null;
		aGLSprite173 = null;
		aClass124_169 = null;
		int i_5_ = -77 / ((i - 57) / 58);
	}

	public Class10() {
		/* empty */
	}

	abstract long method186(int i);
}
