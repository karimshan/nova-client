



/* Class42_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class42_Sub2 extends Class42 {
	private static Interface5 anInterface5_5558;

	public static void method457() {
		anInterface5_5558 = null;
	}

	private int anInt5557;

	Class42_Sub2(SignLink signlink, int i) {
		anInterface5_5558 = (Interface5) signlink.method3626((byte) 94);
		anInt5557 = i;
	}

	@Override
	public final void method442() {
		anInterface5_5558.method15(anInt5557, (byte) 126);
	}

	@Override
	public final int method446() {
		return anInterface5_5558.method12(anInt5557, 94);
	}

	@Override
	public final void method447(int i) throws Exception {
		if (i > 32768)
			throw new IllegalArgumentException();
		anInterface5_5558.method13(i, anInt5557, 65535);
	}

	@Override
	public final void method449() {
		anInterface5_5558.method16(anInt5557, anIntArray642);
	}

	@Override
	public final void method452(Component component) throws Exception {
		anInterface5_5558.method14(Class365.anInt4523, DrawableModel.aBoolean913, component, (byte) -100);
	}

	@Override
	public final void method455() {
		anInterface5_5558.method17(anInt5557, true);
	}
}
