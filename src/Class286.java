


/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class286 {
	public static IncomingPacket aClass192_3602 = new IncomingPacket(104, 8);
	public static GLSprite aGLSprite3604;
	public static int anInt3601;
	public static int anInt3603;

	public static final void method3393(Object[] objects, byte b, long[] ls, int i, int i_0_) {
		if ((i ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
			int i_1_ = (i + i_0_) / 2;
			int i_2_ = i;
			long l = ls[i_1_];
			ls[i_1_] = ls[i_0_];
			ls[i_0_] = l;
			Object object = objects[i_1_];
			objects[i_1_] = objects[i_0_];
			objects[i_0_] = object;
			int i_3_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_4_ = i; i_0_ > i_4_; i_4_++)
				if (l - -(long) (i_4_ & i_3_) > ls[i_4_]) {
					long l_5_ = ls[i_4_];
					ls[i_4_] = ls[i_2_];
					ls[i_2_] = l_5_;
					Object object_6_ = objects[i_4_];
					objects[i_4_] = objects[i_2_];
					objects[i_2_++] = object_6_;
				}
			ls[i_0_] = ls[i_2_];
			ls[i_2_] = l;
			objects[i_0_] = objects[i_2_];
			objects[i_2_] = object;
			method3393(objects, (byte) -101, ls, i, i_2_ - 1);
			method3393(objects, (byte) -42, ls, 1 + i_2_, i_0_);
		}
		anInt3603++;
		if (b >= -19)
			aGLSprite3604 = null;
	}

	public static void method3394(byte b) {
		if (b == 49) {
			aClass192_3602 = null;
			aGLSprite3604 = null;
		}
	}

	public static final void method3395(int i, IComponentDefinitions widget) {
		if ((widget.type ^ 0xffffffff) == -6 && (widget.anInt4718 ^ 0xffffffff) != 0)
			Node_Sub38.method2779(widget, 28564, Class93.graphicsToolkit);
		if (i == 1)
			anInt3601++;
	}
}
