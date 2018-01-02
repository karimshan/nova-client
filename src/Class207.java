


/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class207 {
	public static int anInt2473;
	public static int anInt2474;
	public static int anInt2477;
	public static int anInt2478;
	public static int anInt2479;
	public static int anInt2480;

	public static final void method2039(int i) {
		if (Class94.anInt1250 < 0) {
			Class262_Sub4.anInt7730 = -1;
			Class150_Sub3.anInt8963 = -1;
			Class94.anInt1250 = 0;
		}
		if (i <= 5)
			method2040(null, 31, 8);
		anInt2477++;
		if (Class20.anInt345 < Class94.anInt1250) {
			Class262_Sub4.anInt7730 = -1;
			Class94.anInt1250 = Class20.anInt345;
			Class150_Sub3.anInt8963 = -1;
		}
		if ((Class327.anInt5360 ^ 0xffffffff) > -1) {
			Class150_Sub3.anInt8963 = -1;
			Class262_Sub4.anInt7730 = -1;
			Class327.anInt5360 = 0;
		}
		if ((Class20.anInt333 ^ 0xffffffff) > (Class327.anInt5360 ^ 0xffffffff)) {
			Class150_Sub3.anInt8963 = -1;
			Class262_Sub4.anInt7730 = -1;
			Class327.anInt5360 = Class20.anInt333;
		}
	}

	public static final String method2040(BufferedStream buffer, int i, int i_0_) {
		anInt2480++;
		try {
			int i_1_ = buffer.readSmart();
			if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
				i_1_ = i;
			byte[] bs = new byte[i_1_];
			buffer.offset += Class342.aClass163_4236.method1735(bs, -1, buffer.buffer, i_1_, buffer.offset, 0);
			if (i_0_ != -24709)
				method2040(null, -44, 108);
			String string = Class184.method1846(0, bs, i_1_, (byte) -109);
			return string;
		} catch (Exception exception) {
			return "Cabbage";
		}
	}

	private long aLong2476;

	private int anInt2475;

	Class207(Commands class126) {
		aLong2476 = class126.anInt1621;
		anInt2475 = 1;
	}

	Class207(Commands[] class126s) {
		for (int i = 0; (i ^ 0xffffffff) > (class126s.length ^ 0xffffffff); i++)
			method2043(class126s[i], -121);
	}

	private final int method2041(int i, int i_2_) {
		if (i != 12053)
			method2044(76, 34);
		anInt2474++;
		return (int) (aLong2476 >> Commands.anInt1631 * i_2_) & 0xf;
	}

	public final int method2042(int i) {
		anInt2478++;
		if (i != -1)
			method2040(null, -50, -36);
		return anInt2475;
	}

	private final void method2043(Commands class126, int i) {
		anInt2479++;
		if (i < -114)
			aLong2476 |= class126.anInt1621 << anInt2475++ * Commands.anInt1631;
	}

	public final Commands method2044(int i, int i_3_) {
		anInt2473++;
		if (i != 15)
			return null;
		return Commands.method1534(method2041(12053, i_3_), -126);
	}
}
