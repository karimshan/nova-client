/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class197 {
	public static int anInt2412;
	public static int anInt2413;
	public static int anInt2415 = -1;
	public static int anInt2418;
	public static int anInt2421;
	public static int anInt2423 = 0;
	public static int anInt2424;
	public static int anInt2425;

	public static final String method1998(String string, String string_0_, byte b, char c) {
		@SuppressWarnings("unused")
		int i = 111 / ((-28 - b) / 50);
		anInt2424++;
		int i_1_ = string.length();
		int i_2_ = string_0_.length();
		int i_3_ = i_1_;
		int i_4_ = i_2_ - 1;
		if (i_4_ != 0) {
			int i_5_ = 0;
			for (;;) {
				i_5_ = string.indexOf(c, i_5_);
				if ((i_5_ ^ 0xffffffff) > -1)
					break;
				i_3_ += i_4_;
				i_5_++;
			}
		}
		StringBuffer stringbuffer = new StringBuffer(i_3_);
		int i_6_ = 0;
		for (;;) {
			int i_7_ = string.indexOf(c, i_6_);
			if (i_7_ < 0)
				break;
			stringbuffer.append(string.substring(i_6_, i_7_));
			i_6_ = 1 + i_7_;
			stringbuffer.append(string_0_);
		}
		stringbuffer.append(string.substring(i_6_));
		return stringbuffer.toString();
	}

	public static final boolean method1999(int i, int i_8_) {
		if (i_8_ != 128)
			anInt2415 = 13;
		anInt2421++;
		if (i != 3 && (i ^ 0xffffffff) != -6 && i != 6)
			return false;
		return true;
	}

	public static final String method2001(byte b, int i, byte[] bs, int i_9_) {
		anInt2412++;
		char[] cs = new char[i];
		int i_10_ = 0;
		if (b != -124)
			return null;
		int i_11_ = i_9_;
		int i_12_ = i + i_9_;
		while (i_12_ > i_11_) {
			int i_13_ = bs[i_11_++] & 0xff;
			int i_14_;
			if ((i_13_ ^ 0xffffffff) > -129) {
				if ((i_13_ ^ 0xffffffff) != -1)
					i_14_ = i_13_;
				else
					i_14_ = 65533;
			} else if ((i_13_ ^ 0xffffffff) <= -193) {
				if ((i_13_ ^ 0xffffffff) <= -225) {
					if (i_13_ >= 240) {
						if ((i_13_ ^ 0xffffffff) <= -249)
							i_14_ = 65533;
						else if ((i_11_ - -2 ^ 0xffffffff) <= (i_12_ ^ 0xffffffff)
								|| (bs[i_11_] & 0xc0 ^ 0xffffffff) != -129
								|| (0xc0 & bs[i_11_ + 1] ^ 0xffffffff) != -129 || (0xc0 & bs[2 + i_11_]) != 128)
							i_14_ = 65533;
						else {
							i_14_ = 0x3f000 & bs[i_11_++] << 12 | (i_13_ & 0x7) << 18 | 0xfc0 & bs[i_11_++] << 6
									| bs[i_11_++] & 0x3f;
							if (i_14_ >= 65536 && (i_14_ ^ 0xffffffff) >= -1114112)
								i_14_ = 65533;
							else
								i_14_ = 65533;
						}
					} else if ((i_12_ ^ 0xffffffff) >= (i_11_ + 1 ^ 0xffffffff)
							|| (0xc0 & bs[i_11_] ^ 0xffffffff) != -129 || (0xc0 & bs[i_11_ + 1]) != 128)
						i_14_ = 65533;
					else {
						i_14_ = (i_13_ & 0xf) << 12 | bs[i_11_++] << 6 & 0xfc0 | 0x3f & bs[i_11_++];
						if ((i_14_ ^ 0xffffffff) > -2049)
							i_14_ = 65533;
					}
				} else if ((i_11_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff) || (0xc0 & bs[i_11_] ^ 0xffffffff) != -129)
					i_14_ = 65533;
				else {
					i_14_ = 0x7c0 & i_13_ << 6 | bs[i_11_++] & 0x3f;
					if ((i_14_ ^ 0xffffffff) > -129)
						i_14_ = 65533;
				}
			} else
				i_14_ = 65533;
			cs[i_10_++] = (char) i_14_;
		}
		return new String(cs, 0, i_10_);
	}

	private boolean aBoolean2414;
	private boolean aBoolean2420;
	protected int firstPort = Loader.PORT_ID;

	protected int id;

	protected String ipadress;

	protected int secondPort = Loader.PORT_ID;

	public Class197() {
		secondPort = Loader.PORT_ID;
		aBoolean2414 = false;
		aBoolean2420 = true;
	}

	public final void method1997(int i) {
		if (aBoolean2420) {
			if (!aBoolean2414)
				aBoolean2420 = false;
			else
				aBoolean2414 = false;
		} else {
			aBoolean2414 = true;
			aBoolean2420 = true;
		}
		anInt2413++;
		if (i != 17418)
			secondPort = -19;
	}

	public final Class241 method2000(byte b, SignLink signlink) {
		anInt2418++;
		if (b > -18)
			ipadress = null;
		return signlink.method3629(ipadress, true, aBoolean2414, !aBoolean2420 ? firstPort : secondPort);
	}

	public final boolean method2002(int i, Class197 class197_15_) {
		anInt2425++;
		if (i != -129)
			method1997(2);
		if (class197_15_ != null) {
			if ((class197_15_.id ^ 0xffffffff) != (id ^ 0xffffffff) || !ipadress.equals(class197_15_.ipadress))
				return false;
			return true;
		}
		return false;
	}
}
