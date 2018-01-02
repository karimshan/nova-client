



import jaggl.OpenGL;

public class CacheNode_Sub17 extends CacheNode implements Interface2 {
	public static float aFloat8847;
	public static int anInt8832;
	public static int anInt8834;
	public static int anInt8835 = 0;
	public static int anInt8839;
	public static int anInt8843;
	public static int anInt8844;
	public static int anInt8845;
	public static int anInt8849;
	public static int[] anIntArray8840 = new int[4096];
	public static int[] BIT_FLAGS;
	static {
		for (int i = 0; (i ^ 0xffffffff) > -4097; i++)
			anIntArray8840[i] = ObjectDefinition.method3047(i, -1);
		BIT_FLAGS = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535,
				131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
				268435455, 536870911, 1073741823, 2147483647, -1 };
	}

	public static final int method2393(int i, int i_0_, int i_1_) {
		if (i_1_ != 2097151)
			return 26;
		anInt8845++;
		int i_2_ = 57 * i + i_0_;
		i_2_ ^= i_2_ << 13;
		int i_3_ = 0x7fffffff & 1376312589 + i_2_ * (15731 * (i_2_ * i_2_) + 789221);
		return i_3_ >> 19 & 0xff;
	}

	public static final String method2394(byte b) {
		anInt8834++;
		if (b != 47)
			method2397((byte) -89);
		String string = "www";
		if (Node_Sub38_Sub1.aClass329_10086 != Class189_Sub1.aClass329_6887) {
			if (Node_Sub38_Sub1.aClass329_10086 != Class379.aClass329_4873) {
				if (Node_Sub38_Sub1.aClass329_10086 == Class229.aClass329_2730)
					string = "www-wtwip";
			} else
				string = "www-wtqa";
		} else
			string = "www-wtrc";
		String string_4_ = "";
		if (Class83.aString5186 != null)
			string_4_ = "/p=" + Class83.aString5186;
		return "http://" + string.replace("runescape", "nova") + "." + Class209.directory.aString4341 + ".com/l="
				+ Class35.language + "/a=" + Class170.anInt2056 + string_4_ + "/";
	}

	public static void method2395(int i) {
		if (i <= -83) {
			anIntArray8840 = null;
			BIT_FLAGS = null;
		}
	}

	public static final BufferedStream method2397(byte b) {
		anInt8844++;
		BufferedStream buffer = Class300.method3500(3);
		buffer.writeLong(0L);
		buffer.writeString(Node_Sub5.password);
		if (b != 27)
			BIT_FLAGS = null;
		buffer.writeLong(Class188_Sub1_Sub2.aLong9342);
		buffer.writeLong(CacheNode_Sub15.aLong9588);
		// buffer.rsaDecrypt(0, Class203.aBigInteger2451,
		// Class262_Sub10.aBigInteger7775);
		return buffer;
	}

	private GLToolkit aGLToolkit8836;
	private int anInt8833;
	protected int anInt8837;

	private int anInt8838;

	private int anInt8841;

	private int anInt8842 = -1;

	private int anInt8848;

	protected int anInt8850;

	CacheNode_Sub17(GLToolkit gltoolkit, int i, int i_7_, int i_8_) {
		anInt8841 = -1;
		anInt8848 = i;
		aGLToolkit8836 = gltoolkit;
		anInt8837 = i_7_;
		anInt8850 = i_8_;
		OpenGL.glGenRenderbuffersEXT(1, Class376.anIntArray4660, 0);
		anInt8838 = Class376.anIntArray4660[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt8838);
		OpenGL.glRenderbufferStorageEXT(36161, anInt8848, anInt8837, anInt8850);
		anInt8833 = anInt8837 * (anInt8850 * aGLToolkit8836.method1471(anInt8848, 118));
	}

	CacheNode_Sub17(GLToolkit gltoolkit, int i, int i_9_, int i_10_, int i_11_) {
		anInt8841 = -1;
		aGLToolkit8836 = gltoolkit;
		anInt8848 = i;
		anInt8837 = i_9_;
		anInt8850 = i_10_;
		OpenGL.glGenRenderbuffersEXT(1, Class376.anIntArray4660, 0);
		anInt8838 = Class376.anIntArray4660[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt8838);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_11_, anInt8848, anInt8837, anInt8850);
		anInt8833 = anInt8850 * (anInt8837 * aGLToolkit8836.method1471(anInt8848, 87));
	}

	@Override
	protected final void finalize() throws Throwable {
		method2398((byte) 16);
		anInt8849++;
		super.finalize();
	}

	public final void method2396(int i, int i_5_, int i_6_) {
		anInt8839++;
		OpenGL.glFramebufferRenderbufferEXT(i_5_, i, 36161, anInt8838);
		anInt8842 = i;
		anInt8841 = i_5_;
		if (i_6_ > -17)
			method2397((byte) 32);
	}

	public final void method2398(byte b) {
		@SuppressWarnings("unused")
		int i = -98 % ((-19 - b) / 32);
		if ((anInt8838 ^ 0xffffffff) < -1) {
			aGLToolkit8836.method1426(anInt8838, (byte) -32, anInt8833);
			anInt8838 = 0;
		}
		anInt8843++;
	}

	@Override
	public final void method5(int i) {
		OpenGL.glFramebufferRenderbufferEXT(anInt8841, anInt8842, 36161, i);
		anInt8832++;
		anInt8842 = -1;
		anInt8841 = -1;
	}
}