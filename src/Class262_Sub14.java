


/* Class262_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub14 extends Class262 {
	public static float aFloat7810;
	public static int anInt7807;
	public static int anInt7809;
	public static int[] anIntArray7813 = new int[1000];

	public static void method3186(byte b) {
		if (b != -114)
			method3186((byte) 45);
		anIntArray7813 = null;
	}

	public static final void method3187(byte b, int i, int i_0_) {
		if (b >= 102) {
			anInt7807++;
			CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 12, i_0_);
			cachenode_sub2.method2288(0);
			cachenode_sub2.itemId = i;
		}
	}

	private int anInt7808;
	private int anInt7811;

	private int anInt7812;

	private int anInt7814;

	Class262_Sub14(BufferedStream buffer) {
		super(buffer);
		anInt7808 = buffer.readUnsignedShort();
		anInt7811 = buffer.readUnsignedByte();
		anInt7812 = buffer.readUnsignedByte();
		anInt7814 = buffer.readUnsignedByte();
	}

	@Override
	public final void method3148(int i) {
		if (i > -102)
			method3148(-1);
		anInt7809++;
		Class105.method1116(anInt7808, anInt7814, anInt7812, (byte) -119, 0, anInt7811, false);
	}
}
