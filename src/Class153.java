


/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class153 {
	public static IncomingPacket TILE_MESSAGE = new IncomingPacket(32, -1);
	public static IncomingPacket aClass192_1946 = new IncomingPacket(95, 6);
	public static HashTable aHashTable1947 = new HashTable(32);
	public static int anInt1943;
	public static int anInt1944;
	public static int[] anIntArray1948;

	public static void method1696(byte b) {
		if (b <= -77) {
			aHashTable1947 = null;
			anIntArray1948 = null;
			aClass192_1946 = null;
			TILE_MESSAGE = null;
		}
	}

	public static final boolean method1697(int i, int i_0_, int i_1_) {
		if (i != 95)
			return false;
		anInt1944++;
		return Class377.method4127(i_0_, -31997, i_1_) & ClanChat.method494((byte) 14, i_1_, i_0_);
	}
}
