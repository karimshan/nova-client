



/* GraphicsBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

abstract class GraphicsBuffer extends Node {
	public static int anInt7141;
	public static int anInt7143;
	public static int anInt7144;

	public static final boolean method2596(int i, int i_1_, int i_2_) {
		anInt7143++;
		if (i != -1)
			return true;
		return Class144_Sub2.method1634(i_2_, i_1_, false) & Node_Sub9_Sub4.method2522(i ^ 0xffffffff, i_1_, i_2_);
	}

	public static final boolean method2598(int i, int i_8_, int i_9_) {
		if (i != 2048)
			return true;
		anInt7141++;
		if ((i_8_ & 0x800 ^ 0xffffffff) == -1 || (i_9_ & 0x37) == 0)
			return false;
		return true;
	}

	protected int anInt7142;

	protected int anInt7146;

	protected int[] anIntArray7145;

	public GraphicsBuffer() {
		/* empty */
	}

	abstract void method2595(boolean bool, int i, int i_0_, java.awt.Canvas canvas);

	abstract void method2597(int i, int i_3_, int i_4_, boolean bool, Graphics graphics, int i_5_, int i_6_, int i_7_);
}
