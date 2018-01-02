


/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MainFile {
	public static IncomingPacket aClass192_136 = new IncomingPacket(98, 6);
	public static float aFloat144;
	public static int anInt138;
	public static int anInt140;
	public static int anInt141;
	public static int anInt142;
	public static int anInt145;
	public static int anInt147;
	public static int anInt148;
	public static int[] anIntArray135 = new int[2];
	public static int[] anIntArray146 = new int[3];

	public static final void method174(byte b) {
		Class315.aClass61_4031.method608(false);
		anInt141++;
		@SuppressWarnings("unused")
		int i = -61 / ((-52 - b) / 45);
	}

	public static final void method175(byte[] bs, boolean bool) {
		if (bool == true) {
			anInt142++;
			BufferedStream buffer = new BufferedStream(bs);
			for (;;) {
				int i = buffer.readUnsignedByte();
				if ((i ^ 0xffffffff) == -1)
					break;
				if ((i ^ 0xffffffff) == -2) {
					int i_0_ = buffer.readUnsignedShort();
					if (Class317.anInt4038 == -1)
						Class317.anInt4038 = i_0_;
				}
			}
		}
	}

	public static void method178(int i) {
		anIntArray135 = null;
		anIntArray146 = null;
		aClass192_136 = null;
		if (i <= 14)
			aFloat144 = -1.2132012F;
	}

	private int anInt139 = 65000;

	private SeekableFile aSeekableFile134 = null;

	private SeekableFile aSeekableFile137 = null;

	private int currentCache;

	MainFile(int i, SeekableFile seekablefile, SeekableFile seekablefile_24_, int i_25_) {
		aSeekableFile137 = seekablefile_24_;
		currentCache = i;
		anInt139 = i_25_;
		aSeekableFile134 = seekablefile;
	}

	public final byte[] get(int archiveId) {
		anInt145++;
		synchronized (aSeekableFile134) {
			try {
				if ((aSeekableFile137.length(-1) ^ 0xffffffffffffffffL) > (archiveId * 6 - -6 ^ 0xffffffffffffffffL))
					return null;
				aSeekableFile137.seek(archiveId * 6, false);
				aSeekableFile137.read(-63, 6, Class157.aByteArray1973, 0);
				int archiveLength = ((0xff & Class157.aByteArray1973[1]) << 8)
						+ ((0xff0000 & Class157.aByteArray1973[0] << 16) + (0xff & Class157.aByteArray1973[2]));
				int sector = (Class157.aByteArray1973[5] & 0xff)
						+ (((0xff & Class157.aByteArray1973[4]) << 8) + ((0xff & Class157.aByteArray1973[3]) << 16));
				if (archiveLength < 0 || archiveLength > anInt139)
					return null;
				if ((sector ^ 0xffffffff) >= -1 || aSeekableFile134.length(-1) / 520L < sector)
					return null;
				byte[] bs = new byte[archiveLength];
				int readBytesCount = 0;

				int total = 0;
				while ((archiveLength ^ 0xffffffff) < (readBytesCount ^ 0xffffffff)) {
					if (sector == 0)
						return null;
					aSeekableFile134.seek(sector * 520, false);
					int unread = archiveLength - readBytesCount;
					int currentArchive;
					int i_10_;
					int nextSector;
					int storeId;
					int header_len;
					if (archiveId > 65535) {
						if ((unread) > 510)
							unread = 510;
						header_len = 10;
						aSeekableFile134.read(-92, unread + header_len, Class157.aByteArray1973, 0);
						currentArchive = ((Class157.aByteArray1973[0] & 0xff) << 24)
								+ ((Class157.aByteArray1973[1] & 0xff) << 16)
								+ ((Class157.aByteArray1973[2] & 0xff) << 8) + (Class157.aByteArray1973[3] & 0xff);
						i_10_ = (Class157.aByteArray1973[5] & 0xff) + ((0xff & Class157.aByteArray1973[4]) << 8);
						nextSector = (Class157.aByteArray1973[7] << 8 & 0xff00)
								+ ((Class157.aByteArray1973[6] << 16 & 0xff0000) + (Class157.aByteArray1973[8] & 0xff));
						storeId = 0xff & Class157.aByteArray1973[9];
					} else {
						if ((unread) > 512)
							unread = 512;
						header_len = 8;
						aSeekableFile134.read(-92, unread + header_len, Class157.aByteArray1973, 0);
						currentArchive = ((Class157.aByteArray1973[0] & 0xff) << 8)
								+ (Class157.aByteArray1973[1] & 0xff);
						i_10_ = (Class157.aByteArray1973[3] & 0xff) + ((0xff & Class157.aByteArray1973[2]) << 8);
						nextSector = (Class157.aByteArray1973[5] << 8 & 0xff00)
								+ ((Class157.aByteArray1973[4] << 16 & 0xff0000) + (Class157.aByteArray1973[6] & 0xff));
						storeId = 0xff & Class157.aByteArray1973[7];
					}
					if (archiveId != currentArchive || (total) != (i_10_) || (storeId) != (currentCache))
						return null;
					if (nextSector < 0 || nextSector > aSeekableFile134.length(-1) / 520L)
						return null;
					total++;
					int i_u = unread + header_len;
					for (int i = header_len; i < i_u; i++)
						bs[readBytesCount++] = Class157.aByteArray1973[i];
					// for (int i_13_ = 0; unread > i_13_; i_13_++)
					// bs[readBytesCount++] = Class157.aByteArray1973[8 +
					// i_13_];
					sector = nextSector;
				}
				return bs;
			} catch (java.io.IOException ioexception) {
				return null;
			}
		}
	}

	public final boolean method176(int i, byte[] bs, int i_1_, boolean bool) {
		anInt140++;
		synchronized (aSeekableFile134) {
			if ((i ^ 0xffffffff) > -1 || i > anInt139)
				throw new IllegalArgumentException();
			boolean bool_2_ = method179(bs, 11233, i_1_, i, bool);
			if (!bool_2_)
				bool_2_ = method179(bs, 11233, i_1_, i, false);
			return bool_2_;
		}
	}

	private final boolean method179(byte[] bs, int i, int archiveId, int i_15_, boolean bool) {
		anInt147++;
		synchronized (aSeekableFile134) {
			try {
				int i_16_;
				if (bool) {
					if ((aSeekableFile137.length(-1) ^ 0xffffffffffffffffL) > (6 + archiveId * 6 ^ 0xffffffffffffffffL))
						return false;
					aSeekableFile137.seek(archiveId * 6, false);
					aSeekableFile137.read(i + -11299, 6, Class157.aByteArray1973, 0);
					i_16_ = (0xff & Class157.aByteArray1973[5]) + ((0xff0000 & Class157.aByteArray1973[3] << 16)
							- -(Class157.aByteArray1973[4] << 8 & 0xff00));
					if (i_16_ <= 0 || aSeekableFile134.length(-1) / 520L < i_16_)
						return false;
				} else {
					i_16_ = (int) ((519L + aSeekableFile134.length(-1)) / 520L);
					if (i_16_ == 0)
						i_16_ = 1;
				}
				Class157.aByteArray1973[3] = (byte) (i_16_ >> 16);
				Class157.aByteArray1973[2] = (byte) i_15_;
				Class157.aByteArray1973[0] = (byte) (i_15_ >> 16);
				Class157.aByteArray1973[1] = (byte) (i_15_ >> 8);
				Class157.aByteArray1973[5] = (byte) i_16_;
				Class157.aByteArray1973[4] = (byte) (i_16_ >> 8);
				aSeekableFile137.seek(archiveId * 6, false);
				aSeekableFile137.method3570(5033, 0, 6, Class157.aByteArray1973);
				int i_17_ = 0;
				int i_18_ = 0;
				while (i_17_ < i_15_) {
					int i_19_ = 0;
					if (bool) {
						aSeekableFile134.seek(i_16_ * 520, false);
						int currentArchive;
						int i_21_;
						int i_22_;

						if (archiveId > 65535) {
							try {
								aSeekableFile134.read(-116, 10, Class157.aByteArray1973, 0);
							} catch (java.io.EOFException eofexception) {
								break;
							}
							currentArchive = (0xff & Class157.aByteArray1973[3])
									+ ((0xff & Class157.aByteArray1973[2]) << 8)
									+ ((0xff & Class157.aByteArray1973[1]) << 16)
									+ ((0xff & Class157.aByteArray1973[0]) << 24);
							i_21_ = (Class157.aByteArray1973[5] & 0xff) + (Class157.aByteArray1973[4] << 8 & 0xff00);
							i_19_ = (0xff & Class157.aByteArray1973[8]) + (((0xff & Class157.aByteArray1973[6]) << 16)
									- -((0xff & Class157.aByteArray1973[7]) << 8));
							i_22_ = Class157.aByteArray1973[9] & 0xff;
						} else {
							try {
								aSeekableFile134.read(-116, 8, Class157.aByteArray1973, 0);
							} catch (java.io.EOFException eofexception) {
								break;
							}
							currentArchive = (0xff & Class157.aByteArray1973[1])
									+ ((0xff & Class157.aByteArray1973[0]) << 8);
							i_21_ = (Class157.aByteArray1973[3] & 0xff) + (Class157.aByteArray1973[2] << 8 & 0xff00);
							i_19_ = (0xff & Class157.aByteArray1973[6]) + (((0xff & Class157.aByteArray1973[4]) << 16)
									- -((0xff & Class157.aByteArray1973[5]) << 8));
							i_22_ = Class157.aByteArray1973[7] & 0xff;
						}

						if (archiveId != currentArchive || (i_18_) != (i_21_) || i_22_ != currentCache)
							return false;
						if ((i_19_ ^ 0xffffffff) > -1 || (aSeekableFile134.length(i + -11234) / 520L
								^ 0xffffffffffffffffL) > (i_19_ ^ 0xffffffffffffffffL))
							return false;
					}
					if ((i_19_ ^ 0xffffffff) == -1) {
						bool = false;
						i_19_ = (int) ((519L + aSeekableFile134.length(i + -11234)) / 520L);
						if ((i_19_ ^ 0xffffffff) == -1)
							i_19_++;
						if ((i_19_ ^ 0xffffffff) == (i_16_ ^ 0xffffffff))
							i_19_++;
					}
					if (archiveId > 65535) {
						if ((i_15_ + -i_17_ ^ 0xffffffff) >= -511)
							i_19_ = 0;

						Class157.aByteArray1973[0] = (byte) (archiveId >> 24);

						Class157.aByteArray1973[1] = (byte) (archiveId >> 16);
						Class157.aByteArray1973[2] = (byte) (archiveId >> 8);
						Class157.aByteArray1973[3] = (byte) archiveId;

						Class157.aByteArray1973[4] = (byte) (i_18_ >> 8);
						Class157.aByteArray1973[5] = (byte) i_18_;
						Class157.aByteArray1973[6] = (byte) (i_19_ >> 16);
						Class157.aByteArray1973[7] = (byte) (i_19_ >> 8);
						Class157.aByteArray1973[8] = (byte) i_19_;
						Class157.aByteArray1973[9] = (byte) currentCache;
						aSeekableFile134.seek(520 * i_16_, false);
						aSeekableFile134.method3570(5033, 0, 10, Class157.aByteArray1973);
						int i_23_ = -i_17_ + i_15_;
						if ((i_23_ ^ 0xffffffff) < -511)
							i_23_ = 510;
						aSeekableFile134.method3570(5033, i_17_, i_23_, bs);
						i_17_ += i_23_;
					} else {
						if ((i_15_ + -i_17_ ^ 0xffffffff) >= -513)
							i_19_ = 0;
						Class157.aByteArray1973[3] = (byte) i_18_;
						Class157.aByteArray1973[2] = (byte) (i_18_ >> 8);
						Class157.aByteArray1973[1] = (byte) archiveId;
						Class157.aByteArray1973[0] = (byte) (archiveId >> 8);
						Class157.aByteArray1973[4] = (byte) (i_19_ >> 16);
						Class157.aByteArray1973[5] = (byte) (i_19_ >> 8);
						Class157.aByteArray1973[6] = (byte) i_19_;
						Class157.aByteArray1973[7] = (byte) currentCache;
						aSeekableFile134.seek(520 * i_16_, false);
						aSeekableFile134.method3570(5033, 0, 8, Class157.aByteArray1973);
						int i_23_ = -i_17_ + i_15_;
						if ((i_23_ ^ 0xffffffff) < -513)
							i_23_ = 512;
						aSeekableFile134.method3570(5033, i_17_, i_23_, bs);
						i_17_ += i_23_;

					}
					i_16_ = i_19_;
					i_18_++;
				}
				return true;
			} catch (java.io.IOException ioexception) {
				return false;
			}
		}
	}

	@Override
	public final String toString() {
		anInt138++;
		return "Cache:" + currentCache;
	}
}
