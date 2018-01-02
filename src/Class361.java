



/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class361 {

	public static Class191 aClass191_4486;
	public static int anInt4483;
	public static int anInt4484;
	public static int anInt4489;

	public static KeyStrokeHandler keyStrokeHandler;

	public static final boolean method4045(int i, byte[] bs) {
		anInt4484++;
		BufferedStream buffer = new BufferedStream(bs);
		int i_0_ = buffer.readUnsignedByte();
		if (i_0_ != i)
			return false;
		boolean bool = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
		if (bool)
			Class160.method1729(0, buffer);
		Node_Sub38_Sub36.method2904(-1, buffer);
		return true;
	}

	public static final void method4046(int i, int i_1_, int i_2_) {
		anInt4489++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 16, i_1_);
		if (i != 2)
			aClass191_4486 = null;
		cachenode_sub2.method2288(0);
		cachenode_sub2.itemId = i_2_;
	}

	public static void method4048(byte b) {
		aClass191_4486 = null;
		if (b != 4)
			aClass191_4486 = null;
	}

	public static final KeyStrokes setKeyStrokeHandler(int i, Component component) {
		anInt4483++;
		if (i != 2)
			aClass191_4486 = null;
		keyStrokeHandler = new KeyStrokeHandler(component);
		return keyStrokeHandler;
	}

	protected long aLong4488;

	protected int[] anIntArray4482;

	protected short[] aShortArray4485;

	protected short[] aShortArray4487;

	protected Class361() {
		/* empty */
	}

	Class361(long l, int[] is, short[] ses, short[] ses_3_) {
		aShortArray4485 = ses_3_;
		anIntArray4482 = is;
		aShortArray4487 = ses;
		aLong4488 = l;
	}
}
