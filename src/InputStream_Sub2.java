



/* InputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.io.InputStream;

public class InputStream_Sub2 extends InputStream {
	public static Class281 aClass281_83;
	public static int anInt79;
	public static int anInt80;
	public static int anInt82;
	public static int[] anIntArray81 = new int[3];

	public static final void method128(int i) {
		if (!Class93.graphicsToolkit.l())
			GlobalMessage.method300(Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false), true, false);
		else {
			Class93.graphicsToolkit.b(Node_Sub38_Sub20.aCanvas10309);
			Class150_Sub1.method1657(true);
			if (Class71.aBoolean967)
				Node_Sub54.method2982(-106, Node_Sub38_Sub20.aCanvas10309);
			else {
				Dimension dimension = Node_Sub38_Sub20.aCanvas10309.getSize();
				Class93.graphicsToolkit.b(Node_Sub38_Sub20.aCanvas10309, dimension.width, dimension.height);
			}
			Class93.graphicsToolkit.a(Node_Sub38_Sub20.aCanvas10309);
		}
		if (i != 30000)
			aClass281_83 = null;
		anInt79++;
		Class320_Sub21.method3764(-114);
		Class194_Sub1.aBoolean6892 = true;
	}

	public static final boolean method129(int i) {
		Class175.anInt2097++;
		anInt82++;
		Animable_Sub1_Sub2.aBoolean10649 = true;
		if (i != -1)
			anIntArray81 = null;
		return true;
	}

	public static void method130(int i) {
		aClass281_83 = null;
		if (i == 30000)
			anIntArray81 = null;
	}

	InputStream_Sub2() {
		/* empty */
	}

	@Override
	public final int read() {
		Class262_Sub22.method3208(30000L, false);
		anInt80++;
		return -1;
	}
}