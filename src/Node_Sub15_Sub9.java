


/* Node_Sub15_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub9 extends Node_Sub15 {
	public static Class257 aClass257_9838 = new Class257(0, 4);
	public static Class346 aClass346_9842 = new Class346();
	public static int anInt9833;
	public static int anInt9836;
	public static int anInt9839;
	public static int anInt9841;
	public static Interface6 anInterface6_9843;

	public static final void method2576(byte b, int i, int i_0_) {
		anInt9841++;
		if (b == 26) {
			CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(b ^ 0x19, 7, i_0_);
			cachenode_sub2.method2288(b + -26);
			cachenode_sub2.itemId = i;
		}
	}

	public static void method2577(int i) {
		aClass346_9842 = null;
		aClass257_9838 = null;
		if (i != 11)
			anInt9839 = -118;
		anInterface6_9843 = null;
	}

	private int anInt9834;
	private int anInt9835;

	private int anInt9837;

	private int anInt9840;

	Node_Sub15_Sub9() {
		/* empty */
	}

	@Override
	public final void method2554(int i, BufferedStream buffer) {
		anInt9836++;
		anInt9834 = buffer.readInt();
		anInt9835 = buffer.readInt();
		anInt9840 = buffer.readUnsignedByte();
		anInt9837 = buffer.readUnsignedByte();
		if (i != 29147)
			method2554(120, null);
	}

	@Override
	public final void method2556(ClanChat clanchat, int i) {
		if (i != 16)
			anInt9839 = 120;
		clanchat.method504(anInt9837, anInt9840, anInt9835, anInt9834, 11226);
		anInt9833++;
	}
}
