


/* Class320_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub25 extends Class320 {
	public static int anInt8445;
	public static int anInt8446;
	public static int anInt8447;
	public static int anInt8448;
	public static int anInt8449;

	Class320_Sub25(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}

	Class320_Sub25(Node_Sub27 node_sub27) {
		super(node_sub27);
	}

	@Override
	public final void method3673(byte b) {
		if ((anInt4064 ^ 0xffffffff) > -1 && (anInt4064 ^ 0xffffffff) < -128)
			anInt4064 = method3677(0);
		anInt8447++;
		if (b <= -35) {
			/* empty */
		}
	}

	@Override
	public final int method3675(int i, byte b) {
		if (b != 54)
			return 73;
		anInt8445++;
		return 1;
	}

	@Override
	public final void method3676(boolean bool, int i) {
		anInt8446++;
		anInt4064 = i;
		if (bool == false) {
			/* empty */
		}
	}

	@Override
	public final int method3677(int i) {
		anInt8449++;
		if (i != 0)
			return 25;
		return 127;
	}

	public final int method3776(boolean bool) {
		anInt8448++;
		if (bool != false)
			method3675(60, (byte) -5);
		return anInt4064;
	}
}
