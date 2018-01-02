


/* CacheNode_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClientScript extends CacheNode {
	public static boolean aBoolean9510 = false;
	public static Class216 aClass216_9498;
	public static int anInt9496;
	public static int anInt9509;
	public static int anInt9513;

	public static final void method2321(int i, IComponentDefinitions widget) {
		if (widget.anInt4824 == Node_Sub12.anInt5453)
			Login.aBooleanArray2387[widget.anInt4703] = true;
		anInt9509++;
		if (i != -1)
			method2321(122, null);
	}

	public static final boolean method2322(int i, int i_0_, int i_1_) {
		if (i < 41)
			return false;
		anInt9513++;
		if ((0x400 & i_0_ ^ 0xffffffff) == -1)
			return false;
		return true;
	}

	public static void method2323(int i) {
		@SuppressWarnings("unused")
		int i_2_ = 28 % ((-48 - i) / 36);
		aClass216_9498 = null;
	}

	protected Class212 aClass212_9505;
	protected HashTable[] aHashTableArray9503;
	protected int anInt9499;
	protected int anInt9502;
	protected int anInt9506;
	protected int anInt9507;
	protected int anInt9511;
	protected int anInt9512;
	protected int[] intValues;
	protected long[] longValues;

	protected String name;

	protected int[] opcodes;

	protected String[] stringValues;
}
